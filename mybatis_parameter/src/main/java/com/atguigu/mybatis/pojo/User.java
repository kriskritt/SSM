package com.atguigu.mybatis.pojo;

public class User {

    private Integer id;

    private String username;

    private String password;

    private Integer age;

    private String gendeer;

    private String email;

    public User() {
    }

    public User(Integer id, String username, String password, Integer age, String genter, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.age = age;
        this.gendeer = genter;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getgendeer() {
        return gendeer;
    }

    public void setgendeer(String genter) {
        this.gendeer = genter;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", gendeer='" + gendeer + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

