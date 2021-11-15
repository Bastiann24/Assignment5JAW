/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package partc_assignment5jaw;
import java.util.*;
import java.lang.*;
import java.io.*;

/**
 *
 * @author bastianugalde
 * 
 */

public class Student implements Comparable<Student>{
    
    int id;
    String name;
    String email;
    String telNum;
    String program;
    String dateRegistered;


    public Student(int id, String name, String email, String telNum, String program, String dateRegistered) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.telNum = telNum;
        this.program = program;
        this.dateRegistered = dateRegistered;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getTelNum() {
        return telNum;
    }

    public String getProgram() {
        return program;
    }

    public String getDateRegistered() {
        return dateRegistered;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelNum(String telNum) {
        this.telNum = telNum;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public void setDateRegistered(String dateRegistered) {
        this.dateRegistered = dateRegistered;
    }
    

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", email=" + email + ", telNum=" + telNum + ", program=" + program + ", dateRegistered="+ dateRegistered +'}';
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        if(this == obj){
            return true;
        }
        final Student other = (Student) obj;
        if (this.id != other.id ) {
            return false;
        }
        
        return true;
    }
    
    @Override
    public int hashCode(){
        return id;
    }
    
    // Override compareTo method to make class comparable and so allows binarysearch.
    @Override
    public int compareTo(Student s)
    {
        return id - s.getId();
    }

}
