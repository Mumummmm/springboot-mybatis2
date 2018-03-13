package dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.spring.springboot.Application;
import org.spring.springboot.dao.UserDao;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=Application.class)
public class TestUserDao {

    @Resource
    private UserDao userDao;

    @Test
    public void TestFindAllUser() {
        System.out.println(userDao.findAllUser());
    }
}
