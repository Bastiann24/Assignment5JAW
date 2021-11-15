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
    * ToString method
    */
    @Override
    public String toString() {
        return "Enrollment{" + "enrollmentID=" + enrollmentID + ", dateEnrolled=" + dateEnrolled + ", grade=" + grade + ", semester=" + semester  +'}';
    }
    
    /**
    *
    * Equals
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
    * hashCode method
    */
    @Override
    public int hashCode(){
        return enrollmentID;
    }
    
}
