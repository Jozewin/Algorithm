package DoublyLinked;

import org.w3c.dom.ranges.RangeException;

class Doublylinkedlist{
    Node head;
    Node tail;
    class Node{
        int data;
        Node prev;
        Node next;
        Node(int val)
    {
        data = val;
        prev = null;
        next = null;
    }
    
    }
    Doublylinkedlist()
    {
        head = null;
        tail = null;
    }

    // InsertAtBeginning 
    public void insertAtBeginning(int val)
    {
        Node newNode = new Node(val);
        newNode.next = head;
        if(head == null)
        {
            tail = newNode;
        }else{
            head.prev = newNode; 
        }
        head = newNode;
    }

    // To display the list
    public void display()
    {
        // IF list is empty
        if(head == null) throw new NullPointerException("The list is Empty");
        // Program starts
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

    // Reverse Display list
    public void displayRev()
    {
        if(head == null)
        throw new NullPointerException("The list is Empty");
        // Program starts
        Node temp = tail;
        while(temp!=null)
        {
            System.out.print(temp.data+ " ");
            temp= temp.prev;
        }
    }

    //Insert at position
    public void insertAtPosition(int val,int pos)
    {
        // if position = 0
        if(pos == 0)
        {
            insertAtBeginning(val);
                return;
        }
        Node newNode = new Node(val);
        Node temp = head;
        for(int i = 1;i<pos;i++)
        {
            temp = temp.next;
            if(temp==null)
            throw new NullPointerException("The entered positoin is not valid");
        }
       newNode.next = temp.next;
       newNode.prev=temp;
       if(temp == tail)
       {
       tail = newNode;
       }else{
       temp.next.prev=newNode;}

       temp.next = newNode;
    }

    public void deleteAtPosition(int pos)
        {
            Node temp = head;
            Node prev = null;
            //if position is 0
            if(pos==0)
            {
                head = head.next;
                if(head==null)
                {
                    tail=null; // If after deletion list has only one node 
                }else
                  head.prev = null;
                return;
            }

            for (int i= 1;i<=pos;i++)
            {
                prev = temp;
                temp = temp.next;
                if(temp ==null)
                {
                    throw new IndexOutOfBoundsException("Invalid position");
                }
            }

            // if to delete the middle node
            prev.next = temp.next;
            if(temp.next==null)
            {
                tail=prev; //if last node is being deleted
            }else
                temp.next.prev = prev;
        }

        /*               
                        HomeWork
         * insertAtEnd - completed
         * deleteAtEnd - Completed
         * search      - Completed
         * contains    - Completed
         * length      - Completed
         */

    public void deleteAtEnd()
        {
            // O(1) - time complexity
            Node temp = tail;
            Node prev = tail.prev;
            if(temp==null)
              throw new NullPointerException("List is empty");

            if(temp == head){
                head = null;
                temp = null;
                return;
            }
            prev.next = null;
            tail = prev;
       }

    public void insertAtEnd(int val)
         {
            Node newNode = new Node(val);

            if(head==null){
                insertAtBeginning(val);
                return;
            }

            Node temp = tail;
            temp.next = newNode;
            newNode.prev = temp;
            tail=newNode;
         }
    
    public int search(int val)
    {
        int i = 0;
        if(head==null)
        {
            throw new IllegalArgumentException("List is empty");
        }
        if(head.data==val)
            return i;

        Node temp = head;

        while(temp.next!=null)
        {
            i++;
            temp = temp.next;
            if(temp.data == val)
                return i;
        }
        return -1;
    }

    public boolean contains(int val)
    {
        if(head==null)
        {
            throw new IllegalArgumentException("List is empty");
        }
        if(head.data==val)
            return true;

        Node temp = head;

        while(temp.next!=null)
        {
            temp = temp.next;
            if(temp.data == val)
                return true;
        }
        return false;
    }

    public int length()
    {        int i = 1;
        if(head==null) return i;
       
        if(head.next==null)     return i;
       

        Node temp = head;

        while (temp.next!=null)
        {
            i++;
            temp = temp.next;
        }
        return i;
    }
}
