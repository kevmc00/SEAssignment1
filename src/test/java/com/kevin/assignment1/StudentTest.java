/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kevin.assignment1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
public class StudentTest {
    
    public StudentTest() {
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

    /**
     * Test of addModule method, of class Student.
     */
    @Test
    public void testMethods() {
        LocalDate dob = new LocalDate.parse("1997-05-02");
        Student stu = new Student("Peter", new LocalDate.parse("1997-5-2"));
        String username = stu.getUsername();
        String correct = "Peter12";
        assertEquals(username, correct);
    }
    
}
