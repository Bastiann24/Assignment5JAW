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
 */
public class Course implements Comparable <Course>{
    
    int courseCode;
    String courseName;
    Double cost;

    public Course(int courseCode, String courseName, Double cost) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.cost = cost;
    }

    public int getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(int courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }
    
    

    @Override
    public String toString() {
        return "Course{" + "courseCode=" + courseCode + ", courseName=" + courseName + ", cost=" + cost + '}';
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
        final Course other = (Course) obj;
        if (this.courseCode != other.courseCode ) {
            return false;
        }
        
        return true;
    }
    
    @Override
    public int hashCode(){
        return courseCode;
    }
    
    // Override compareTo method to make class comparable and so allows binarysearch.
    @Override
    public int compareTo(Course s)
    {
        return courseCode - s.getCourseCode();
    }
    
}
