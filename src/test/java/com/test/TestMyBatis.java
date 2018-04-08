package com.test;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ssm.dao.DyUsersMapper;
import com.ssm.pojo.DyUsers;

@RunWith(SpringJUnit4ClassRunner.class) // 表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml" })

public class TestMyBatis {
   // private static Logger logger = Logger.getLogger(TestMyBatis.class);
    // private ApplicationContext ac = null;
    @Resource
    DyUsersMapper dyUsersMapper ;

    // @Before
    // public void before() {
    // ac = new ClassPathXmlApplicationContext("applicationContext.xml");
    // userService = (IUserService) ac.getBean("userService");
    // }

    @Test
    public void test() {
        List<DyUsers> user = dyUsersMapper.selectall();
          System.out.println(user.size());
         
    }
}