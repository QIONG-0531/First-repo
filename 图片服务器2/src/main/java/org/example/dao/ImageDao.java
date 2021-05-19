package org.example.dao;

import org.example.exception.AppException;
import org.example.model.Image;
import org.example.util.Util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ImageDao {
    public static int queryCount(String md5) {
        Connection c=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        try{
            c= Util.getConnection();
            String sql="select count(image_id)  c from image_table where md5=?";
            ps=c.prepareStatement(sql);
            ps.setString(1,md5);
            rs=ps.executeQuery();
            rs.next();
            return rs.getInt("c");

        }catch (SQLException e){
            throw new AppException("根据md5查询失败",e);
        }finally {
               Util.close(c,ps,rs);
        }
    }

    public static int insert(Image image) {
        Connection c=null;
        PreparedStatement ps=null;
        try{
            c=Util.getConnection();
            String sql="insert into image_table values(null,?,?,?,?,?,?)";
            ps=c.prepareStatement(sql);
            ps.setString(1,image.getImageName());
            ps.setLong(2,image.getSize());
            ps.setString(3,image.getUploadTime());
            ps.setString(4,image.getMd5());
            ps.setString(5,image.getContentType());
            ps.setString(6,image.getPath());
            return ps.executeUpdate();
        }catch (SQLException e){
            throw new AppException("图片新增失败",e);
        }finally {
            Util.close(c,ps);
        }
    }
}
