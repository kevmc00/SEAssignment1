package com.kevin.assignment1;
import java.util.ArrayList;
import java.time.LocalDate;
/**
 *
 * @author Kevin
 */

public class Course {
    //Create variables
    private ArrayList<Module> modules = new ArrayList<Module>();
    private ArrayList<Student> students = new ArrayList<Student>();
    private LocalDate start;
    private LocalDate end;
    private String name;

    public Course(String n, LocalDate s, LocalDate e){
        name = n;       //Add course name
        start = s;      //Add course start date
        end = e;        //Add course end date
    }
    
    //Add Module to Course
    public void addModule(Module m){
        modules.add(m);
    }
    
    //Add Student to course and Modules
    public void addStudent(Student s){
        students.add(s);
        for (Module m : modules){
            m.addStudent(s);
        }
    }
    
    //Return Course Name
    public String getName(){
        return name;
    }
    
    
    //Return list of Students in Course
    public ArrayList getStudents(){
        return students;
    }
    
    
    //Return Modules in Course
    public ArrayList getModules(){
        return modules;
    }
}
