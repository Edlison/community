package xyz.edlison.community.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import xyz.edlison.community.model.User;

@Mapper
public interface UserMapper {

    @Insert("insert into user (name, account_id, token, gmt_create, gmt_modified, avatar_url) values (#{name}, #{accountId}, #{token}, #{gmtCreat}, #{gmtModified}, #{avatarUrl})")
    void insert(User user);                                                         //如果是对象自动匹配

    @Select("select * from user where token = #{token}")
    User findByToken(@Param("token") String token);                                 //如果是一个值需要Param
}
