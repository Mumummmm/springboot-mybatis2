package org.spring.springboot.controller;

import org.spring.springboot.domain.User;
import org.spring.springboot.domain.UserAddView;
import org.spring.springboot.domain.UserModifyView;
import org.spring.springboot.service.UserService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

/**
 * @author spike.lin
 */
@RestController
@RequestMapping(value = "/api/user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User findOneUser(@PathVariable(value = "id") Long id) {
        return userService.findOneUser(id);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<User> findAllUser() {
        return userService.findAllUser();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Long addUser(@RequestBody @Validated(UserAddView.class) User user) {
        return userService.addUser(user);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Long deleteUser(@PathVariable(value = "id") Long id) {
        return userService.deleteUser(id);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Long updateUser(@RequestBody @Validated(UserModifyView.class) User user) {
        return userService.updateUser(user);
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String Login(String username, String password) {
        if (userService.login(username, password)) {
            return "success";
        }
        else {
            return "fail";
        }
    }
}
