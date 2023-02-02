package QueueLLArray;

public class QueueArray<T> {
    final static int MAX_SIZE = 30;
    int rear;
    T arr[];

    QueueArray(){
        arr= (T[]) new Object[MAX_SIZE];
        rear = -1;
    }
    /*
     * Enqueue ==> Add value at front
     * Dequeue ==> Remove value from front
     */

     public void Enqueue(T val)  // o(1)
     {
        if(rear == MAX_SIZE-1)    throw new IndexOutOfBoundsException("Queue is full"); 
        arr[++rear] = val;
     }

    public T dequeue(){  // o(n)
        if(rear == -1)  throw new IndexOutOfBoundsException("Queue is empty u baka");
        for (int i = 1;i<=rear;i++)     arr[i-1]= arr[i];
        rear--;
        return arr[0];
    }
    
}
