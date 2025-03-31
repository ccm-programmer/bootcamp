import java.util.Arrays;

public class DemoArray {
  public static void main (String[] args){
    int x = 10;
    //! Why do we need Array?
    //Store a set of same type of values

    //"new" = create an array object
    //int[5]o -> an int array object able to store 5 int values
    int[] arr = new int[5];  //define how many array?
    
    //index starts from 0
    //!So, int[5] -> index from 0 to 4
    System.out.println(arr[0]);   //0 -> because int default value 0
    System.out.println(arr[1]);
    System.out.println(arr[2]);
    System.out.println(arr[3]);
    System.out.println(arr[4]);
    //System.out.println(arr[5]);  //out of expectation, bug!!

    //edit the value
    arr[2] = 99;
    arr[4] = 1;
    System.out.println(arr[2] + arr[4]); //100

    //Read array by Loop
    for (int i = 0; i < arr.length; i++){   //i < 5, i = 0,1,2,3,4
      System.out.println("arr[]" + arr[i]);
    }
    //arr[0] = 0
    //arr[1] = 0
    //arr[2] = 99
    //arr[3] = 0
    //arr[4] = 1

    //for loop to sum up
    int sum = 0;
    for (int i = 0; i < arr.length; i++){   //i < 5, i = 0,1,2,3,4
      sum += arr[i];}
      System.out.println("sum= " + sum);

      arr[1] = 8;
      arr[3] = 14;
      //sum up all even numbers in the int array

        int sum1 = 0;
        for (int i = 0; i < arr.length; i++){ 
          if (arr[i] % 2 == 0){  //i < 5, i = 0,1,2,3,4
          sum1 += arr[i];}}
          System.out.println("sum= " + sum1);
          //22

          System.out.println(arr[0]);
          System.out.println(arr[1]);
          System.out.println(arr[2]);
          System.out.println( arr[3]);
          System.out.println( arr[4]);
      //swap
      //exchange the value for the head & tail of array arr[0] arr[4]
      int backup = arr[0];
      arr[0] = arr[arr.length-1];
      arr[arr.length-1] = backup;
      System.out.println(Arrays.toString(arr));

      //Move the head value to the tail
      //now 0 8 99 14 1
      //result: 1 8 99 14 0
      //Tips: swap
      
      for (int i = 0; i < arr.length-1; i++){
        backup = arr[i];
        arr[i]=arr[i+1];
        arr[i+1]=backup;
      }
      System.out.println(Arrays.toString(arr));
      //8, 99, 14, 0, 1


      //Find Max Value
int max = Integer.MIN_VALUE;  //the min. value of int
for (int i = 0; i < arr.length; i++){
  if (arr[i] > max)
  max = arr[i];
}
System.out.println("max= " + max);
//result: 99

      //Find Min Value
      int min = Integer.MAX_VALUE;  //the min. value of int
      for (int i = 0; i < arr.length; i++){
        if (arr[i] < min)
        min = arr[i];
      }
      System.out.println("min= " + min);
      //result: 0

      //create long array
      long[] arr2 = new long[4];    //0,1,2,3
      arr2[0] = -100;
      arr2[1] = -9;
      arr2[2] = 50;
      arr2[3] = 14;

      //Counting
      int count = 0;
      for (int i = 0; i < arr2.length; i++){
        if (arr2[i] % 2 == 0){
          count++;
        }
        System.out.println("count= " + count);
      }

      //Copy all even number from arr2 to arr3
      long[] arr3 = new long[count];
      int idx = -1;
      for (int i = 0; i < arr.length; i++){
        if (arr2[i] % 2==0){
          arr3[++idx] = arr2[i];
        System.out.println(Arrays.toString(arr3));}
      }


      //Move the max value  to the tail
      //You create the array here.
      //Tips: done by one for loop

      long[] arr4 = new long[]{10, 99, -4, -100};
      long backup2;
      System.out.println("new arr4=" + Arrays.toString(arr4));
      for (int i = 0; i < arr4.length-1; i++){
        if (arr4[i] > arr4[i+1]){
          
        }
      }

      
      














  }
  
}
