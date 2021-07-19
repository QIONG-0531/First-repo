package utils;

import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

/**
 * 统一的信息类
 */
public class ResultJSONUtils {
    public static void write(HttpServletResponse response,String str) throws IOException {
        response.setCharacterEncoding("utf-8");
        response.setContentType("application/json");
        PrintWriter writer=response.getWriter();
        writer.println(str);
    }
    public static void writeJSON(HttpServletResponse response, HashMap<String,Object> map) throws IOException {
        response.setCharacterEncoding("utf-8");
        response.setContentType("application/json");
        PrintWriter writer=response.getWriter();
        ObjectMapper mapper=new ObjectMapper();
        String result=mapper.writeValueAsString(map);
        writer.println(result);
    }
}
