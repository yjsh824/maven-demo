package com.ssm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ssm.pojo.DyUsers;

public interface DyUsersMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DyUsers record);

    int insertSelective(DyUsers record);

    DyUsers selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DyUsers record);

    int updateByPrimaryKey(DyUsers record);
    
    List<DyUsers> selectall();
    
    DyUsers selectByusername(@Param("username") String username);
}