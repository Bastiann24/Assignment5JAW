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
public class Enrollment {
    
    /**
    *
    * Variables
    */
    int enrollmentID;
    String dateEnrolled;
    int grade;
    int semester;

    /**
    *
    * Constructor
    */
    public Enrollment(int enrollmentID, String dateEnrolled, int grade, int semester) {
        this.enrollmentID = enrollmentID;
        this.dateEnrolled = dateEnrolled;
        this.grade = grade;
        this.semester = semester;
    }
    
    /**
    *
    * Override toString
    */
    @Override
    public String toString() {
        return "Enrollment{" + "enrollmentID=" + enrollmentID + ", dateEnrolled=" + dateEnrolled + ", grade=" + grade + ", semester=" + semester  +'}';
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
        final Enrollment other = (Enrollment) obj;
        if (this.enrollmentID != other.enrollmentID ) {
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
        return enrollmentID;
    }
    
}
