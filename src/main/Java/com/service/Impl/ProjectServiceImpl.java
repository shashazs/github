package com.service.Impl;

import com.bean.Job;
import com.bean.Project;
import com.dao.ProjectDao;
import com.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Devil
 * @create 2019-10-21-16:25
 */
@Service
@Transactional
public class ProjectServiceImpl implements ProjectService {
    @Autowired
    private ProjectDao pd;

    @Override
    public List<Project> findAllpro() {
        return pd.findAllpro();
    }

    @Override
    public boolean deletepro(int pid) {
        return pd.deletepro(pid);
    }

    @Override
    public boolean addpro(Project pro) {
        return pd.addpro(pro);
    }

    @Override
    public boolean updatepro(Project pro) {
        return pd.updatepro(pro);
    }

    @Override
    public Job findprobyid(int pid) {
        return pd.findprobyid(pid);
    }
}
