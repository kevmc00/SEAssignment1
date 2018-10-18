package com.kevin.assignment1;
import java.util.ArrayList;
/**
 *
 * @author Kevin
 */

public class Course {
    private ArrayList<Student> students = new ArrayList<Student>();
    private ArrayList<Module> modules = new ArrayList<Module>();
    private String name;

    public Course(String n){
        name = n;
    }
    public void addModule(Module m){
        modules.add(m);
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
