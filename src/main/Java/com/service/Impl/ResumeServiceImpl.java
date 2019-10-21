package com.service.Impl;/*
@author hj
@create 2019-10-21-19:35
*/

import com.bean.Resume;
import com.dao.ResumeDao;
import com.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ResumeServiceImpl implements ResumeService {

    @Autowired
    private ResumeDao resumeDao;

    @Override
    public List<Resume> findAllResume() {
        return resumeDao.findAllResume();
    }

    @Override
    public boolean updateResume(Resume resume) {
        return resumeDao.updateResume(resume);
    }

    @Override
    public boolean deleteResumeById(int id) {
        return resumeDao.deleteResumeById(id);
    }

    @Override
    public boolean addResume(Resume resume) {
        return resumeDao.addResume(resume);
    }

    @Override
    public Resume findResumeById(int id) {
        return resumeDao.findResumeById(id);
    }
}
