/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kevin.assignment1;

import java.time.LocalDate;
import java.util.ArrayList;


/**
 *
 * @author Kevin
 */

public class Student {
    private static int IDcount = 0;
    private String name;
    private int age;
    private LocalDate DOB;
    private int ID;
    private String username;
    private ArrayList modules;
    
    public Student(String n, int a, LocalDate d){
        name = n;
        age = a;
        DOB = d;
        IDcount++;
        ID = IDcount;
        username = getUsername();
    }
    
    public String getName(){
        return name;
    }
    
    public int getAge(){
        return age;
    }
    
    public LocalDate getDOB(){
        return DOB;
    }
    
    public int getID(){
        return ID;
    }

    public String getUsername() {
        return name + Integer.toString(age);
    }
    
    public void addModule(Module m){
        modules.add(m);
    }
    
    public ArrayList getModules(){
        return modules;
    }
}
