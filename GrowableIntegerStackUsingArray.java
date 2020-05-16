/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

// Java Programme to form Unique Kind of Growable Array.
//We are read to allocate a certain memory for our stack and we don't have any problem regarding 
//that much memory after that We want to be little carefull in allocating New Memory to Stack.
//So We choose Following Algorithm to develop Growable Stack using Array

//1.If Size of Stack is less than or equal to 'n',We don't have any problem.
//2.If Stack size increases after 'n',We have to increase it by 50%.
//3.Let assume if we grow array to '2n',but our stack decreases to size 'n'
//  then we will decrease our array Size to '1.5n'.


class GrowableIntegerStack{
    int top;
    int curSize ;  // current Size ,ok! It will always remain top+1; 
    final int size;
    int[] a ;
    int  allSize; // It will define a maximum allowed Size of Array at a particular time.
    
    GrowableIntegerStack(int size)
    {
        this.size = size;
        this.a = new int[size];
        this.top = -1;
        this.curSize = 0; 
        this.allSize = size;
    }
    
    int[] growArray(int[] a)
    {
        int a_size = a.length;
        int new_Size = a_size + (int)(0.5*a_size);
        int[] new_Array = new int[new_Size];
        
        for(int i = 0;i<a_size;i++)
        {
            new_Array[i]= a[i];
        }
        allSize = new_Size;
        
        return new_Array;
        
    }
    
    int[] shrinkArray(int[] a)
    {
        int a_size = a.length;
        int new_Size = a_size - (int) (0.25*a_size);
        
        if(new_Size < size)
        {
            new_Size = size;
        }
        int[] new_Array = new int[new_Size];
        
        for(int i = 0;i<a_size;i++)
        {
            new_Array[i]= a[i];
        }
        allSize = new_Size;
        
        return new_Array;
         
    }
    
    void push(int data)
    {
        if(top>=allSize-1)
        {
            this.a = growArray(a);
        }
        
        a[++top]=data;
    }
    
    int pop()
    {
        if(top==-1)
        {
            return -1;
        }
        int element = a[top--];
        if(top<=(int)(0.5*allSize)&& top>size)
        {
            this.a = shrinkArray(a);
        }
        
        return element;
    }

    int peek()
    {
        if(top==-1)
        {
            return -1;
        }
        int element = a[top];
        
        return element;
    }
    
    void display()
    {
        for(int i=top;i>=0;i--)
        {
            System.out.println(a[i]);
        }
    }
    
}

//Driver Method to test Our class
public class Main{
    public static void main (String[] args) {
        
        GrowableIntegerStack stack = new GrowableIntegerStack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        stack.push(10);
        
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        
        stack.push(11);
        stack.push(12);
        System.out.println(stack.peek());
        stack.display();
        
        
        
    }
}