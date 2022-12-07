package com.goouoh.demo.model;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import org.hibernate.validator.constraints.Length;

public class User {
    private long id;

    @NotEmpty(message="姓名不能为空")
    @Length(min=2,message="姓名⻓度不能小于2位")
    private String name;

    @Max(value = 100, message = "年龄不能⼤于100岁")
    @Min(value= 18 ,message= "必须年满18岁！" )
    private int age;

    @NotEmpty(message="性别不能为空")
    private String gender;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}
