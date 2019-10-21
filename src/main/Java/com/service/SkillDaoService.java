package com.service;/*
@author hj
@create 2019-10-21-19:34
*/

import com.bean.Skills;

import java.util.List;


public interface SkillDaoService {
    List<Skills> findAllSkills();

    boolean deleteSkillsById(int id);

    boolean updateSkills(Skills skills);

    boolean addSkills(Skills skills);

    Skills findSkillsById(int id);
}
