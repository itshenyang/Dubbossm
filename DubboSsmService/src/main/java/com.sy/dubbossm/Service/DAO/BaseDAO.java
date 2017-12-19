package com.sy.dubbossm.Service.DAO;

import java.util.List;

/**
 * Created by sy on 2017/12/19.
 */
public interface BaseDAO<T> {

    Integer deleteOne(T t);

    Integer insertOne(T t);

    Integer updateOne(T t);

    List<T> allList();

    T querOneById();


}
