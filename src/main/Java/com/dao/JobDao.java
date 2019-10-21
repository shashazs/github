package com.dao;

import com.bean.Job;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Devil
 * @create 2019-10-21-14:55
 */
@Repository
public interface JobDao {

    @Select("select * from job")
    List<Job> findAlljob();

    @Delete("delete from job where jid=#{jid}")
    boolean deletejob(int jid);

    @Insert("insert into job values (#{time},#{untime},#{address},#{hours},#{daysal},#{pattern},#{jperson})")
    boolean addjob(Job job);

    @Update("update job set time=#{time},untime=#{untime},address=#{address},hours=#{hours},daysal=#{daysal},pattern=#{pattern},jperson=#{jperson} where jid=#{jid}")
    boolean updatejob(Job job);

    @Select("select * from job where jid=#{jid}")
    Job findjobbyid(int jid);
}
