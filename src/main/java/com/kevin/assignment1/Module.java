package com.kevin.assignment1;

import java.util.ArrayList;

/**
 *
 * @author Kevin
 */
public class Module {
    //Create variables
    private String name;
    private String id;
    private ArrayList<Student> students = new ArrayList<Student>();
    
    public Module(String n, String i){
        //Add variables
        name = n;
        id = i;
    }
    
    //Add Student to Module
    public void addStudent(Student s){
        students.add(s);
    }
    
    //Return Module name
    public String getName(){
        return name;
    }
    
    //Return Module ID
    public String getID(){
        return id;
    }
    
    //Return list of students in module
    public ArrayList getStudents(){
        return students;
    }
}
