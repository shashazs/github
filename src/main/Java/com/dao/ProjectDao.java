package com.xd.dao;

import com.xd.bean.Job;
import com.xd.bean.Project;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @author Devil
 * @create 2019-10-21-14:55
 */
public interface ProjectDao {
    @Select("select * from project")
    List<Project> findAllpro();
    @Delete("delete from project where pid=#{pid}")
    boolean deletepro(int pid);
    @Insert("insert into project values (#{pname},#{budget},#{pintroduce},#{file},#{publisher})")
    boolean addpro(Project pro);
    @Update("update job set pname=#{pname},budget=#{budget},pintroduce=#{pintroduce},file=#{file},publisher=#{publisher} where pid=#{pid}")
    boolean updatepro(Project pro);
    @Select("select * from project where pid=#{pid}")
    Job findprobyid(int pid);
}
