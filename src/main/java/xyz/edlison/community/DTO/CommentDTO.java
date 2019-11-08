package xyz.edlison.community.DTO;

import lombok.Data;
import xyz.edlison.community.model.User;

@Data
public class CommentDTO {//回复内容
    private Long id;
    private Long parentId;
    private Integer type;
    private Long commentator;
    private Long gmtCreate;
    private Long gmtModified;
    private Long likeCount;
    private String content;
    private User  user;
}
