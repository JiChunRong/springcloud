package com.springcloud.demo.dao;

import com.springcloud.demo.entity.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: rongjichun
 * \* Date: 2019-04-24 19:47
 * \* Description:
 * \
 */
@Mapper
public interface DeptDao {

    public boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();
}
