package com.codecool.shitwish.user.model;

public class Test {
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Test() {
    }

    public Test(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
}