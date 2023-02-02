package QueueLLArray;
/*
 * Queue so 
 * Enqueue and Dequeue
 * 
 * Enqueue ==> create a node lets have two pointer to note which is head and tail coz 
 * head can be returned at once 
 * Dequeue ==>
 */
public class QueueLinkedList {
    //Node 
    class Node{
        int val;
        Node next;

        Node(int data){
            val = data;
            next = null;
        }
    }

    Node front,rear;
    QueueLinkedList(){
        front = null;
        rear = null;
    }

    public void Enqueue(int data){
        Node newNode = new Node(data);
        
        if(front == null)   front = newNode; // If no node exist
        else    rear.next = newNode;// If many Node already exist
        rear = newNode;
    }

    public int dequeueThis(){

        if(front == null) throw new IndexOutOfBoundsException("Queue Empty da panda");
        int temp = front.val;
        front= front.next;
        if(front == null) rear = null;

        return temp;
    }

    
}
