package org.spring.springboot.dao;

import org.spring.springboot.domain.User;

import java.util.List;

public interface UserDao {

    /**
     * 根据id，获取用户
     * @param id 用户id
     * @return
     */
    User findOneUser(long id);

    /**
     * 获取用户列表
     * @return
     */
    List<User> findAllUser();

    /**
     * 添加新的用户
     * @param user 用户
     * @return
     */
    Long addUser(User user);

    /**
     * 根据id删除用户
     * @param id
     * @return
     */
    Long deleteUser(Long id);

    /**
     * 更新用户信息
     * @param user 用户信息
     * @return
     */
    Long updateUser(User user);
}
