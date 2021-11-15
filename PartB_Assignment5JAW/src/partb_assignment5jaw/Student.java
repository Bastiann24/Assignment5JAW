/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package partb_assignment5jaw;
import java.util.*;
import java.lang.*;
import java.io.*;

/**
 *
 * @author bastianugalde
 */
public class Student {
    
    /**
    *
    * Variables
    */
    int id;
    String name;
    String email;
    String telNum;
    String program;
    String dateRegistered;

    /**
    *
    * Constructor
    */
    public Student(int id, String name, String email, String telNum, String program, String dateRegistered) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.telNum = telNum;
        this.program = program;
        this.dateRegistered = dateRegistered;
    }

    /**
    *
    * Override toString
    */
    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", email=" + email + ", telNum=" + telNum + ", program=" + program + ", dateRegistered="+ dateRegistered +'}';
    }
    
    /**
    *
    * Override equals
    */
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
    
    /**
    *
    * Override hashCode
    */
    @Override
    public int hashCode(){
        return id;
    }
    
}
