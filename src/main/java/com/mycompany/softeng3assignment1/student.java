/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.softeng3assignment1;

import java.util.ArrayList;
import org.joda.time.DateTime;

/**
 *
 * @author Joseph
 */
public class student {

    public long getId() {
        return Id;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getDOB() {
        return DOB;
    }

    private final long Id;
    private final int age;
    private final String name;
    private final String DOB;
   private final String username ;
   private ArrayList<module> studentModules = new ArrayList();
   private ArrayList<String> studentCourse = new ArrayList();
   private ArrayList<DateTime> studentCourseSD = new ArrayList();
   private ArrayList<DateTime> studentCourseFD = new ArrayList();

   public void addModule(module m){
        studentModules.add(m); //adds student with their module to a list
    }

    public ArrayList<module> getStudentModules() {
        return studentModules;
    }

    public ArrayList<String> getStudentCourse() {
        return studentCourse;
    }
   
    public void addCourse(courseProgramme cp){
        studentCourse.add(cp.getName()); //adds student with their module to a list
        studentCourseSD.add(cp.getStart());
        studentCourseFD.add(cp.getFinish());
    }

    public ArrayList<DateTime> getStudentCourseSD() {
        return studentCourseSD;
    }

    public ArrayList<DateTime> getStudentCourseFD() {
        return studentCourseFD;
    }
   
   
   
    public String getUsername() {
      
        return username;
    }
    
    
    
    
    public student( String name, int age, String DOB, long Id)
    {
        this.name = name;
        this.age = age;
        this.DOB = DOB;
        this. Id = Id;
        username = name + String.valueOf(age);
        
    
    } 
    
    
}
