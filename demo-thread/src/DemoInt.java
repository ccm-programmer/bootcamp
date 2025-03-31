public class DemoInt {
  private int count;

    // Solution:
    // 1. synchronized on method (lock the whole method, until one thread completed the method)

  public void addOne(){
    this.count++;
  }

  public int getCount(){
    return this.count;
  }

  public void reset(){
    this.count=0;
  }

  public static void main(String[] args) {
    int x = 3;
    x++;  // read the x value, and then +1, put the value back to x variable
    System.out.println(x); // 4

    DemoInt demoInt = new DemoInt();
    Runnable task = () -> {
      for (int i = 0; i < 100_000; i++){
        demoInt.addOne();
      }
    };
    Thread thread1 = new Thread(task);

    // main Thread and Thread1
    thread1.start(); // execute the task
    try{
    thread1.join(); // main thread stop here, and wait thread1 complete, and then proceed.
    } catch (InterruptedException e){

    }

    System.out.println(demoInt.getCount());  
    // before join(), likely main thread complete first, so ans. is 0
    // after join(), main thread must wait thread1 complete first -> so must be 100_000

    // Three threads
    demoInt.reset();
    Thread thread2 = new Thread(task);
    thread2.start();
    Thread thread3 = new Thread(task);
    thread3.start();

    try{
      thread2.join(); // 
      thread3.join();//
      } catch (InterruptedException e){
  
      }
      System.out.println(demoInt.getCount()); //116491 (<200_000)




  }
  
}
