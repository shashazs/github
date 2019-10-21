package com.dao;

import com.bean.Education;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 石莎莎
 * @create 2019-10-21 14:26
 */

@Repository
public interface EducationMapper {

    public int insertEducation(Education edu);

    public int deleteEducation(int eid);

    public int updateEducation(Education edu);

    public List<Education> findAll();

    public Education findByOne(@Param(value = "eid")int eid);

}
