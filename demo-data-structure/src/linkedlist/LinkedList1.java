package linkedlist;

import org.w3c.dom.Node;

public class LinkedList1 {
   private Node head;

   public void add (String value){

   }

   public void remove (String s){
    Node tail = this.head;
    Node prev = null;
    while(tail != null){}

    // 0(1) - No loop
    public void removeFirst(){
      this.head = this.head.next;
    }

    // 0(n) - RealLinkedList -> 0(1)
    public void removeLast(){
      Node tail = this.head;
      Node prev = null;
      while (tail != null){
        if (tail.next == null){
          prev.next = null;
          return;
        }
        prev = tail;
        tail = tail.next;
      }
    }




   }

  
}
