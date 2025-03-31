import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
  private Queue <Integer> q1;
  private Queue <Integer> q2;

  public MyStack(){
    q1 = new LinkedList<>();
    q2 = new LinkedList<>();}

    public void push(int x) {
      //poll all elements from q1 and push to q2
        //but return the last element in q1
        //copy q2 to q1
        while (q1.size() > 1){
          q2.add(q1.poll());
        }

        Queue <Integer> temp = q1;
        q1 = q2;
        q2 = temp;
  }

    public int pop() {
      // Remove the element from the front of q1
      return q1.poll();
  }

  public int top() {
    // Get the front element of q1 without removing it
    return q1.peek();        
  }

  public boolean empty() {
    // Check if queue1 is empty
    return q1.isEmpty();
}


  
}
