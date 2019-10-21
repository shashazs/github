package com.service;

import com.bean.Works;

import java.util.List;

/**
 * @author 石莎莎
 * @create 2019-10-21 19:31
 */
public interface WorksService {
    List<Works> works_findall();

    boolean works_add(int wid);

    boolean works_del(int wid);

    boolean works_update(Integer wid);

    Works works_findById(Integer wid);
}
