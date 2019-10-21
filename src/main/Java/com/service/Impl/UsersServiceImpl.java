package com.service.Impl;

import com.bean.Users;
import com.dao.UsersDao;
import com.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author 石莎莎
 * @create 2019-10-21 19:40
 */
@Service
@Transactional
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersDao ud;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS,readOnly  = true)
    public List<Users> users_findall(){
        return ud.users_findall();
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean users_add(int uid){
        return ud.users_add(uid);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean users_del(int uid){
        return ud.users_del(uid);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean users_update(Integer uid){
        return ud.users_update(uid);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS,readOnly  = true)
    public Users users_findById(Integer uid){
        return ud.users_findById(uid);
    }
}
