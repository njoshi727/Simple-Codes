/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

// Java Programme for Queue implementation using Linked List
class IntegerQueueUsingLinkedList{
    
    QNode front,rear;
    IntegerQueueUsingLinkedList()
    {
        this.front = this.rear = null;
    }
    
    class QNode{
        int data;
        QNode next;
        
        QNode(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    
    //Method to add any Queue 
    void enqueue(int data)
    {
        QNode new_Rear = new QNode(data);
        if(rear == null)
        {
            rear = front = new_Rear;
            return;
        }
        
        rear.next = new_Rear;
        rear= new_Rear;
    }
    
    int dequeue()
    {
        if(front == null)
        {
            return -1;
        }
        
        int value = front.data;
        front=front.next;
        if(front==null)
        {
            front=rear=null;
        }
        
        return value;
    }
    // OverSee Next Element to be remved.
    int peek()
    {
        if(front==null)
        {
            return -1;
        }
        
        int value = front.data;
        
        return value;
    }
    // display linked list in order of 'to be removed'
    void display()
    {
       QNode temp = front;
       while(temp!=null)
       {
           System.out.println(temp.data);
           temp = temp.next;
       }
    }
}

//Main Class to test Our Queue Class
public class Main{
    public static void main (String[] args) {
        IntegerQueueUsingLinkedList queue = new IntegerQueueUsingLinkedList();
        
        queue.enqueue(15);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        queue.enqueue(20);
        queue.enqueue(68);
        queue.enqueue(71);
        System.out.println(queue.peek());
        queue.display();
        
    }
    
}