package com.dani.myapp.controller;


// DTO 클래스
public class UserData {
    private String name;
    private String email;

    @Override
    public String toString() {
        return "UserData{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    // getter, setter 메서드
}

