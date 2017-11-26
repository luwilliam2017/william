package com.bean;

/**
 * Created by w on 2017/11/26.
 */
public class Person {

    private int id;
    private String username;
    private String phone;
    private String email;
    private int age;

    public Person() {
    }

    public Person(int id, String username, String phone, String email, int age) {
        this.id = id;
        this.username = username;
        this.phone = phone;
        this.email = email;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
