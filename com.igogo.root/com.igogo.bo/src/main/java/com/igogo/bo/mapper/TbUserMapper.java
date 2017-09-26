package com.igogo.bo.mapper;


import com.igogo.bo.entity.TbUser;
import org.apache.ibatis.annotations.Mapper;

public interface TbUserMapper {
    int insert(TbUser record);

    int insertSelective(TbUser record);

    TbUser selectByPrimaryKey(Long uId);

    int updateByPrimaryKeySelective(TbUser record);

    int updateByPrimaryKey(TbUser record);
}