package com.dao;/*
@author hj
@create 2019-10-21-11:59
*/

import com.bean.Resume;

import java.util.List;

public interface ResumeDao {

    List<Resume> findAllResume();

    boolean updateResume(Resume resume);

    boolean deleteResumeById(int id);

    boolean addResume(Resume resume);

}
