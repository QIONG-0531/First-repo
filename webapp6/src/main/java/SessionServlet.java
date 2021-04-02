import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class SessionServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          response.setCharacterEncoding("utf-8");
          response.setContentType("text/html");
          PrintWriter writer=response.getWriter();
          //在此之前默认用户信息正确

          //操作session，尝试从客户端获取一个session，如果获取失败，就新创建一个session信息
        HttpSession session=request.getSession();
        String sessionId=session.getId();
        writer.println("<h1>欢迎访问</h1>");
        writer.println(String.format("seeionId:%s",sessionId));
        writer.println("<hr>");
        writer.println(String.format("session创建时间:%s <p></p>",new Date(session.getCreationTime())));
        writer.println(String.format("session结束时间:%s <p></p>",new Date(session.getLastAccessedTime())));
        //会话key值定义
         String sessionKey="countKey";
         if(session.isNew()||session.getAttribute(sessionKey)==null){
             session.setAttribute(sessionKey,1);
             writer.println("访问次数:"+1);
         }else{
             int count=(int)session.getAttribute(sessionKey);
             count++;
             session.setAttribute(sessionKey,count);
             writer.println("访问次数:"+count);
         }
    }
}
