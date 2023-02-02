package StackDS;

public class StackUsingArray {
    final static int MAX_SIZE = 16;
    int arr[] =new int[MAX_SIZE],top;

    //Constructor 
    StackUsingArray()
    {
        top = -1;
    }

    // Creating push function 
    // push the element into the array
    public void pushThis(int num){
        if(top == MAX_SIZE-1)       throw new IllegalThreadStateException("Hehee");
        arr[++top] = num;
    }

    // Creating pop function
    // pop the element out of the function
    public int popNow() {
        if(top == -1)  throw new IllegalThreadStateException("Array is empty");
        return arr[top--];
    }

    public int peekNow()
    {
        if(top == MAX_SIZE-1)       throw new IllegalThreadStateException("Hehee");
        if(top == -1)  throw new IllegalThreadStateException("Array is empty");

        return arr[top];
    }

    public void display(){
        for(int i = 0;i<=top;i++) System.out.print(arr[i]+" ");
    }


    
}
