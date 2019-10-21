package com.service;

import com.bean.Job;
import com.bean.Project;

import java.util.List;

/**
 * @author Devil
 * @create 2019-10-21-16:16
 */
public interface ProjectService {

    List<Project> findAllpro();

    boolean deletepro(int pid);

    boolean addpro(Project pro);

    boolean updatepro(Project pro);

    Job findprobyid(int pid);
}
