package com.igogo.bo.dao.impl;

import com.igogo.bo.dao.LoginInfoDaoInf;
import com.igogo.bo.entity.TbLoginInfo;
import com.igogo.bo.mapper.TbLoginInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by Lee on 2017/8/28.
 */
@Repository
public class LoginInfoDaoImpl implements LoginInfoDaoInf {

    @Autowired
    private TbLoginInfoMapper mapper;

    @Override
    public int deleteByPrimaryKey(Long liId) {
        return mapper.deleteByPrimaryKey(liId);
    }

    @Override
    public int insert(TbLoginInfo record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(TbLoginInfo record) {
        return mapper.insertSelective(record);
    }

    @Override
    public TbLoginInfo selectByPrimaryKey(Long liId) {
        return mapper.selectByPrimaryKey(liId);
    }

    @Override
    public int updateByPrimaryKeySelective(TbLoginInfo record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TbLoginInfo record) {
        return mapper.updateByPrimaryKey(record);
    }

    @Override
    public TbLoginInfo selectLoginInfo(TbLoginInfo record) {
        return mapper.selectLoginInfo(record);
    }
}
