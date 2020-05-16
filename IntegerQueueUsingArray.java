/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

//Java Programme to Create Queue of an Array
//  It will have following functions:
//1. "enqueue" --- > to add an element.
//2. "dequeue" --- > to remove an element.
//3. "peek"  -----> to get item to be removed but actually not removing it.
//4. "display" ----> to display/print entire Queue

class IntegerQueueUsingArray{
     int front;     // Index of front element will always remain zero.
     int end;      // index of Last element
     int[] a;     // Array
     int size;   // size of Queue user want
     
     //Constructor
     IntegerQueueUsingArray(int size)
     {
         this.front = this.end = -1;
         this.size = size;
         this.a = new int[size];
     }
     
     void enqueue (int x) // x is element to be added.
     {
        if(++end>=size-1)
        {
            return; // We will not take any action in such case or we can print out message
             // of "OverFlow Error"
        }
        
        a[end]=x;
        
        if(front==-1)
        { 
            front = 0;
            
        }
     }
     
     int dequeue()
     {
         if(front==-1)
         {
             System.out.println("Queue is Empty");
             return -1;
         }
         
         int element = a[front];
         for(int i=0;i<a.length-1;i++)
         {
             a[i] = a[i+1];
         }
         end--;
         return element;
     }
     
     int peek()
     {
         if(front==-1)
         {
             System.out.println("Queue is Empty");
             return -1;
         }
         
         int element = a[front];
         return element;
     }
     
     void display()
     {
         for(int i=0;i<end+1;i++)
         {
           System.out.println(a[i]);  
         }
     }
}

public class Main{
    public static void main (String[] args) {
        IntegerQueueUsingArray q = new IntegerQueueUsingArray(12);
        System.out.println(q.dequeue());
        q.enqueue(15);
        q.enqueue(30);
        q.enqueue(45);
        q.enqueue(65);
        q.enqueue(75);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        
        q.enqueue(25);
        q.enqueue(35);
        System.out.println(q.peek());
        
        q.display();
    }
}
