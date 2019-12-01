package cn.itcast.mapper;

import cn.itcast.pojo.User;
import lombok.extern.log4j.Log4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * Created by WIN 10 on 2019/1/18.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void insertTest() {
        User user = new User();
        user.setAge(23);
        user.setId(8888888L);
        user.setName("张三");
        user.setBirthday(new Date());
        int i = userMapper.insert(user);
        //System.out.println(i);
        User user1 = userMapper.selectByPrimaryKey(8888888L);
        System.out.println(user1);
    }
}