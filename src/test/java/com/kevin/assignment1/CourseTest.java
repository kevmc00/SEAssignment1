/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kevin.assignment1;

import java.time.LocalDate;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kevin
 */
public class CourseTest {
    
    public CourseTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testSomeMethod() {
        Course course = new Course("Electronic and Computer Engineering");
        Module module = new Module("Software Engineering III", "CT417");
        Module module2 = new Module("System on Chip Design", "EE451");
        course.addModule(module);
        course.addModule(module2);
        ArrayList<Module> modules = course.getModules();
        assertEquals("Software Engineering III", modules.get(0).getName());
        assertEquals("EE451", modules.get(1).getID());
        
        Student test = new Student("kevin", LocalDate.parse("1997-05-02"), course);
        ArrayList<Student> stu = course.getStudents();
        assertEquals(stu.get(0).getName(), "kevin");
    }
}
