package com.dao;/*
@author hj
@create 2019-10-21-11:59
*/

import com.bean.Resume;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ResumeDao {

    @Select("select * from resume")
    List<Resume> findAllResume();

    @Update("update resume set workstatus=#{workstatus},workdirection=#{workdirection},specificwork=#{specificwork},skill=#{skill},works=#{works},rintroduce=#{rintroduce},rperson=#{rperson} where rid=#{rid}")
    boolean updateResume(Resume resume);

    @Delete("delete from resume where rid=#{rid}")
    boolean deleteResumeById(int id);

    @Insert("insert into resume values (#{rid},#{workstatus},#{workdirection},#{specificwork},#{skill},#{works},#{rintroduce},#{rperson})")
    boolean addResume(Resume resume);

    @Select("select * from resume where rid=#{rid}")
    Resume findResumeById(int id);
}
