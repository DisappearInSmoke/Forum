package servlet;

import dao.BBSDao;
import dao.BBSDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    private final BBSDao bbsDao = new BBSDaoImpl();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String password = req.getParameter("password");
        String userName = bbsDao.userLogin(name,password);
        if (userName == null){
            req.setAttribute("error","用户名或密码不正确");
            req.getRequestDispatcher("error.jsp").forward(req,resp);
        }else {
            HttpSession session = req.getSession();
            session.setAttribute("name",name);
            resp.sendRedirect("welcome.jsp");
        }
    }
}