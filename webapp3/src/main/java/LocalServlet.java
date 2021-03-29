import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class LocalServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html");
        String name=req.getParameter("name");
        String pwd=req.getParameter("pwd");
        if(name!=null && pwd!=null &&name.equals("root") && pwd.equals("root")){
//            resp.setStatus(301);
//            resp.setHeader("location","http://www.baidu.com");
            resp.sendRedirect("http://www.baidu.com");
        }else{
            PrintWriter writer=resp.getWriter();
            writer.println("<h1>输入用户名和密码错误</h1>");
        }
    }
}
