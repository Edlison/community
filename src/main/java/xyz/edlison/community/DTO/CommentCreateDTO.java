package xyz.edlison.community.DTO;

import lombok.Data;

@Data
public class CommentCreateDTO {//回复创建
    private Long parentId;
    private String content;
    private Integer type;
}
