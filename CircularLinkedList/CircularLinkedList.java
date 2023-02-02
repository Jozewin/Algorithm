package CircularLinkedList;

public class CircularLinkedList<T> {
    Node last;

    class Node{
        T data;
        Node next;
        
        // Constractor 
        Node(T val)
        {
            data=val;
            next =  null;
        }
    }

    CircularLinkedList(){ last = null;}
  

   public void insertAtBeginning(T val)
   {

    Node newNode = new Node(val);

    // if list is empty
    if(last == null)
    {
        last = newNode;
        newNode.next = newNode;
    }else // If List is not empty
    {
        newNode.next = last.next;
        last.next = newNode;
    }

   }

   public void insertAtEnd(T val){
    Node newNode = new Node(val);
    if(last == null)
    {
        last = newNode;
        newNode.next = newNode;
    }else{
        newNode.next = last.next;
        last.next = newNode;
        last = newNode;
    }

}

    public void display()
    {
        if(last == null)   return;
       
        Node temp = last.next;
        System.out.print("[ ");
        do{
            System.out.print(temp.data+" ");
            temp = temp.next;
        }while(temp!=last.next);
        System.out.print("]");
    }

    public void deleteAtBeginning(){
        if(last == null)   throw new NullPointerException("Baka yaro List is empty");

        if(last.next ==last)    last = null;
     else    last.next = last.next.next;
        


    }

    public void deleteAtEnd( )
    {
        if(last == null)    throw new NullPointerException("Baka yaro List is empty");

        if(last.next ==last)    last = null;
        else{
         Node temp = last.next;
             while(temp.next !=last)   temp=temp.next;
         temp.next = last.next;
         last = temp;
             
        }
    }

    /* Homework

     * deleteVal("Ram");  Completed
     * insertAfter("Ram"); Completed 
     * size();  Completed
     * contains("Ram"); Completed
     */
  
     public void deleteVal(T val)
     {
        // When list has only one value and it is being deleted.
        if(last.data == val && last.next == last)
        {
            last = null;
            return;
        }

        // To delete the last value. 
        if(last.data == val)
        {
            Node temp = last;
            while(temp.next.data!=val)    temp = temp.next;

            last = temp;
            temp.next = temp.next.next;
        }

        // To delete middle elements 
        Node temp = last;
        while(temp.next.data != val && temp.next.data != last.data)    temp = temp.next;

        if(temp.next.data == last.data ) return; // If circled through the list and value cant found

        temp.next = temp.next.next;
     }
   

     public void insertAfter(T val,T newData)
     {
        // if val is the last value 
        Node newNode = new Node(newData);
        if(last.data == val)
        {
            newNode.next = last.next;
            last.next = newNode;
            last = newNode;
        }else{
           
            Node temp = last.next;
            while(temp.data!=val)
            {
                temp = temp.next;
                if(temp.data==last.next.data) throw new NullPointerException("Value illa");
            }
            newNode.next = temp.next;
            temp.next = newNode;

        }
    }

    public int size()
    {
        if(last == null) return 0;
        int i = 1;
        Node temp = last;
        while(temp.next !=last){
            i++;
            temp = temp.next;
        }
        return i;

    }

    public boolean contains(T val)
    {
        Node temp = last;
        while(temp.next != last)
        {
            if(temp.data == val)    return true;
            else temp = temp.next;  
        }
        return false;
    }
}





