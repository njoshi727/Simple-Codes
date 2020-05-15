/*package whatever //do not write package name here */

import java.io.*;
public class Main{
 public static void main (String[] args) {
        
     StackUsingArray stack = new StackUsingArray(500);
     stack.push(1000);
     System.out.println(stack.pop());
     stack.push(500);
     System.out.println(stack.pop());
     stack.push(700);
     stack.push(500);
      stack.push(1000);
      
      System.out.println(stack.pop());
      System.out.println(stack.pop());
      System.out.println(stack.pop());
     
     
   
   }


}
class StackUsingArray{
    
    int size;
    int top;
    int arr[];
    
    public StackUsingArray(int size)
    {
        this.size = size;
        this.top = -1;
        this.arr = new int[this.size];
    }
    
    
    
    
    boolean isEmpty()
    {
        return top<0;
    }
    
    boolean push(int data)
    {
        if(top>=size-1)
            return false;
        
        else
        {
          
           arr[++top] = data;
           return true;
        }
    }
    
    int pop()
    {
        if(top>=0)
        {
            return arr[top--];
        }
        
        return -1;
    }
    
    int peek()
    {
        
        if(top>=0)
        {
            return arr[top];
        }
        
        return -1;
    }
}