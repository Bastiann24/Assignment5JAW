/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parte_assignment5jaw;

/**
 *
 * @author bastianugalde
 */
public class PartE_Assignment5JAW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Creating student objects
        Student s1 = new Student(823, "Bastian", "john@gmail.com", "042471923", "Software Development", "20/10/2020");
        Student s2 = new Student(456, "Angela", "angela@gmail.com", "042876246", "Web Development", "18/10/2020");
        Student s3 = new Student(789, "Dale", "dale@gmail.com", "040987567", "Cyber Security", "17/10/2020");
        // Creating student nodes
        Node<Student> myNodeStudent = new Node<Student>(s1);
        Node<Student> myNodeStudent2 = new Node<Student>(s2);
        Node<Student> myNodeStudent3 = new Node<Student>(s3);
        
        // Creating course objects
        Course c1 = new Course(123, "4DD", 100.00);
        Course c2 = new Course(456, "4CLP", 200.00);
        Course c3 = new Course(289, "5WORK", 300.00);
        // Creating course nodes
        Node<Course> myNodeCourse = new Node<Course>(c1);
        Node<Course> myNodeCourse2 = new Node<Course>(c2);
        Node<Course> myNodeCourse3 = new Node<Course>(c3);
        
        // Creating enrollment objects
        Enrollment e1 = new Enrollment(243,"20/10/2020", 1, 2);
        Enrollment e2 = new Enrollment(956,"18/10/2020", 2, 2);
        Enrollment e3 = new Enrollment(189,"17/10/2020", 3, 1);
        // Creating enrollment nodes
        Node<Enrollment> myNodeEnrollment = new Node<Enrollment>(e1);
        Node<Enrollment> myNodeEnrollment2 = new Node<Enrollment>(e2);
        Node<Enrollment> myNodeEnrollment3 = new Node<Enrollment>(e3);
        
        // Creating linked and doubly linked lists of Student type.
        LinkedList<Student> myLinkedListStudent = new LinkedList<Student>();
        DoublyLinkedList<Student> myDoublyLinkedListStudent = new DoublyLinkedList<Student>();
        
        // Creating linked and doubly linked lists of Course type.
        LinkedList<Course> myLinkedListCourse = new LinkedList<Course>();
        DoublyLinkedList<Course> myDoublyLinkedListCourse = new DoublyLinkedList<Course>();
        
        // Creating linked and doubly linked lists of Enrollment type.
        LinkedList<Enrollment> myLinkedListEnrollment = new LinkedList<Enrollment>();
        DoublyLinkedList<Enrollment> myDoublyLinkedListEnrollment = new DoublyLinkedList<Enrollment>();
        
        // Testing starts here.
        System.out.println("******TESTING LINKED LIST ******");
        
        System.out.println("---Testing addlast method in linked list student---");
        myLinkedListStudent.AddLast(myNodeStudent);
        myLinkedListStudent.AddLast(myNodeStudent2);
        myLinkedListStudent.AddLast(myNodeStudent3);
        System.out.println(myLinkedListStudent.toString());
        
        System.out.println("---Testing addfirst method in linked list course---");
        myLinkedListCourse.addFirst(myNodeCourse);
        myLinkedListCourse.addFirst(myNodeCourse2);
        myLinkedListCourse.addFirst(myNodeCourse3);
        System.out.println(myLinkedListCourse.toString());
        
        System.out.println("---Testing removefirst method in linked list course---");
        myLinkedListCourse.removeFirst();
        System.out.println(myLinkedListCourse.toString());
        
        System.out.println("---Testing removelast method in linked list student---");
        myLinkedListStudent.removeLast();
        System.out.println(myLinkedListStudent.toString());
        
        System.out.println("---Testing find method in linked list enrollment (should be false)---");
        boolean found = myLinkedListEnrollment.contains(e1);
        if (found != true){
            System.out.println("The enrollment was not found in the list.");
        }
        
        
        System.out.println("\n ******TESTING DOUBLY LINKED LIST NOW******");
        
        
        System.out.println("---Testing addlast method in doubly list student---");
        myDoublyLinkedListStudent.addLast(myNodeStudent);
        myDoublyLinkedListStudent.addLast(myNodeStudent2);
        myDoublyLinkedListStudent.addLast(myNodeStudent3);
        myDoublyLinkedListStudent.display();
        
        System.out.println("\n---Testing addfirst method in doubly list course---");
        myDoublyLinkedListCourse.addFirst(myNodeCourse);
        myDoublyLinkedListCourse.addFirst(myNodeCourse2);
        myDoublyLinkedListCourse.addFirst(myNodeCourse3);
        myDoublyLinkedListStudent.display();
        
        System.out.println("\n---Testing removefirst method in doubly list course---");
        myDoublyLinkedListCourse.removeFirst();
        myDoublyLinkedListCourse.display();
        
        System.out.println("\n---Testing removelast method in doubly list student---");
        myDoublyLinkedListStudent.removeLast();
        myDoublyLinkedListStudent.display();
        
        System.out.println("\n---Testing find method in linked list enrollment (Should be false)---");
        boolean found2 = myDoublyLinkedListEnrollment.contains(e1);
        if (found2 != true){
            System.out.println("The enrollment was not found in the list.");
        }
    }

}
