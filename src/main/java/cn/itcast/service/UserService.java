package cn.itcast.service;

import cn.itcast.mapper.UserMapper;
import cn.itcast.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by WIN 10 on 2019/1/18.
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
    public User findUser(Long l) {
        return userMapper.selectByPrimaryKey(l);
    }
    @Transactional
    public void insertUser(User user) {
        userMapper.insert(user);
    }
}
