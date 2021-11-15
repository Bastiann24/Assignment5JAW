/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parta_assignment5jaw;

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
    * ToString method
    */
    @Override
    public String toString() {
        return "Course{" + "courseCode=" + courseCode + ", courseName=" + courseName + ", cost=" + cost + '}';
    }
    
    /**
    *
    * Override equals method
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
    * Override hashCode method
    */
    @Override
    public int hashCode(){
        return courseCode;
    }
    
}
