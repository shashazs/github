package com.dao;/*
@author hj
@create 2019-10-21-14:10
*/

import com.bean.Skills;

import java.util.List;

public interface SkillsDao {

    List<Skills> findAllSkills();

    boolean deleteSkillsById(int id);

    boolean updateSkills(Skills skills);

    boolean addSkills(Skills skills);
}
