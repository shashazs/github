package com.service.Impl;

import com.bean.Works;
import com.dao.WorksDao;
import com.service.WorksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author 石莎莎
 * @create 2019-10-21 19:33
 */
@Service
@Transactional
public class WorksServiceImpl implements WorksService {

    @Autowired
    private WorksDao ad;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS,readOnly  = true)
    public List<Works> works_findall(){
        return ad.works_findall();
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean works_add(int wid){
        return ad.works_add(wid);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean works_del(int wid){
        return ad.works_del(wid);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean works_update(Integer wid){
        return ad.works_update(wid);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS,readOnly  = true)
    public Works works_findById(Integer wid){
        return ad.works_findById(wid);
    }
}
