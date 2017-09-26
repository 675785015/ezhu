package com.igogo.bo.service.impl;

import com.igogo.bo.dao.LoginInfoDaoInf;
import com.igogo.bo.entity.TbLoginInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Lee on 2017/8/28.
 */
@Service
public class LoginInfoServiceImpl implements LoginInfoDaoInf {

    @Autowired
    private LoginInfoDaoInf loginInfoDao;

    @Override
    public int deleteByPrimaryKey(Long liId) {
        return loginInfoDao.deleteByPrimaryKey(liId);
    }

    @Override
    public int insert(TbLoginInfo record) {
        return loginInfoDao.insert(record);
    }

    @Override
    public int insertSelective(TbLoginInfo record) {
        return loginInfoDao.insertSelective(record);
    }

    @Override
    public TbLoginInfo selectByPrimaryKey(Long liId) {
        return loginInfoDao.selectByPrimaryKey(liId);
    }

    @Override
    public int updateByPrimaryKeySelective(TbLoginInfo record) {
        return loginInfoDao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TbLoginInfo record) {
        return loginInfoDao.updateByPrimaryKey(record);
    }

    @Override
    public TbLoginInfo selectLoginInfo(TbLoginInfo record) {
        return loginInfoDao.selectLoginInfo(record);
    }
}
