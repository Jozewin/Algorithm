package StackDS;

public class StackUsingList {
    class Node {
        int val;
        Node next;
        Node(int data )
        {
            val = data;
            next = null;
        }       
    }

    Node top;
    StackUsingList(){
        top = null;
    }

    // Push the val into the list
    public void push(int val){
        Node newNode = new Node(val);
        newNode.next = top;
        top = newNode;
    }

    // Pop the val out of list
    public int pop()
    {
        if(top == null) throw new ArithmeticException("Error");

        int temp = top.val;
        top = top.next;

        return temp;
    }
    
}
