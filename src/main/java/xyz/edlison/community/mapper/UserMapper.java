package xyz.edlison.community.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import xyz.edlison.community.model.User;

@Mapper
public interface UserMapper {

    @Insert("insert into user (name, account_id, token, gmt_creat, gmt_modified) values (#{name},#{accountId},#{token},#{gmtCreat},#{gmtModified})")
    void insert(User user);
}
