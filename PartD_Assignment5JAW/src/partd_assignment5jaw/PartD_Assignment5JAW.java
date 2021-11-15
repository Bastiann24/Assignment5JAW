/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package partd_assignment5jaw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author bastianugalde
 */
public class PartD_Assignment5JAW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
        // TESTING STUDENT
        
        List<Student> students = new ArrayList<Student>();
        Student s1 = new Student(823, "Bastian", "john@gmail.com", "042471923", "Software Development", "20/10/2020");
        Student s2 = new Student(456, "Angela", "angela@gmail.com", "042876246", "Web Development", "18/10/2020");
        Student s3 = new Student(789, "Dale", "dale@gmail.com", "040987567", "Cyber Security", "17/10/2020");
        students.add(s1); 
        students.add(s2); 
        students.add(s3);
        System.out.println("---TESTING BUBBLE SORT FOR STUDENT---");
        System.out.println("List before sorting by ID: ");
        students.forEach(e -> System.out.print(e + "\n"));
        bubbleSortArrayListStudent(students);
        System.out.println("\nList after sorting by ID: ");
        students.forEach(e -> System.out.print( e + "\n"));
        
        Collections.shuffle(students);
        
        System.out.println("\n---TESTING INSERTION SORT FOR STUDENT---");
        System.out.println("List before sorting by ID: ");
        students.forEach(e -> System.out.print(e + "\n"));
        insertionSortArrayListStudent(students);
        System.out.println("\nList after sorting by ID: ");
        students.forEach(e -> System.out.print(e + "\n"));
        
        Collections.shuffle(students);
        
        System.out.println("\n---TESTING SELECTION SORT FOR STUDENT---");
        System.out.println("List before sorting by ID: ");
        students.forEach(e -> System.out.print(e + "\n"));
        selectionSortStudent(students);
        System.out.println("\nList after sorting by ID: ");
        students.forEach(e -> System.out.print(e + "\n"));
        
        // TESTING COURSE
        
        List<Course> courses = new ArrayList<Course>();
        Course c1 = new Course(123, "4DD", 100.00);
        Course c2 = new Course(456, "4CLP", 200.00);
        Course c3 = new Course(289, "5WORK", 300.00);
        courses.add(c1); 
        courses.add(c2); 
        courses.add(c3);
        System.out.println("\n---TESTING BUBBLE SORT FOR COURSE---");
        System.out.println("List before sorting by ID: ");
        courses.forEach(e -> System.out.print(e + "\n"));
        bubbleSortArrayListCourse(courses);
        System.out.println("\nList after sorting by ID: ");
        courses.forEach(e -> System.out.print( e + "\n"));
        
        Collections.shuffle(courses);
        
        System.out.println("\n---TESTING INSERTION SORT FOR COURSE---");
        System.out.println("List before sorting by ID: ");
        courses.forEach(e -> System.out.print(e + "\n"));
        insertionSortArrayListCourse(courses);
        System.out.println("\nList after sorting by ID: ");
        courses.forEach(e -> System.out.print(e + "\n"));
        
        Collections.shuffle(courses);
        
        System.out.println("\n---TESTING SELECTION SORT FOR COURSE---");
        System.out.println("List before sorting by ID: ");
        courses.forEach(e -> System.out.print(e + "\n"));
        selectionSortCourse(courses);
        System.out.println("\nList after sorting by ID: ");
        courses.forEach(e -> System.out.print(e + "\n"));
        
        
        // TESTING ENROLLMENT
        
        List<Enrollment> enrollments = new ArrayList<Enrollment>();
        Enrollment e1 = new Enrollment(243,"20/10/2020", 1, 2);
        Enrollment e2 = new Enrollment(956,"18/10/2020", 2, 2);
        Enrollment e3 = new Enrollment(189,"17/10/2020", 3, 1);
        enrollments.add(e1); 
        enrollments.add(e2); 
        enrollments.add(e3);
        System.out.println("\n---TESTING BUBBLE SORT FOR ENROLLMENT---");
        System.out.println("List before sorting by ID: ");
        enrollments.forEach(e -> System.out.print(e + "\n"));
        bubbleSortArrayListEnrollment(enrollments);
        System.out.println("\nList after sorting by ID: ");
        enrollments.forEach(e -> System.out.print( e + "\n"));
        
        Collections.shuffle(enrollments);
        
        System.out.println("\n---TESTING INSERTION SORT FOR COURSE---");
        System.out.println("List before sorting by ID: ");
        enrollments.forEach(e -> System.out.print(e + "\n"));
        insertionSortArrayListEnrollment(enrollments);
        System.out.println("\nList after sorting by ID: ");
        enrollments.forEach(e -> System.out.print(e + "\n"));
        
        Collections.shuffle(enrollments);
        
        System.out.println("\n---TESTING SELECTION SORT FOR COURSE---");
        System.out.println("List before sorting by ID: ");
        enrollments.forEach(e -> System.out.print(e + "\n"));
        selectionSortEnrollment(enrollments);
        System.out.println("\nList after sorting by ID: ");
        enrollments.forEach(e -> System.out.print(e + "\n"));
        
     
        
    }
    
    // Method for Bubble Sort of Student
    public static void bubbleSortArrayListStudent(List<Student> list) {
        Student temp;
        boolean sorted = false;

        while (!sorted) {
            sorted = true;
            for (int i = 0; i < list.size()-1; i++) {
                if (list.get(i).compareTo(list.get(i + 1)) > 0) {
                    temp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, temp);
                    sorted = false;
                }
            }
        }
    }
    
    // Method for Bubble Sort of Course
    public static void bubbleSortArrayListCourse(List<Course> list) {
        Course temp;
        boolean sorted = false;

        while (!sorted) {
            sorted = true;
            for (int i = 0; i < list.size()-1; i++) {
                if (list.get(i).compareTo(list.get(i + 1)) > 0) {
                    temp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, temp);
                    sorted = false;
                }
            }
        }
    }
    
    // Method for Bubble Sort of Enrollment
    public static void bubbleSortArrayListEnrollment(List<Enrollment> list) {
        Enrollment temp;
        boolean sorted = false;

        while (!sorted) {
            sorted = true;
            for (int i = 0; i < list.size()-1; i++) {
                if (list.get(i).compareTo(list.get(i + 1)) > 0) {
                    temp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, temp);
                    sorted = false;
                }
            }
        }
    }
    
    // Method for Insertion Sort of Student
    public static void insertionSortArrayListStudent(List<Student> list) {
        for (int j = 1; j < list.size(); j++) {
            Student current = list.get(j);
            int i = j-1;
            while ((i > -1) && ((list.get(i).compareTo(current)) == 1)) {
                list.set(i+1, list.get(i));
                i--;
            }
            list.set(i+1, current);
        }
    }
    
    // Method for Insertion Sort of Course
    public static void insertionSortArrayListCourse(List<Course> list) {
        for (int j = 1; j < list.size(); j++) {
            Course current = list.get(j);
            int i = j-1;
            while ((i > -1) && ((list.get(i).compareTo(current)) == 1)) {
                list.set(i+1, list.get(i));
                i--;
            }
            list.set(i+1, current);
        }
    }
    
    // Method for Insertion Sort of Enrollemnt
    public static void insertionSortArrayListEnrollment(List<Enrollment> list) {
        for (int j = 1; j < list.size(); j++) {
            Enrollment current = list.get(j);
            int i = j-1;
            while ((i > -1) && ((list.get(i).compareTo(current)) == 1)) {
                list.set(i+1, list.get(i));
                i--;
            }
            list.set(i+1, current);
        }
    }
    
    // Method for Selection Sort of Student
    public static void selectionSortStudent(final List<Student> list) {
        for (int i = 0; i < list.size(); i++) {
            Student min = list.get(i);
            int minIndex = i;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j).id < min.id) {
                    min = list.get(j);
                    minIndex = j;
                }
            }
            if (i != minIndex) {
               Collections.swap(list, i, minIndex);
            }
        }
    }
    
    // Method for Selection Sort of Course
    public static void selectionSortCourse(final List<Course> list) {
        for (int i = 0; i < list.size(); i++) {
            Course min = list.get(i);
            int minIndex = i;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j).courseCode < min.courseCode) {
                    min = list.get(j);
                    minIndex = j;
                }
            }
            if (i != minIndex) {
               Collections.swap(list, i, minIndex);
            }
        }
    }
    
    // Method for Selection Sort of Enrollment
    public static void selectionSortEnrollment(final List<Enrollment> list) {
        for (int i = 0; i < list.size(); i++) {
            Enrollment min = list.get(i);
            int minIndex = i;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j).enrollmentID < min.enrollmentID) {
                    min = list.get(j);
                    minIndex = j;
                }
            }
            if (i != minIndex) {
               Collections.swap(list, i, minIndex);
            }
        }
    }
    
}
