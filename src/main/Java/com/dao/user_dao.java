package com.dao;



import com.bean.users;

import java.util.List;

/**
 * @author ShangGuan
 * @create 2019-10-21 11:37
 */
public interface user_dao {

    List<users> users_findall();
    boolean users_add();
    boolean users_del();
    boolean users_update(Integer id);
    List<users> users_findById(Integer id);
}
