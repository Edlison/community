package xyz.edlison.community.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import xyz.edlison.community.model.Question;

import java.util.List;

@Mapper
public interface QuestionMapper {

    @Insert("insert into question (title, description, gmt_creat, gmt_modified, creator, tag) values (#{title}, #{description}, #{gmtCreat}, #{gmtModified}, #{creator}, #{tag})")
    void creat(Question question);

    @Select("select * from question")//redundant
    List<Question> list();
}
