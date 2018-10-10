/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.softeng3assignment1;
import java.time.*;
import java.util.ArrayList;
import org.joda.time.DateTime;


/**
 *
 * @author Joseph
 */
public class courseProgramme {

   

    public String getName() {
        return name;
    }

    public DateTime getFinish() {
        return finish;
    }

    

    public DateTime getStart() {
        return start;
    }

    private final String name;
    private final DateTime finish;
    private final DateTime start;
    private ArrayList<String> listMods = new ArrayList();
    
    
    
    public void addModules(module m){
        listMods.add(m.getModname());
        
    }

    
    //returns list of modules
    public ArrayList<String> getListMods() {
        return listMods;
    }
    
    
    public courseProgramme (String name , DateTime start, DateTime finish ){
        
        this.name = name;
        this.start = start;
        this.finish = finish;
        
    }
    
}
