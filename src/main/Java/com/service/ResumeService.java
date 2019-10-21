package com.service;/*
@author hj
@create 2019-10-21-19:33
*/

import com.bean.Resume;

import java.util.List;

public interface ResumeService {


    List<Resume> findAllResume();

    boolean updateResume(Resume resume);

    boolean deleteResumeById(int id);

    boolean addResume(Resume resume);

    Resume findResumeById(int id);
}
