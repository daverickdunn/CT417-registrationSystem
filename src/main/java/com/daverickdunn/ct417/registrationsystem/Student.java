/*
 * David Richard Dunn
 * 12100858
 * d.dunn8@nuigalway.ie
 */

package com.daverickdunn.ct417.registrationsystem;

import java.util.ArrayList;
import java.util.Iterator;

public class Student {
    
//  Name, Age, DOB, ID, username
    public String name;
    public int age;
    public String dob;
    public String username;
    public ArrayList<Module> modules;
    
//  DateTime dt = new DateTime(dob);
    
    public Student(String name, int age, String dob){
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.username = this.name + Integer.toString(this.age);
        this.modules = new ArrayList();
    }
    
    public String getUsername(){
        return username;
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
        return "name: " + this.name + "\nDOB: " + this.dob + "\nage: " + Integer.toString(this.age);
    }
}
