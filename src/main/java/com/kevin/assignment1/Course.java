package com.kevin.assignment1;
import java.util.ArrayList;
/**
 *
 * @author Kevin
 */

public class Course {
    private ArrayList<Module> modules = new ArrayList<Module>();
    private ArrayList<Student> students = new ArrayList<Student>();
    private String name;

    public Course(String n){
        name = n;
    }
    public void addModule(Module m){
        modules.add(m);
    }
    
    public void addStudent(Student s){
        students.add(s);
        for (Module m : modules){
            m.addStudent(s);
        }
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
