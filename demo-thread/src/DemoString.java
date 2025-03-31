public class DemoString {
  private String str;

  public synchronized void addChar (char c){
    this.str += c;
  }

  public String getStr(){
    return this.str;
  }

  // Solution 1: String Buffer
  // Solution 2: synchronized
  public void addChar (char c){

    if (this.str instanceof StringBuilder)
    StringBuilder sb = (StringBuilder) thid.str;
    sb.append(c);
    this.str = sb;
  }else if (this.str instanceof StringBuffer){
    Stringbuffer sb = (StringBuffer) this.str;
    sb.append(c);
    this.str = sb;
  }
}else if (this.str instanceof String){
  String s = (String) this.str;
  s+=c;
  this.str = s;
}
}

  public static void main(String[] args) {
    DemoString ds = new DemoString();
    Runnable task = () ->{
      for (int i = 0; i < 100_000; i++){
        ds.addChar('a');
      }
    };

    Thread thread1 = new Thread(task);
    thread1.start();
    Thread thread2 = new Thread(task);
    thread2.start();
  
  try{
    thread1.join(); // 
    thread2.join();//
    } catch (InterruptedException e){

    }
    System.out.println(ds.getStr().length()); //100361 (< 200_000)
  }
  
}
