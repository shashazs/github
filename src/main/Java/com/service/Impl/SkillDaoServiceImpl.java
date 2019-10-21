package com.service.Impl;/*
@author hj
@create 2019-10-21-19:35
*/

import com.bean.Skills;
import com.dao.SkillsDao;
import com.service.SkillDaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SkillDaoServiceImpl implements SkillDaoService {

    @Autowired
    private SkillsDao skillsDao;
    @Override
    public List<Skills> findAllSkills() {
        return skillsDao.findAllSkills();
    }

    @Override
    public boolean deleteSkillsById(int id) {
        return skillsDao.deleteSkillsById(id);
    }

    @Override
    public boolean updateSkills(Skills skills) {
        return skillsDao.updateSkills(skills);
    }

    @Override
    public boolean addSkills(Skills skills) {
        return skillsDao.addSkills(skills);
    }

    @Override
    public Skills findSkillsById(int id) {
        return skillsDao.findSkillsById(id);
    }
}
