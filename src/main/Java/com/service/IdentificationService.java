package com.service;

import com.bean.Education;
import com.bean.Identification;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 石莎莎
 * @create 2019-10-21 18:38
 */
public interface IdentificationService {

    public boolean insertIdentification(Identification ident);

    public boolean deleteIdentification(int iid);

    public boolean updateIdentification(Identification ident);

    public List<Identification> findAll();

    public Education findByOne(@Param(value = "iid")int iid);
}
