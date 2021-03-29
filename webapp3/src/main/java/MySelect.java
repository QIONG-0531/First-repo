import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MySelect extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取前端提交过来的参数
        String num1=req.getParameter("num1");
        //设置页面编码
        resp.setCharacterEncoding("utf-8");
        //设置返回的数据类型
        resp.setContentType("text/html");
        PrintWriter writer=resp.getWriter();
        writer.println("获得了一个参数"+num1);

    }
}
