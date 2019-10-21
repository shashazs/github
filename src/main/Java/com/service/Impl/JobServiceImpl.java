package com.xd.service.Impl;

import com.xd.bean.Job;
import com.xd.dao.JobDao;
import com.xd.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Devil
 * @create 2019-10-21-16:24
 */
@Service
@Transactional
public class JobServiceImpl implements JobService {
    @Autowired
    private JobDao jd;

    @Override
    public List<Job> findAlljob() {
        return jd.findAlljob();
    }

    @Override
    public boolean deletejob(int jid) {
        return jd.deletejob(jid);
    }

    @Override
    public boolean addjob(Job job) {
        return jd.addjob(job);
    }

    @Override
    public boolean updatejob(Job job) {
        return jd.updatejob(job);
    }

    @Override
    public Job findjobbyid(int jid) {
        return jd.findjobbyid(jid);
    }
}
