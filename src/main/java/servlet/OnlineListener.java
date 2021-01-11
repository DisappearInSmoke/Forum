package servlet;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class OnlineListener implements HttpSessionListener {
    private int count = -1; // 用于统计在线人数
    @Override
    public void sessionCreated(HttpSessionEvent hse) {
        count++; // Session对象创建时count变量加1
        ServletContext context = hse.getSession().getServletContext();
        context.setAttribute("count", new Integer(count));
    }
    @Override
    public void sessionDestroyed(HttpSessionEvent hse) {
        count--; // session对象销毁时count变量减1
        ServletContext context = hse.getSession().getServletContext();
        context.setAttribute("count", new Integer(count));
    }
}
