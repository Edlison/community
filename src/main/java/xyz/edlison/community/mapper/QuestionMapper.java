package xyz.edlison.community.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import xyz.edlison.community.model.Question;

import java.util.List;

@Mapper
public interface QuestionMapper {

    @Insert("insert into question (title, description, gmt_creat, gmt_modified, creator, tag) values (#{title}, #{description}, #{gmtCreat}, #{gmtModified}, #{creator}, #{tag})")
    void creat(Question question);

    @Select("select * from question limit #{offset}, #{size}")//redundant
    List<Question> list(@Param("offset") Integer offset, @Param("size") Integer size);

    @Select("select count(1) from question")
    Integer count();

    @Select("select * from question where creator = #{userId} limit #{offset}, #{size}")
    List<Question> listByUserId(@Param("userId") Integer userId, @Param("offset") Integer offset, @Param("size") Integer size);

    @Select("select count(1) from question where creator = #{userId}")
    Integer countByUseeId(@Param("userId") Integer userId);
}