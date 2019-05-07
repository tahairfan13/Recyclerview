package com.example.tahaali.recyclerview.model;

/**
 * Created by hp on 10/10/2017.
 */

public class Person {

    private String name;
    private int age;
    private String DOB;

    public Person()
    {
        name="Default";
        age=-1;
        DOB="Default";
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDOB() {
        return DOB;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {


        if(age>=0) {
            this.age = age;
        }
        else
        {
            age=-1;
        }
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }
}
