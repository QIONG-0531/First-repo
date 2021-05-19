package org.example.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Image {
    private Integer imageId;
    private String imageName;
    private Long size;
    private String uploadTime;
    private String md5;
    private String contentType;
    private String path;
}
