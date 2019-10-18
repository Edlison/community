package xyz.edlison.community.mapper;

import org.apache.ibatis.annotations.*;
import xyz.edlison.community.model.User;

@Mapper
public interface UserMapper {

    @Insert("insert into user (name, account_id, token, gmt_create, gmt_modified, avatar_url) values (#{name}, #{accountId}, #{token}, #{gmtCreat}, #{gmtModified}, #{avatarUrl})")
    void insert(User user);                                                         //如果是对象自动匹配

    @Select("select * from user where token = #{token}")
    User findByToken(@Param("token") String token);                                 //如果是一个值需要Param

    @Select("select * from user where id = #{id}")
    User findById(@Param("id") Integer id);

    @Select("select * from user where account_id = #{accountId}")
    User findByAccountId(@Param("accountId")String accountId);

    @Update("Update user set name = #{name}, avatar_url = #{avatarUrl}, gmt_modified = #{gmtModified}, token = #{token} where account_id = #{accountId}")//id or accountId
    void update(User user);
}
