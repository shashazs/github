package com.dao;/*
@author hj
@create 2019-10-21-14:10
*/


import com.bean.Skills;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SkillsDao {

    @Select("select * from skills")
    List<Skills> findAllSkills();

    @Delete("delete from skills where sid = #{sid}")
    boolean deleteSkillsById(int id);

    @Update("update skills set evaluate=#{evaluate},sperson=#{sperson} where sid=#{sid}")
    boolean updateSkills(Skills skills);

    @Insert("insert into skills values(#{sid},#{evaluate},#{sperson})")
    boolean addSkills(Skills skills);

    @Select("select * from skills where sid=#{sid}")
    Skills findSkillsById(int id);
}
