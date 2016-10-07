/*
 * David Richard Dunn
 * 12100858
 * d.dunn8@nuigalway.ie
 */

package com.daverickdunn.ct417.registrationsystem;
import java.util.Iterator;
import java.util.ArrayList;

public class Module {
    
//  Module Name, ID (CT417), List of students
    public String name;
    public String id;
    public ArrayList<Student> students;
    
    public Module(String name, String id){
        this.name = name;
        this.id = id;
        this.students = new ArrayList();
    }
    
    public void addStudent(Student student){
        this.students.add(student);
        student.addModule(this);
    }
    
    public void removeStudent(Student student){
        for (Iterator<Student> iter = this.students.listIterator(); iter.hasNext(); ) {
            Student s = iter.next();
            if (s == student) {
                iter.remove();
            }
        }
    }
    
    public ArrayList<Student> getStudents(){
        return this.students;
    }
    
    @Override
    public String toString(){
        return "name: " + this.name + "\nID: " + this.id;
    }
    
}
