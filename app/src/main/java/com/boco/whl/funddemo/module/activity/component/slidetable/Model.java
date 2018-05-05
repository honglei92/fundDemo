package com.boco.whl.funddemo.module.activity.component.slidetable;

/**
 *
 * @author zhuji
 * @date 2016/10/24
 */

public class Model {

    private String name;
    private String sex;
    private String age;
    private String birth;
    private String grade;
    private String address;

    public Model(String name, String sex, String age, String birth, String grade, String address) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.birth = birth;
        this.grade = grade;
        this.address = address;
    }

    public Model(String name, String age, String birth, String grade, String address) {
        this.name = name;
        this.age = age;
        this.birth = birth;
        this.grade = grade;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
