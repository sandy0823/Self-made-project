package com.example.demo.dao.entity;

public class StudentInfo {
    private Long id;

    private Long sex;

    private Long age;

    private String name;

    private Long sudentId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSex() {
        return sex;
    }

    public void setSex(Long sex) {
        this.sex = sex;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Long getSudentId() {
        return sudentId;
    }

    public void setSudentId(Long sudentId) {
        this.sudentId = sudentId;
    }
}