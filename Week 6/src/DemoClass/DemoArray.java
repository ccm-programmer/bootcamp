package  DemoClass;

import java.util.Arrays;

public class DemoArray {
  //attribute
  int[] array = new int[]{1,2,3,4,5};

  public int getLength(){
    return this.array.length;
  }

  //Instance method
  public void add(int num){
    int[]newArr = Arrays.copyOf (this.array, this.array.length+1);
    newArr[newArr.length-1]=num;
    array = newArr;
  }
  //remove direct number
  public void sub(int num){
    int[]newArr = new int[this.array.length-1];
    for(int i = 0; i < this.array.length; i++){
      if(this.array[i] == num)
      continue;
      newArr[i]=this.array[i];
      }
      array = newArr;

  }

  public static void main (String[] args){
    DemoArray arr1 = new DemoArray();
    arr1.add(6);
    System.out.println(arr1.getLength());
    System.out.println(Arrays.toString(arr1.getArr()));
        arr1.sub(1);
    
      }
    
      private long[] getArr() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getArr'");
      }
  
}
