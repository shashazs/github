package com.dao;

import com.bean.works;

import java.util.List;

/**
 * @author ShangGuan
 * @create 2019-10-21 15:49
 */
public interface works_dao {
    List<works> works_findall();
    boolean works_add();
    boolean works_del();
    boolean works_update(Integer id);
    List<works> works_findById(Integer id);
}
