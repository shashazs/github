package com.dao;

import com.bean.Works;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author ShangGuan
 * @create 2019-10-21 15:49
 */
@Repository
public interface WorksDao {

    @Select("select * from works")
    List<Works> works_findall();

    @Insert("insert into works values(#{wid}, #{wname}, #{trade}, #{keyword}, #{href}, #{duty}, #{wimage}, #{wperson})")
    boolean works_add(int wid);

    @Delete("delete from works where wid=#{wid}")
    boolean works_del(int wid);

    @Update("update works set wname=#{wname}, trade=#{trade}, keyword=#{keyword}, href=#{href}, duty=#{duty}, wimage=#{wimage}, wperson=#{wperson} where wid=#{wid}")
    boolean works_update(Integer wid);

    @Select("select * from works where wid=#{wid}")
    Works works_findById(Integer wid);
}
