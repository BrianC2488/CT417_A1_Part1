/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brian.coughlan.ct417_a1_part1;

/**
 *
 * @author Brian
 */
public class student 
{
     private String Name;
    private int Age;
    private String DOB;
    private String Username;
    private String Course;
    
      public student(String name, int age, String dob, String course){
    this.Name = name;
    this.Age = age;
    this.DOB = dob;
    this.Username = this.getUsername();
    this.Course = course;
    }
      
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getUsername() 
    {
        String nameConcat = this.Name.replace(" ","_");
        String username = nameConcat + "_" + Integer.toString(this.Age);
        return username;
    }

    public String getCourse() {
        return Course;
    }

    public void setCourse(String Course) {
        this.Course = Course;
    }
    
}
