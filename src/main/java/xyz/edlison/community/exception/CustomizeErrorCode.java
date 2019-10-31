package xyz.edlison.community.exception;

public enum CustomizeErrorCode implements ICustomizeErrorCode {

    QUESTION_NOT_FOUND(2001, "问题不在了！"),
    TARGET_PARAM_NOT_FOUND(2002, "未选中问题或评论就进行回复！"),
    NO_LOGIN(2003, "当前未登录！"),
    SYS_ERROR(2004, "服务器出错了"),
    TYPE_PARAM_WRONG(2005, "评论类型错误或不存在"),
    COMMENT_NOT_FOUND(2006, "你回复的评论不存在")
    ;

    private Integer code;
    private String message;

    CustomizeErrorCode(Integer code, String message) {
        this.message = message;
        this.code = code;
    }

    @Override
    public Integer getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}