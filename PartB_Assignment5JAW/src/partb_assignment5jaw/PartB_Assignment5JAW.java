/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package partb_assignment5jaw;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author bastianugalde
 */
public class PartB_Assignment5JAW {

    /**
     * @param args the command line arguments
     * Method for testing
     */
    public static void main(String[] args) {
        
        //Creating student object
        ArrayList<Student> students = new ArrayList<Student>(); 
        students.add(new Student(823, "Bastian", "john@gmail.com", "042471923", "Software Development", "20/10/2020")); 
        students.add(new Student(456, "Angela", "angela@gmail.com", "042876246", "Web Development", "18/10/2020")); 
        students.add(new Student(789, "Dale", "dale@gmail.com", "040987567", "Cyber Security", "17/10/2020")); 
        System.out.println("---TESTING STUDENT---");
        //Printing students unsorted first
        System.out.println("Unsorted:"); 
        for (Student s : students) 
            System.out.println(s); 
        //Sorting student by ID using comparator interface
        Collections.sort(students, new SortByIdStudent()); 
        System.out.println("\nSorted by ID:"); 
        for (Student s : students) 
            System.out.println(s); 
        
        
        //Creating course objects
        ArrayList<Course> courses = new ArrayList<Course>(); 
        courses.add(new Course(823, "4DD", 100.00)); 
        courses.add(new Course(456, "5DB", 200.00)); 
        courses.add(new Course(789, "5WORK", 300.00)); 
        System.out.println("\n---TESTING COURSE---");
        //Printing courses unsorted first
        System.out.println("Unsorted:"); 
        for (Course c : courses) 
            System.out.println(c); 
        //Sorting courses by courseCode using comparator interface
        Collections.sort(courses, new SortByIdCourse()); 
        System.out.println("\nSorted by CourseCode:"); 
        for (Course c : courses) 
            System.out.println(c); 
        
        
        //Creating enrollment objects
        ArrayList<Enrollment> enrollments = new ArrayList<Enrollment>(); 
        enrollments.add(new Enrollment(823,"20/10/2020", 1, 2)); 
        enrollments.add(new Enrollment(456,"18/10/2020", 2, 2)); 
        enrollments.add(new Enrollment(789,"17/10/2020", 3, 1)); 
        System.out.println("\n---TESTING ENROLLMENT---");
        //Printing enrollments unsorted first
        System.out.println("Unsorted:"); 
        for (Enrollment e : enrollments) 
            System.out.println(e); 
        //Sorting enrollments by enrollmentID using comparator interface
        Collections.sort(enrollments, new SortByIdEnrollment()); 
        System.out.println("\nSorted by EnrollmentID:"); 
        for (Enrollment e : enrollments) 
            System.out.println(e);
  
    }
    
}
