package servlet;

import dao.BBSDao;
import dao.BBSDaoImpl;
    import util.DbUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.sql.*;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    private final BBSDao bbsDao = new BBSDaoImpl();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //下面一段是用来取cookie，不管它是不是预先存在
        Cookie[] cookies = req.getCookies();
        String uNameInCookie = "";
        String tokenInCookie = "";
        if (cookies != null)
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("name"))
                    uNameInCookie = cookie.getValue();
                if (cookie.getName().equals("token"))
                    tokenInCookie = cookie.getValue();
            }
        //取cookie结束

        boolean remember = Boolean.parseBoolean(req.getParameter("remember"));

        if (!"".equals(uNameInCookie) && !"".equals(tokenInCookie)) {  //如果cookie存在就按照cookie方式登录
            try (Connection connection = DbUtil.getConnection()) {
                String sql = "select user_name from users where user_name = '" + uNameInCookie + "' and user_cookie = '" + tokenInCookie + "'";
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);
                if (resultSet.next()) {
                    HttpSession httpSession = req.getSession();
                    httpSession.setAttribute("name", uNameInCookie);
                    if (!remember) {
                        Cookie username = new Cookie("name", null);
                        username.setMaxAge(0);
                        Cookie token = new Cookie("token", null);
                        token.setMaxAge(0);
                        statement.executeUpdate("update users set user_cookie = null where user_name = '" + uNameInCookie + "'");
                        resp.addCookie(username);
                        resp.addCookie(token);
                    }
                    resp.sendRedirect("welcome.jsp");
                } else {
                    req.setAttribute("error", "Cookie无效");
                    req.getRequestDispatcher("error.jsp").forward(req, resp);
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        } else {  //如果cookie不存在就按照用户名密码方式登录
            String uName = req.getParameter("name");
            String uPassword = req.getParameter("password");

            try (Connection connection = DbUtil.getConnection()) {
                String sql = "select user_name from users where user_name = '" + uName + "' and user_password = '" + uPassword + "'";
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);
                if (resultSet.next()) {
                    HttpSession httpSession = req.getSession();
                    httpSession.setAttribute("name", uName);
                    if (remember) {
                        Cookie username = new Cookie("name", uName);
                        Cookie token = new Cookie("token", "1234567890");
                        statement.executeUpdate("update users set user_cookie = '1234567890' where user_name = '" + uName + "'");
                        resp.addCookie(username);
                        resp.addCookie(token);
                    }
                    resp.sendRedirect("welcome.jsp");
                } else {
                    req.setAttribute("error", "用户名和密码不正确");
                    req.getRequestDispatcher("error.jsp").forward(req, resp);
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        }
}