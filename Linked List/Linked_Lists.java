package Linked_List;

import java.util.Scanner;

public class Linked_Lists<T>{


    Node head;
    class Node
    {
        T data;
        Node next;
        Node(T val)
        {
            data = val;
            next = null;
        }
    }
    Linked_Lists()
    {
        head = null;
    }
    public void insertAtBeginning(T val) {
     Node newNode = new Node(val);
     if(head==null)
     head = newNode;
     else {
         newNode.next = head;
         head = newNode;
         }
    }
    public void display()
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

    public void insertAtPosition(int pos,T val)
    {

        Node newNode = new Node(val);
        Node temp = head;
        if(pos ==0)
    {
        insertAtBeginning(val);
        return;
    }
        for (int i = 1;i<pos;i++)
        {
            temp = temp.next;
            if(temp==null)
                throw new IllegalArgumentException("Invalid position ");
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }

    public void deleteAtPosition (int pos)
    {
        // 0th position condition
        if(pos==0)
        {
            head =head.next;
            return;
        }
        Node temp = head;
        Node prev = null;
        for (int i = 1;i<=pos;i++)
        {
            prev = temp;
            temp = temp.next;
            if(temp ==null)
            {
                throw new IndexOutOfBoundsException("The given index is out of bond");
            }
        }
        prev.next=temp.next;

    }

    public T getValue(int pos)
    {
        if(pos ==0)
        {
            return head.data;
        }
        Node temp = head;
        for (int i = 1;i<=pos;i++)
        {
            temp = temp.next;
        }
        return temp.data;
    }

    public void toUpdate(int pos,T val)
    {
        if(pos ==0)
        {
            head.data =val;
        }
        Node newNode = new Node(val);
        Node temp = head;

        for (int i = 1;i<=pos;i++)
        {
            temp = temp.next;
            if(temp == null)
            {
                throw new IndexOutOfBoundsException("Out of bound Enter the valid value");
            }
        }
        temp.data = val;

    }

    public void deleteAtEnd()
    {
        if(head==null)
    {
        throw new ArithmeticException("Node is empty");
    }

        if (head.next==null)
    {
        head=head.next;
        return;
    }


    Node temp = head;
    Node prev  = null;
    while(temp.next!=null)
    {
        prev = temp;
        temp = temp.next;
    }
    prev.next=null;
    }

    public void insertAtEnd(T val)
    {
        Node newNode = new Node(val);
        if(head==null)
        {
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next!=null)
        {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public int search(T val)
    {
        int i = 0;
        if(head.data == val)
        {
            return i;
        }
        Node temp = head;

        while(temp.next!=null)
        {
            i++;
            temp = temp.next;
            if(temp.data == val)
            {
                return i;
            }
        }
        return -1;
    }

    public Boolean contains(T val)
    {
        int i = 0;
        if(head.data == val)
        {
            return true;
        }
        if(head == val)
        return true;
        Node temp = head;

        while(temp.next!=null)
        {
            i++;
            temp = temp.next;
            if(temp.data == val)
            {
                return true;
            }
        }
        return false;
    }

    public int length()
    {
        if(head==null)
        return 0;
        if(head.next==null)
            return 1;
        int i = 1;
        Node temp = head;

        while (temp.next!=null)
        {
            i++;
            temp = temp.next;
        }
        return i;
    }

    public void reverse()
    {
       Node prev=null;
       Node current = head;
       Node Next = head.next;

        while (current!=null)
        {
            Next = current.next;
            current.next = prev;
            prev = current;
            current = Next;
        }
        head = prev;
    }
}

