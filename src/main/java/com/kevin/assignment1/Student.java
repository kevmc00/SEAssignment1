package com.kevin.assignment1;

import java.time.*;
import java.util.ArrayList;
import java.time.temporal.ChronoUnit;


public class Student {
    //Create Variables
    private static int IDcount = 0;
    private String name;
    private int age;
    private LocalDate DOB;
    private int ID;
    private String username;
    private ArrayList<Module> modules;
    private Course course;
    
    public Student(String n, LocalDate d, Course c){
        //Add variables
        name = n;
        //Find difference between DOB and todays date to find age
        age = Math.toIntExact(ChronoUnit.YEARS.between(d, LocalDate.now()));
        DOB = d;
        course = c;
        //Add student to course
        course.addStudent(this);
        IDcount++;
        ID = IDcount;
        username = getUsername();
        modules = course.getModules();
    }
    
    //Return Student name
    public String getName(){
        return name;
    }
    
    //Return student age
    public int getAge(){
        return age;
    }
    
    //Return date of birth
    public LocalDate getDOB(){
        return DOB;
    }
    
    //Return ID number
    public int getID(){
        return ID;
    }

    //Return username
    public String getUsername() {
        return name + Integer.toString(age);
    }
    
    //Return module list
    public ArrayList getModules(){
        return modules;
    }
    
    //Return course
    public Course getCourse(){
        return course;
    }
}
