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
public class Node<T> {
    // Variables
    public T value;
    public Node next;
    public Node previous;
    
    // Constructor
    public Node(T value){
        this.value = value;
    }
    // Will get the value of the node
    public T getValue(){
        return value;
    }
    // Will get the next node.
    public Node getNext(){
        return next;
    }
    // Will set the value of the node.
    public void setValue(T value){
        this.value = value;
    }
    // Will set the next node.
    public void setNext(Node next){
        this.next = next;
    }
    
    
}
