package com.igogo.bo.dao;

import com.igogo.bo.entity.TbUser;

/**
 * Created by Lee on 2017/8/9.
 */
public interface UserDaoInf {

    int insert(TbUser record);

    int insertSelective(TbUser record);

    TbUser selectByPrimaryKey(Long uId);

    int updateByPrimaryKeySelective(TbUser record);

    int updateByPrimaryKey(TbUser record);

}
