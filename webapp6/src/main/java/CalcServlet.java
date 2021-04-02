import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class CalcServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
           this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            response.setCharacterEncoding("utf-8");
            response.setContentType("application/json");
            String num1=request.getParameter("num1");
            String num2=request.getParameter("num2");
            int total=Integer.parseInt(num1)+Integer.parseInt(num2);
            PrintWriter writer=response.getWriter();
            writer.println(" {\"total\":"+total+"}");
    }
}
