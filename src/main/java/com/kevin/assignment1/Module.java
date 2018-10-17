/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kevin.assignment1;

import java.util.ArrayList;

/**
 *
 * @author Kevin
 */
public class Module {
    
    private String name;
    private String id;
    private ArrayList students;
    
    
    public Module(String n, String i){
        name = n;
        id = i;
    }
    
    public void addStudent(Student s){
        students.add(s);
    }
    
    public String getName(){
        return name;
    }
    
    public String getID(){
        return id;
    }
    public ArrayList getStudents(){
        return students;
    }
}
