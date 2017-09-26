package com.igogo.bo.mapper;


import com.igogo.bo.entity.TbLoginInfo;

public interface TbLoginInfoMapper {
    int deleteByPrimaryKey(Long liId);

    int insert(TbLoginInfo record);

    int insertSelective(TbLoginInfo record);

    TbLoginInfo selectByPrimaryKey(Long liId);

    int updateByPrimaryKeySelective(TbLoginInfo record);

    int updateByPrimaryKey(TbLoginInfo record);

    TbLoginInfo selectLoginInfo(TbLoginInfo record);
}