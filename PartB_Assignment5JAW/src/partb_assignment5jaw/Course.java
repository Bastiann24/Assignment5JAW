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
public class Course {
    
    /**
    *
    * Variables
    */
    int courseCode;
    String courseName;
    Double cost;

    /**
    *
    * Constructor
    */
    public Course(int courseCode, String courseName, Double cost) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.cost = cost;
    }

    /**
    *
    * Override toString
    */
    @Override
    public String toString() {
        return "Course{" + "courseCode=" + courseCode + ", courseName=" + courseName + ", cost=" + cost + '}';
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
        final Course other = (Course) obj;
        if (this.courseCode != other.courseCode ) {
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
        return courseCode;
    }
    
}
