public class Projector extends Machine {
  private double size;

  public Projector(double size){
    //super();   //we don't need to write it 默認存在
    this.size = size;
  }

  public void start(){
    System.out.println("Prooject is starting...");}

  public void stop(){
    System.out.println("The Projector is stopping");
  }

  public static void main(String[] args) {
    Projector p1 = new Projector(3.4);
    System.out.println(p1.getColor());  //BLACK

    Projector p2 = new Projector(9.1, "RED");
    System.out.println(p2.getColor());  //
  }
  
}
