import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.UUID;
@MultipartConfig
public class UpFileServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         response.setCharacterEncoding("utf-8");
         response.setContentType("text/html");
        Part img=request.getPart("file");
        UUID uuid=UUID.randomUUID();
        img.write("D:\\"+uuid+img.getSubmittedFileName());
        PrintWriter writer=response.getWriter();
        writer.println("上传成功");
    }
}
