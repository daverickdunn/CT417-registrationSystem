/*
 * David Richard Dunn
 * 12100858
 * d.dunn8@nuigalway.ie
 */

package com.daverickdunn.ct417.registrationsystem;
import java.util.Iterator;
import java.util.ArrayList;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class CourseProgramme {
    
//  Course Name (CS & IT or ECE, etc), List of modules, Academic Start date and End dates. Start and end dates should use Joda Time classes
    private String name;
    private ArrayList<Module> modules;
    private LocalDate startDate;
    private LocalDate endDate;
    private DateTimeFormatter formatter = DateTimeFormat.forPattern("dd-mm-yyyy");

    
    public CourseProgramme(String name){
        this.name = name;
        this.modules = new ArrayList();
    }
    
    public CourseProgramme(String name, LocalDate startDate, LocalDate endDate){
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
    }
    
    public void setStartDate(String startDate){
        this.startDate = LocalDate.parse(startDate, this.formatter);
    }
    
    public void setEndDate(String endDate){
        this.endDate = LocalDate.parse(endDate, this.formatter);
    }
    
    public void addModule(Module module){
        this.modules.add(module);
    }
    
    public void removeModule(Module module){
        for (Iterator<Module> iter = this.modules.listIterator(); iter.hasNext(); ) {
            Module m = iter.next();
            if (m == module) {
                iter.remove();
            }
        }
    }
    
    public ArrayList getModules(){
        return this.modules;
    }
    
    @Override
    public String toString(){
        return "name: " + this.name + "\nstart: " + this.startDate.toString() + "\nend: " + this.endDate.toString();
    }
}