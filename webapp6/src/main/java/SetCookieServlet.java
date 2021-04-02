import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.Principal;

public class SetCookieServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         response.setCharacterEncoding("utf-8");
         response.setContentType("text/html");
         //创建Cookie
         Cookie usernameCookie=new Cookie("username","java");
         //设置Cookie的最大存活时间
        usernameCookie.setMaxAge(60);
        //用来告诉客户端存储Cookie信息
        response.addCookie(usernameCookie);
        //提示用户Cookie存储成功
        PrintWriter writer=response.getWriter();
        writer.println("<h1>Cookie存储成功</h1>");

    }
}
