package com.igogo.bo.service;

import com.igogo.bo.entity.TbLoginInfo;

/**
 * Created by Lee on 2017/8/28.
 */
public interface LoginInfoServiceInf {

    int deleteByPrimaryKey(Long liId);

    int insert(TbLoginInfo record);

    int insertSelective(TbLoginInfo record);

    TbLoginInfo selectByPrimaryKey(Long liId);

    int updateByPrimaryKeySelective(TbLoginInfo record);

    int updateByPrimaryKey(TbLoginInfo record);

    TbLoginInfo selectLoginInfo(TbLoginInfo record);
}
