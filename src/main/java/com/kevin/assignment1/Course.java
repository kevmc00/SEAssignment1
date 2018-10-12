package com.kevin.assignment1;
import java.util.ArrayList;
/**
 *
 * @author Kevin
 */

public class Course {
    private ArrayList students;
    private ArrayList modules;
    private String name;

    public Course(String n){
        name = n;
    }
    
    public String getName(){
        return name;
    }
    
    public ArrayList getStudents(){
        return students;
    }
    
    public ArrayList getModules(){
        return modules;
    }
}
