/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

// Main Class To check out working of the class that we have made
public class Main{
    public static void main (String[] args) {
        IntegerLinkedListUsingStacks stack = new IntegerLinkedListUsingStacks();
        stack.push(35);  // pushing 35 to the stack
        stack.push(70);
        System.out.println(stack.pop()); // Last item pushed in stack was 70,so '70' will pop out
        stack.push(123);
        stack.push(321);
        stack.push(95);
        
        System.out.println(stack.peek()); // Head is 95(Last item pushed).. So it will return 95 nut don't delete it.
        stack.display();// print out complete stack 
    }
}


class IntegerLinkedListUsingStacks{
    
    Node head;   // declaring head of the Stack
    
    private class Node{  // inner class 
        
        int item;         // A node will have two Fields. First is item that we want to store in Stack
        Node next;      // Second is node(reference) of next node.
        
        Node(int item){
            this.item = item;
            this.next = null;
        }
    }
    
    //Function to push item in stack
    void push(int item)
    {
        Node new_Node = new Node(item);
        if(head == null)
        {
            head  = new_Node;
            return;
        }
        
        new_Node.next = head;
        head = new_Node;
      
    }
    // Function to pop out item from index
    int pop()
    {
        if(head ==null)
        {
            return -1;
        }
       
        int item = head.item;
        head = head.next;
        
        return item;
        
    }
    // Function to peek or see the top element
    int peek()
    {
        if(head==null)
        {
            return -1;
        }
        
        int item = head.item;
        return item;
    }
    
    //Function to print full Stack
    void display()
    {
        while(head!=null)
        {
            System.out.println(head.item);
            head = head.next;
        }
    }
    
}