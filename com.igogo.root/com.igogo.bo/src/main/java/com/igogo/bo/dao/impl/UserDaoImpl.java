package com.igogo.bo.dao.impl;

import com.igogo.bo.dao.UserDaoInf;
import com.igogo.bo.entity.TbUser;
import com.igogo.bo.mapper.TbUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by Lee on 2017/8/9.
 */
@Repository
public class UserDaoImpl implements UserDaoInf {

    @Autowired
    private TbUserMapper mapper;

    @Override
    public int insert(TbUser record) {
        int insert = mapper.insert(record);
        return insert;
    }

    @Override
    public int insertSelective(TbUser record) {
        return 0;
    }

    @Override
    public TbUser selectByPrimaryKey(Long uId) {
        return mapper.selectByPrimaryKey(uId);
    }

    @Override
    public int updateByPrimaryKeySelective(TbUser record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(TbUser record) {
        return 0;
    }
}
