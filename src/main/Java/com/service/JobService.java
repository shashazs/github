package com.service;

import com.bean.Job;

import java.util.List;

/**
 * @author Devil
 * @create 2019-10-21-16:15
 */
public interface JobService {

    List<Job> findAlljob();

    boolean deletejob(int jid);

    boolean addjob(Job job);

    boolean updatejob(Job job);

    Job findjobbyid(int jid);
}
