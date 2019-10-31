package xyz.edlison.community.mapper;

import xyz.edlison.community.model.Question;

public interface QuestionExtMapper {
    int incView(Question record);
    int incCommentCount(Question record);//调用QuestionExtMapper.xml中的方法！
}