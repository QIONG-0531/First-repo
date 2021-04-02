import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          response.setCharacterEncoding("utf-8");
          response.setContentType("text/html");
          String username=request.getParameter("username");
          String pwd=request.getParameter("pwd");
          PrintWriter writer=response.getWriter();
          if(username.equals("root")&& pwd.equals("root")){
           //writer.println("登录成功");
              response.sendRedirect("http://www.baidu.com");
          }else{
              writer.println("登录失败");
          }
    }
}
