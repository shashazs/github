package com.dao;

import com.bean.Education;
import com.bean.Identification;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 石莎莎
 * @create 2019-10-21 14:27
 */
@Repository
public interface IdentificationMapper {

    public int insertIdentification(Identification ident);

    public int deleteIdentification(int iid);

    public int updateIdentification(Identification ident);

    public List<Identification> findAll();

    public Education findByOne(@Param(value = "iid")int iid);

}
