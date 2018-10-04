/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.softeng3assignment1;

import java.util.ArrayList;

/**
 *
 * @author Joseph
 */
public class module {

    public String getModname() {
        return Modname;
    }

    public String getId() {
        return id;
    }

    private final String Modname;
    private final String id;
    private ArrayList<student> listStudents = new ArrayList();
    
    

    public ArrayList<student> getListStudents() {
        return listStudents;
    }

    public void setListStudents(ArrayList<student> listStudents) {
        this.listStudents = listStudents;
    }
    
    
    public void addStudent(student s){
        listStudents.add(s); //adds student with their module to a list
    }
    
    public ArrayList<student> numStudentsPerModule(String name)
    {
        
        return  listStudents;
     
    }
    
    public module(String Modname, String id)
    {
        this.Modname = Modname;
        this.id = id;
    }
   
    
}
