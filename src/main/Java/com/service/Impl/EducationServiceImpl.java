package com.service.Impl;

import com.bean.Education;
import com.dao.EducationDao;
import com.service.EducationService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author 石莎莎
 * @create 2019-10-21 18:41
 */
@Service
@Transactional
public class EducationServiceImpl implements EducationService {

    @Autowired
    private EducationDao ed;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean insertEducation(Education edu){
        return ed.insertEducation(edu);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean deleteEducation(int eid){
        return ed.deleteEducation(eid);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean updateEducation(Education edu){
        return ed.updateEducation(edu);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS,readOnly  = true)
    public List<Education> findAll(){
        return ed.findAll();
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS,readOnly  = true)
    public Education findByOne(@Param(value = "eid")int eid){
        return ed.findByOne(eid);
    }
}
