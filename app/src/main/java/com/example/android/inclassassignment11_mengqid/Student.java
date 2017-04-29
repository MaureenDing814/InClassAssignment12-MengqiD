package com.example.android.inclassassignment11_mengqid;

import java.io.Serializable;

/**
 * Created by Maureen_Ding on 4/18/17.
 */

public class Student implements Serializable{
    String name;
    String gender;
    String year;

    public Student(){

    }

    public Student(String name, String gender, String year ){
        this.name = name;
        this.gender = gender;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getYear() {
        return year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
