package com.izdebski.model;

import javax.validation.constraints.*;

public class User {

    @NotEmpty
    private String name;

    @Min(value = 12)
    @Max(value = 120)
    @NotNull
    private Integer age;

    @NotEmpty
    @Email
    private String email;

    @NotEmpty
    private String country;

    public User(String name, Integer age, String email, String country) {
        super();
        this.name = name;
        this.age = age;
        this.email = email;
        this.country = country;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}