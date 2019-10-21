package com.service;

import com.bean.Users;

import java.util.List;

/**
 * @author 石莎莎
 * @create 2019-10-21 19:23
 */
public interface UsersService {

    List<Users> users_findall();

    boolean users_add(int uid);

    boolean users_del(int uid);

    boolean users_update(Integer uid);

    Users users_findById(Integer uid);
}
