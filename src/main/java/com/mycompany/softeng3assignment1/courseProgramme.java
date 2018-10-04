/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.softeng3assignment1;
import java.time.*;
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

    public module getModules() {
        return modules;
    }

    public DateTime getStart() {
        return start;
    }

    private final String name;
    private final DateTime finish;
    private final module modules;
    private final DateTime start;
    
    
    public courseProgramme (String name, module m, DateTime start, DateTime finish ){
        
        this.name = name;
        this.modules = m;
        this.start = start;
        this.finish = finish;
        
    }
    
}
