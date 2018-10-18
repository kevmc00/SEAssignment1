/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kevin.assignment1;

import java.time.*;
import java.util.ArrayList;
import java.time.temporal.ChronoUnit;


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
    private ArrayList<Module> modules = new ArrayList<Module>();
    
    public Student(String n, LocalDate d){
        name = n;
        age = Math.toIntExact(ChronoUnit.YEARS.between(d, LocalDate.now()));
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
