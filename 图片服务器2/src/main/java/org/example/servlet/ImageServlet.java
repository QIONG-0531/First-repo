package org.example.servlet;

import org.apache.commons.codec.digest.DigestUtils;
import org.example.dao.ImageDao;
import org.example.exception.AppException;
import org.example.model.Image;
import org.example.util.Util;

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
import java.util.Map;

@WebServlet("/image")
@MultipartConfig
public class ImageServlet extends HttpServlet {
    public static final String IMADE_DTR="D:\\PRICTURE";
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");
        Map<String,Object> map=new HashMap<>();
        //1.解析请求资源
        try{
            Part p=req.getPart("uploadImage");
            String name=p.getName();
            long size=p.getSize();
            String contentType=p.getContentType();
            //图片上传时间 格式化日期
            Date date=new Date();
            DateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String uploadTime=df.format(date);
            //获取图片输入流
            InputStream inputStream=p.getInputStream();
            //将输入流转为md5校验码
            String md5= DigestUtils.md5Hex(inputStream);
            //根据md5校验码查询上传的图片是否重复
            int n= ImageDao.queryCount(md5);
            if(n>=1){
                throw new AppException("上传图片重复");
            }

            //业务处理
            //1.保存图片为服务端本地文件，根据md5保存在本地
            p.write(IMADE_DTR+"/"+md5);//存入本地要写完整路径
            //2.将图片信息保存在数据库
            Image image=new Image();
            image.setImageName(name);
            image.setContentType(contentType);
            image.setMd5(md5);
            image.setSize(size1);
            image.setUploadTime(uploadTime);
            image.setPath("/"+md5);//相对路径，方便修改
            int k=ImageDao.insert(image);
            map.put("ok",true);
        }catch (Exception e){
            e.printStackTrace();
            map.put("ok",false);
            if(e instanceof AppException){
                map.put("msg",e.getMessage());
            }else{
                map.put("msg","未知错误");
            }
        }
        String json= Util.serialize(map);
        resp.getWriter().println(json);
    }
}
