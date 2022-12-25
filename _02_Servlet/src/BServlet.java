import javax.servlet.*;
import java.io.IOException;

/**
 * @program: Javaweb
 * @description:
 * @author: yuimorii
 * @create: 2022-12-25 13:15
 **/

public class BServlet implements Servlet {

    // 无参数构造方法
    public BServlet() {
        System.out.println("BServlet无参数构造方法执行了");
    }

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}