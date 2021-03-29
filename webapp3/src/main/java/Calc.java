import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Calc extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html");
        Integer num1=Integer.parseInt(req.getParameter("num1"));
        Integer num2=Integer.parseInt(req.getParameter("num2"));
        Integer total=num1+num2;
        PrintWriter writer=resp.getWriter();
        writer.println("<h1>计算结果为:"+total+"</h1>");
    }
}
