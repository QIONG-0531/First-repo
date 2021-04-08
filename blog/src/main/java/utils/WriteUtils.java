package utils;

import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

public class WriteUtils {
    public static void write(HttpServletResponse response,String str) throws IOException {
        response.setCharacterEncoding("utf-8");
        response.setContentType("applicaton/json");
        PrintWriter writer=response.getWriter();
        writer.println(str);
    }
    public static void writeMap(HttpServletResponse response, HashMap<String,Object>map) throws IOException {
        response.setCharacterEncoding("utf-8");
        response.setContentType("applicaton/json");
        PrintWriter writer=response.getWriter();
        ObjectMapper mapper=new ObjectMapper();
        writer.println(mapper.writeValueAsString(map));
    }
}
