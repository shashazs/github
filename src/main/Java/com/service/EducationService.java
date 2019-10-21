package com.service;

import com.bean.Education;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 石莎莎
 * @create 2019-10-21 18:36
 */
public interface EducationService {

    public boolean insertEducation(Education edu);

    public boolean deleteEducation(int eid);

    public boolean updateEducation(Education edu);

    public List<Education> findAll();

    public Education findByOne(@Param(value = "eid")int eid);
}
