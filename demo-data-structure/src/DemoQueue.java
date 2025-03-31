import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class DemoQueue {
  public static void main(String[] args) {
    // first in first out
    Queue<String> q1 = new LinkedList<>();
    q1.add("vincent");
    q1.add("oscar");
    q1.add("lucas");

    String head = q1.poll();  // similar to remove first
    System.out.println(head);  // vincent
    System.out.println(q1.size());  //2

    // while
    while (!q1.isEmpty()){
      head = q1.poll();
      System.out.println(head);
      // you can do anything for head...
    }

    // q1.add("abc");
    // q1.add("def");
    // q1.add("ijk");
    // while (q1.size() !=0){
    //   head = q1.poll();
    //   System.out.println("before size: "+ head);
    //   if (q1.size() == 1){
    //     break;
    //   }
    //   System.out.println("after size: " + head);
    // }
    // System.out.println(q1.size());  //1

    q1.add("abc");
    q1.add("def");
    q1.add("ijk");
    while (q1.size() !=0){
      head = q1.poll();
      q1.add("hello");
      if (q1.size() == 3){
        break;
      }}
      System.out.println("after size: " + head); //abc
    
    System.out.println(q1.size());  //3

    List<String> ss = new ArrayList<>();
    ss.add("abc");
    ss.add("ijk");
    for (String s : ss){
      //ss.set(1,"vincent");
      ss.remove("abc");
      // cannot use "ss.add("abc")"
      System.out.println("hello");
    }
    System.out.println(ss);

    /*
     * Queue - LinkedList 呢個功能比 Deque少, 但夠用就可以了, 只可以改頭
     * Deque - LinkedList 可以改頭改尾
    */

    Deque<String> dq1 = new LinkedList<>();
    dq1.add("abc"); //addlast()
    dq1.add("abc"); //addlast()
    dq1.add("abc"); //addlast()
    System.out.println(dq1.pollLast());
    System.out.println(dq1.pop());
    System.out.println(dq1);
    dq1.push("mmm");
    System.out.println(dq1); // [mmm, def, xxx]

    /*
     * push and pop (stack: First in Last out)
     */

     Stack<String> strings = new Stack<>();
     strings.push("aaa");
     strings.push("bbb");
     System.out.println(strings.pop());  //bbb

     // ArrayDeque
     Deque<Double> doubles = new ArrayDeque<>();
     doubles.add(10.3);
     doubles.add(10.7);
     System.out.println(doubles.pollLast());  // 10.7
     
     Queue<Integer> integers = new ArrayDeque<>();
     integers.add(10);
     integers.add(11);
     System.out.println(integers.poll());  //10



    


    
  }
  
}

  