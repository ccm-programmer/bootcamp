public class DemoMath {
  public static void main(String[] args) {
    System.out.println(Math.PI);

    double cubeVolume = Math.pow(9.0, 3.0);
    System.out.println(cubeVolume); //729.0

    // Math.max()
    int[] arr = new int[] {2,3,10,1};
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++){
      max = Math.max(arr[i], max);
    }
    System.out.println("max= " + max);  //10

    // Math.min()
    System.out.println(Math.sqrt(25));  //5.0
    System.out.println(Math.sqrt(-25));  // NaN

    // absoluate value
    System.out.println(Math.abs(-3));  //3
    System.out.println(Math.abs(3));  //3

    //round -> 4捨5入
    System.out.println(Math.round(3.14159));  //3
    System.out.println(Math.round(3.54159));  //4  

    // random
    System.out.println(Math.random());  //0-1

    System.out.println((int) Math.floor(Math.random() * 10000));  //0-10000



  }
  
}
