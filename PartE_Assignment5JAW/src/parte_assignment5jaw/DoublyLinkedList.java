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
public class DoublyLinkedList<T> {
    
    // Variables
    Node<T> head;
    Node<T> tail;
    int count = 0;
    
    // Will add a node to the first position in the list.
    public void addFirst(Node<T> node){
        Node<T> temp = head;
        head = node;
        head.next = temp;
        if(count == 0){
            tail = head;
        }
        else {
            temp.previous = head;
        }
        count++;
    }
    
    // Will add a node to the last position in the list.
    public void addLast(Node<T> node){
        if (count == 0){
            head = node;
        }
        else {
            tail.next = node;
            node.previous = tail;
        }
        tail = node;
        count++;
    }
    
    // Will remove the first node of the list.
    public void removeFirst(){
        if (count != 0){
            head = head.next;
            count--;
            if (count == 0){
                tail = null;
            }
            else {
                head.previous = null;
            }
        }
    }
    
    // Will remove the last node of the list.
    public void removeLast(){
        if (count !=0){
            if (count ==1){
                head = null;
                tail = null;
            }
            else {
                tail.previous .next = null;
                tail = tail.previous;
            }
            count--;
        }
    }
    
    // Will check if the item is in the list.
    public boolean contains (T item){
        Node<T> current = head;
        while (current != null){
            if (current.value.equals(item)){
                return true;
            }
            current = current.next;
        }
        return false;
    }
    
    // Will display the list
    public void display() {  
 
        Node current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        System.out.println("Doubly linked list: ");  
        while(current != null) {   
            System.out.print(current.value + " ");  
            current = current.next;  
        }  
    }  
    
}
