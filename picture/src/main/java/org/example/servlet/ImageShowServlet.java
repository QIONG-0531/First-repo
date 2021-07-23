package org.example.servlet;

import org.example.dao.ImageDAO;
import org.example.model.Image;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashSet;
import java.util.Set;

@WebServlet("/imageShow")
public class ImageShowServlet extends HttpServlet {

    private static final Set<String> whiteList = new HashSet<>();

    static {//白名单允许获取图片内容
        whiteList.add("http://localhost:8082/java_image_server/");
        whiteList.add("http://localhost:8082/java_image_server/index.html");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String referer = req.getHeader("Referer");
        if(!whiteList.contains(referer)){//白名单不包含当前请求的Referer，不允许访问
            resp.setStatus(403);
            //还可以设置响应体数据
            return;
        }
        //1解析请求数据：imageId
        String id = req.getParameter("imageId");
        //2业务处理：（1）根据id查图片path字段（2）通过path找本地图片文件
        Image image = ImageDAO.queryOne(Integer.parseInt(id));
        //图片是以二进制数据放在body，同时要指定Content-Type
        resp.setContentType(image.getContentType());
        //本地图片的绝对路径
        String path = ImageServlet.IMAGE_DIR + image.getPath();
        //io输入流读文件
        FileInputStream fis = new FileInputStream(path);
        //3返回响应：服务器本地图片的二进制数据
        OutputStream os = resp.getOutputStream();//输出流都是输出到body
        byte[] bytes = new byte[1024*8];
        int len;
        while((len=fis.read(bytes)) != -1){
            os.write(bytes, 0, len);
        }
        os.flush();
        fis.close();
        os.close();
    }
}
