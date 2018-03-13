package org.spring.springboot.service;

import org.spring.springboot.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author spike.lin
 */
public interface UserService {

    /**
     * 根据用户id，获取用户
     * @param id 用户id
     * @return
     */
    User findOneUser(Long id);

    /**
     * 获取用户列表
     * @return
     */
    List<User> findAllUser();

    /**
     * 添加新的用户
     * @param user 用户信息
     * @return
     */
    Long addUser(User user);

    /**
     * 根据用户id，删除用户
     * @param id 用户id
     * @return
     */
    Long deleteUser(Long id);

    /**
     * 更新用户
     * @param user 用户信息
     * @return
     */
    Long updateUser(User user);

    /**
     * 登录
     * @param username 账号
     * @param password 密码
     * @return
     */
    Boolean login(String username, String password);
}
