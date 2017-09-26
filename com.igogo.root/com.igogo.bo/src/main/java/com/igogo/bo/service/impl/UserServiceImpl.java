package com.igogo.bo.service.impl;

import com.igogo.bo.dao.UserDaoInf;
import com.igogo.bo.entity.TbUser;
import com.igogo.bo.service.UserServiceInf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Lee on 2017/8/16.
 */
@Service
public class UserServiceImpl implements UserServiceInf {

    @Autowired
    private UserDaoInf userDao;

    @Override
    public int insert(TbUser record) {
        return userDao.insert(record);
    }

    @Override
    public int insertSelective(TbUser record) {
        return userDao.insertSelective(record);
    }

    @Override
    public TbUser selectByPrimaryKey(Long uId) {
        TbUser user = userDao.selectByPrimaryKey(uId);
        return user;
    }

    @Override
    public int updateByPrimaryKeySelective(TbUser record) {
        int i = userDao.updateByPrimaryKeySelective(record);
        return i;
    }

    @Override
    public int updateByPrimaryKey(TbUser record) {
        return userDao.updateByPrimaryKey(record);
    }
}
