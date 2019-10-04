package xyz.edlison.community.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import xyz.edlison.community.model.Question;

@Mapper
public interface QuestionMapper {

    @Insert("insert into question (title, description, gmt_creat, gmt_modified, creator, tag) values (#{title}, #{description}, #{gmtCreat}, #{gmtModified}, #{creator}, #{tag})")
    void creat(Question question);
}
