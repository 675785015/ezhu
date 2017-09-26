package com.igogo.bo.service;

import com.igogo.bo.entity.TbUser;

/**
 * Created by Lee on 2017/8/16.
 */
public interface UserServiceInf {

    int insert(TbUser record);

    int insertSelective(TbUser record);

    TbUser selectByPrimaryKey(Long uId);

    int updateByPrimaryKeySelective(TbUser record);

    int updateByPrimaryKey(TbUser record);
}
