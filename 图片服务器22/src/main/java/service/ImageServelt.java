package service;

import dao.ImageDao;
import org.apache.commons.codec.digest.DigestUtils;
import utils.Utils;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.IOException;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

/**
 * 1.注解
 * 2.继承HttpServlet
 * 3.重写doXXX方法
 */

@WebServlet("/image")
@MultipartConfig
public class ImageServelt extends HttpServlet {

    private static final String IMAGE_DIR = "D:/PRICTURE";

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       try {
           //1.请求解析参数
           //form表单类型参数的获取
           Part p = req.getPart("uploadImage");
           // p.write("D:\\PRICTURE");//保存文件到服务器本地某个路径
           long size = p.getSize();//获取上传的文件大小
           String contentType = p.getContentType();//获取每个part的数据格式
           String name = p.getSubmittedFileName();//获取上传的文件名
           //图片上传时间，数据库保存的是字符串，所以用日期格式化类来转换
           Date date = new Date();
           DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
           String uploadTime = df.format(date);
           //获取上传文件的输入流（数据）
           InputStream is = p.getInputStream();
           //根据输入流转md5校验码
           String md5 = DigestUtils.md5Hex(is);

           //如果已上传该图片（相同的md5），就不能插入数据和保存到本地
           int res = ImageDao.queryCount(md5);
           if (res >= 1) {
               throw new RuntimeException("上传图片重复");
           }

           //2.根据请求数据完成业务处理
           //2.1保存上传图片为服务端本地文件
           p.write(IMAGE_DIR + "/" + md5);
           //2.2图片信息保存在数据库-->后续查询图片列表要用
       }catch (Exception e){
           e.printStackTrace();
           resp.setStatus(500);
       }

//        HashMap<String,Object> map=new HashMap<>();
//        map.put("size",size);
//        map.put("contentType",contentType);
//        map.put("name",name);
//        Utils.writeJSON(resp,map);

    }
}
