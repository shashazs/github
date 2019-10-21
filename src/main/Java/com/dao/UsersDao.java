package com.dao;


import com.bean.Users;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author ShangGuan
 * @create 2019-10-21 11:37
 */
@Repository
public interface UsersDao {

    @Select("select * from users")
    List<Users> users_findall();

    @Insert("insert into users values(#{uid}, #{uname}, #{email}, #{password}, #{role)")
    boolean users_add(int uid);

    @Delete("delete from users where uid=#{uid}")
    boolean users_del(int uid);

    @Update("update users set uname=#{uname}, email=#{email}, password=#{password}, role=#{role) where uid=#{uid}")
    boolean users_update(Integer uid);

    @Select("select * from users where uid=#{uid}")
    Users users_findById(Integer uid);
}
