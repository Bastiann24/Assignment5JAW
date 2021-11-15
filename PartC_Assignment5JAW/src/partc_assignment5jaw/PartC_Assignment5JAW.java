/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package partc_assignment5jaw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author bastianugalde
 */
public class PartC_Assignment5JAW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Testing for student
        ArrayList<Student> students = new ArrayList<Student>();
        Student s1 = new Student(123, "Bastian", "john@gmail.com", "042471923", "Software Development", "20/10/2020");
        Student s2 = new Student(456, "Angela", "angela@gmail.com", "042876246", "Web Development", "18/10/2020");
        Student s3 = new Student(789, "Dale", "dale@gmail.com", "040987567", "Cyber Security", "17/10/2020");
        students.add(s1); 
        students.add(s2); 
        students.add(s3);
        System.out.println("---SEARCHING FOR STUDENT---");
        System.out.println(s1 + " was found at index: " + binarySearch(students, s1) + " using binary search");
        System.out.println(s2 + " was found at index: " + linearSearch(students, s2) + " using linear search");
        
        //Testing for course
        ArrayList<Course> courses = new ArrayList<Course>();
        Course c1 = new Course(123, "4DD", 100.00);
        Course c2 = new Course(456, "4CLP", 200.00);
        Course c3 = new Course(789, "5WORK", 300.00);
        courses.add(c1);
        courses.add(c2);
        courses.add(c3);
        System.out.println("---SEARCHING FOR COURSE---");
        System.out.println(c1 + " was found at index: " + binarySearch(courses, c1) + " using binary search");
        System.out.println(c2 + " was found at index: " + linearSearch(courses, c2) + " using linear search");
        
        //Testing for enrollment
        ArrayList<Enrollment> enrollments = new ArrayList<Enrollment>();
        Enrollment e1 = new Enrollment(123,"20/10/2020", 1, 2);
        Enrollment e2 = new Enrollment(456,"18/10/2020", 2, 2);
        Enrollment e3 = new Enrollment(789,"17/10/2020", 3, 1);
        enrollments.add(e1);
        enrollments.add(e2);
        enrollments.add(e3);
        System.out.println("---SEARCHING FOR ENROLLMENT---");
        System.out.println(e1 + " was found at index: " + binarySearch(enrollments, e1) + " using binary search");
        System.out.println(e2 + " was found at index: " + linearSearch(enrollments, e2) + " using linear search");
        
        
    }
    
    // Algorithm for Linear Search
    public static int linearSearch(ArrayList arr, Object key){    
        for(int i=0;i<arr.size();i++){    
            if(arr.get(i) == key){    
                return i;    
            }    
        }    
        return -1;    
    }
    
    // Algorithm for binary search
    public static int binarySearch( ArrayList list, Object key ) {
        Comparable comp = (Comparable)key;

        int res = -1, min = 0, max = list.size() - 1, pos;
        while( ( min <= max ) && ( res == -1 ) ) {
            pos = (min + max) / 2;
            int comparison = comp.compareTo(list.get(pos));
            if( comparison == 0)
                res = pos;
            else if( comparison < 0)
                max = pos - 1;
            else    
                min = pos + 1;
        }
        return res;
}
    
    
}
