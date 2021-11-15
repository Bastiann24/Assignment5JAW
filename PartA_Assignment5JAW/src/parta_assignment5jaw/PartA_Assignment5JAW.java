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
public class PartA_Assignment5JAW {

    /**
     * @param args the command line arguments
     * Method for testing
     */
    public static void main(String[] args) {
       // Create Student Objects
       Student s1 = new Student(123, "Bastian", "john@gmail.com", "042471923", "Software Development", "20/10/2020");
       Student s2 = new Student(456, "Angela", "angela@gmail.com", "042876246", "Web Development", "18/10/2020");
       Student s3 = new Student(789, "Dale", "dale@gmail.com", "040987567", "Cyber Security", "17/10/2020");
       Student s4 = s1;
       Student s5 = null;
       Student s6 = new Student(123, "Bastian", "john@gmail.com", "042471923", "Software Development", "20/10/2020");
       // Testing equals method
       System.out.println("---TESTING STUDENT---");
       System.out.println(s1.equals(s2));//should be false
       System.out.println(s1.equals(s3));//should be false
       System.out.println(s2.equals(s3));//should be false
       System.out.println(s1.equals(s4));//should be true
       System.out.println(s1.equals(s5));//should be false
       System.out.println(s1.equals(s6));//should be true
       // Testing hashcode method overwritten
       System.out.println(s1.hashCode());
       System.out.println(s2.hashCode());
       System.out.println(s3.hashCode());
       System.out.println(s4.hashCode());
       System.out.println(s6.hashCode());
       
       // Create Course Objects
       Course c1 = new Course(123, "4DD", 100.00);
       Course c2 = new Course(456, "4CLP", 200.00);
       Course c3 = new Course(789, "5WORK", 300.00);
       Course c4 = c1;
       Course c5 = null;
       Course c6 = new Course(123, "4DD", 100.00);
       // Testing equals method
       System.out.println("---TESTING COURSE---");
       System.out.println(c1.equals(c2));//should be false
       System.out.println(c1.equals(c3));//should be false
       System.out.println(c2.equals(c3));//should be false
       System.out.println(c1.equals(c4));//should be true
       System.out.println(c1.equals(c5));//should be false
       System.out.println(c1.equals(c6));//should be true
       // Testing hashcode method overwritten
       System.out.println(c1.hashCode());
       System.out.println(c2.hashCode());
       System.out.println(c3.hashCode());
       System.out.println(c4.hashCode());
       System.out.println(c6.hashCode());
       
       // Create Enrollment Objects
       Enrollment e1 = new Enrollment(123,"20/10/2020", 1, 2);
       Enrollment e2 = new Enrollment(456,"18/10/2020", 2, 2);
       Enrollment e3 = new Enrollment(789,"17/10/2020", 3, 1);
       Enrollment e4 = e1;
       Enrollment e5 = null;
       Enrollment e6 = new Enrollment(123,"20/10/2020", 1, 2);
       // Testing equals method
       System.out.println("---TESTING ENROLLMENT---");
       System.out.println(e1.equals(e2));//should be false
       System.out.println(e1.equals(e3));//should be false
       System.out.println(e2.equals(e3));//should be false
       System.out.println(e1.equals(e4));//should be true
       System.out.println(e1.equals(e5));//should be false
       System.out.println(e1.equals(e6));//should be true
       // Testing hashcode method overwritten
       System.out.println(e1.hashCode());
       System.out.println(e2.hashCode());
       System.out.println(e3.hashCode());
       System.out.println(e4.hashCode());
       System.out.println(e6.hashCode());
       
       
    }
    
}
