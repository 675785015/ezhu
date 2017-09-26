package com.igogo.bo.dao.user;

import com.igogo.bo.dao.base.BaseUnitTest;
import com.igogo.bo.dao.impl.UserDaoImpl;
import com.igogo.bo.entity.TbUser;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

/**
 * Created by Lee on 2017/8/9.
 */
public class UserTest extends BaseUnitTest {

    @Autowired
    private Environment env;


    @Autowired
    private UserDaoImpl userDao;

    @Test
    public void testInsert(){
        TbUser user = new TbUser();
        user.setuAge(10);
        userDao.insert(user);
//        System.out.println(env.getProperty("spring.datasource.url"));
    }

    @Test
    public void testSelectOne(){
        TbUser user = userDao.selectByPrimaryKey(1L);
        System.out.println(user.getuId());
    }
}
