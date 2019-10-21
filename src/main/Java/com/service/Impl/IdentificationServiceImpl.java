package com.service.Impl;

import com.bean.Education;
import com.bean.Identification;
import com.dao.IdentificationDao;
import com.service.IdentificationService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author 石莎莎
 * @create 2019-10-21 18:56
 */
@Service
@Transactional
public class IdentificationServiceImpl implements IdentificationService {

    @Autowired
    private IdentificationDao id;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean insertIdentification(Identification ident){
        return id.insertIdentification(ident);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean deleteIdentification(int iid){
        return id.deleteIdentification(iid);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean updateIdentification(Identification ident){
        return id.updateIdentification(ident);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS,readOnly  = true)
    public List<Identification> findAll(){
        return id.findAll();
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS,readOnly  = true)
    public Education findByOne(@Param(value = "iid")int iid){
        return id.findByOne(iid);
    }
}
