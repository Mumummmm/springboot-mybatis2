package org.spring.springboot.domain;

import org.hibernate.validator.constraints.Email;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.Date;

/**
 * @author spike.lin
 */
public class User {
    @NotNull(message = "用户id不能为空！", groups = {UserAddView.class})
    private long id;
    @NotNull(message = "邮箱不能为空！", groups = {UserAddView.class})
    @Email(message = "邮箱格式不对", groups = {UserAddView.class})
    private String email;
    @Pattern(message = "手机号码格式错误！", regexp = "^1([358][0-9]|4[579]|66|7[0135678]|9[89])[0-9]{8}$", groups = {UserAddView.class, UserModifyView.class})
    private String phone;
    @NotNull(message = "用户名不能为空！", groups = {UserAddView.class, UserModifyView.class})
    @Pattern(message = "用户名格式不对", regexp = "^[a-zA-Z0-9_-]{3,16}$*", groups = {UserAddView.class, UserModifyView.class})
    private String username;
    @NotNull(message = "密码不能为空！", groups = {UserAddView.class})
    @Pattern(message = "密码格式错误！", groups = {UserAddView.class}, regexp = "^(?!([A-Z]*|[a-z]*|[0-9]*|[!-/:-@\\[-`{-~]*|[A-Za-z]*|[A-Z0-9]*|[A-Z!-/:-@\\[-`{-~]*|[a-z0-9]*|[a-z!-/:-@\\[-`{-~]*|[0-9!-/:-@\\[-`{-~]*)$)[A-Za-z0-9!-/:-@\\[-`{-~]{8,20}$")
    private String password;
//    @NotNull(message = "创建日期不能为空！", groups = {UserAddView.class})
    private Date createTime;
    @NotNull(message = "城市不能为空！", groups = {UserAddView.class, UserModifyView.class})
    private City city;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", createTime=" + createTime +
                ", city=" + city +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}
