/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parte_assignment5jaw;
import java.util.*;
import java.lang.*;
import java.io.*;

/**
 *
 * @author bastianugalde
 */
public class Enrollment {
    
    int enrollmentID;
    String dateEnrolled;
    int grade;
    int semester;

    public Enrollment(int enrollmentID, String dateEnrolled, int grade, int semester) {
        this.enrollmentID = enrollmentID;
        this.dateEnrolled = dateEnrolled;
        this.grade = grade;
        this.semester = semester;
    }

    public int getEnrollmentID() {
        return enrollmentID;
    }

    public void setEnrollmentID(int enrollmentID) {
        this.enrollmentID = enrollmentID;
    }

    public String getDateEnrolled() {
        return dateEnrolled;
    }

    public void setDateEnrolled(String dateEnrolled) {
        this.dateEnrolled = dateEnrolled;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }
    
    
    
    @Override
    public String toString() {
        return "Enrollment{" + "enrollmentID=" + enrollmentID + ", dateEnrolled=" + dateEnrolled + ", grade=" + grade + ", semester=" + semester  +'}';
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
        final Enrollment other = (Enrollment) obj;
        if (this.enrollmentID != other.enrollmentID ) {
            return false;
        }
        
        return true;
    }
    
    @Override
    public int hashCode(){
        return enrollmentID;
    }
    
    // CompareTo Method for sorting so we can create our own algortihm
    public int compareTo(Enrollment e)
    {
        int res = 0;
        if (this.enrollmentID < e.getEnrollmentID()){
            res =- 1;
        }
        if (this.enrollmentID > e.getEnrollmentID()){
            res =1;
        }
        return res;
    }
    
    
    
}
