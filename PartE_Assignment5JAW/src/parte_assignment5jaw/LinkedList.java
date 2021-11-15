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
public class LinkedList<T> {
    Node<T> head;
    Node<T> tail;
    int count = 0;
    
    // Will get the head of the list
    public Node<T> getHead(){
        return head;
    }
    
    // Will set the head of the list
    public void setHead(Node<T> head){
        this.head = head;
    }
    
    // Will get the tail of the list
    public Node<T> getTail(){
        return tail;
    }
    
    // Will set the tail of the list
    public void setTail(Node<T> tail){
        this.tail = tail;
    }
    
    // Will add a  node to the first position in the list.
    public void addFirst(Node<T> node){
        Node<T> temp = head;
        head = node;
        head.next = temp;
        count++;
        if (count ==1){
            tail = head;
        }
    }
    
    // Will add a node to the lasy position in the list.
    public void AddLast(Node<T> node){
        if (count == 0){
            head = node;
        }
        else {
            tail.next = node;
        }
        tail = node;
        count++;
    }
    
    // Will remove the first node in the list.
    public void removeFirst(){
        if (count != 0){
            head = head.next;
            count--;
            if (count == 0){
                tail = null;
            }
        }
    }
    
    // Will check if the node is in the list.
    public boolean contains(T item){
        Node <T> current = head;
        while(current != null){
            if(current.value.equals(item)){
                return true;
            }
            current = current.next;
        }
        return false;
    }
    
    // Will remove the last node in the list.
    public void removeLast(){
        if (count != 0){
            if (count ==1){
                head = null;
                tail = null;
            }
            else{
                Node<T> current = head;
                while (current.next != tail){
                    current = current.next;
                }
                current.next = null;
                tail = current;
            }
            count--;
        }
    }
    
    // Will display the list.
    @Override
    public String toString() {
        String result = "";
        Node current = head;
        while(current.getNext() != null){
            result += current.getValue();
            if(current.getNext() != null){
                result += ", ";
                }
            current = current.getNext();
                }
            return "List: " + result;
    }
    
}
