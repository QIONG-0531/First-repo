package models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class image {
    private int id;
    private String name;
    private long size;
    private String uploadTime;
    private String md5;
    private String contentType;
    private String path;
}
