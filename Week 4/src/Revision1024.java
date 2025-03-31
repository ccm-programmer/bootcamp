public class Revision1024 {
  public static void main(String[] args) {
    //1. Primitive
    //2. String & String method
    //3. For-loop
    //4. While loop

    //Ex. 1
    //int [] arr = new int [] {1,2,3,4,5};
    //Task: Write a program that swaps the first and last elements of an integer array.
    // Expect result: [5,4,3,2,1]

    // for (int i = 0; i <= arr.length/2; i++){
    //   int temp = arr[i];
    //   arr[i] = arr[arr.length-i-1];
    //   arr [arr.length - i -1 ] = temp;
    // }
    // System.out.println(Arrays.toString(arr));

    //Ex. 2
    //indexOf()
    //Finding All Occurrences of Substring Using indexOf*() and a While-loop
    // String inputString = "abracadabra";
    // String targetSubString = "adab";

    // if nedex = inputString.indexOf (targetSubstring);
    // if exist -> 

    //split
    // String stockList = "QQQ, VOO, TSLA";
    // String[] splitStockList = stockList.split(",");
    // System.out.println("Stock List: " + Arrays.toString(splitStockList));
    // for (int i = 0; i < splitStockList.length);

    String str = "Java, Python, JavaScript, TypeScript, R, C++, C#";

    //Ex.1
    //swap: expect output: String arr = [C#, C++, R, TypeScript, JavaScript, Python, Java];
    String[] strArr = str.split(",");
    for (int i = 0; i < strArr.length/2; i++){
      String temp = strArr[i];
      strArr[i]=strArr[strArr.length-1-i];
      strArr[strArr.length-1-i]=temp;
    }
    System.out.println(Arrays.toString(strArr));

    //Ex.2
    //expect output: String str1 = "Java, Python, JavaScript, TypeScript, R, C++, C#";


    //Ex.3






  }
  
}
