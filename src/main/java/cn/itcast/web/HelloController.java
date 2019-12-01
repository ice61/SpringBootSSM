package cn.itcast.web;

import cn.itcast.pojo.User;
import cn.itcast.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by WIN 10 on 2019/1/18.
 */
@RequestMapping("user")
@RestController
public class HelloController {
    @Autowired
    private UserService userService;

    @GetMapping("{id}")
    public User findUser(@PathVariable("id") Long id) {
        return userService.findUser(id);
    }

}
