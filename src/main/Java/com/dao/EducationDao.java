package com.dao;

import com.bean.Education;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 石莎莎
 * @create 2019-10-21 14:26
 */

@Repository
public interface EducationDao {

    @Insert("insert into education values(#{eid},#{start},#{end},#{sname},#{profession},#{level},#{eperson})")
    public boolean insertEducation(Education edu);

    @Delete("delete from education where eid=#{eid}")
    public boolean deleteEducation(int eid);

    @Update("update education set start=#{start},end=#{end},sname=#{sname},profession=#{profession},level=#{level},eperson=#{eperson} where eid=#{eid}")
    public boolean updateEducation(Education edu);

    @Select("select * from education")
    public List<Education> findAll();

    @Select("select * from education where eid=#{eid}")
    public Education findByOne(@Param(value = "eid")int eid);

}
