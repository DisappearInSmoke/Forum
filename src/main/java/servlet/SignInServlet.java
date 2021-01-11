package servlet;

import org.apache.commons.codec.digest.DigestUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;

@WebServlet("/insert")
public class SignInServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        String name = req.getParameter("name");
        String password = DigestUtils.md5Hex(req.getParameter("password")).toUpperCase();
        String birthday = req.getParameter("birthday");
        String email = req.getParameter("email");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/BBS",
                    "Yang","12345678");
            String sql = "select user_name from users where user_name =?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1,name);
            ResultSet set = statement.executeQuery();
            if(set.next()){
                req.setAttribute("error","用户名已经存在");
                req.getRequestDispatcher("error.jsp").forward(req,resp);
            }else {
                sql ="insert into users(user_name,user_password,user_birthday,user_email) values(?,?,?,?)";
                System.out.println(sql);
                statement = connection.prepareStatement(sql);
                statement.setString(1,name);
                statement.setString(2,password);
                statement.setDate(3, Date.valueOf(birthday));
                statement.setString(4,email);
                statement.executeUpdate();
                req.getRequestDispatcher("login.jsp").forward(req,resp);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println();
    }
}
