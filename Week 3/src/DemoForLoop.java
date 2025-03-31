public class DemoForLoop {
  public static void main (String[] args){
  
    //For Loop
    //step 1: "int i = 0;"
    //step 2: check if i < 5 --> true
    //step 3: print hello
    //step 4: Back to i++ --> i become 1
    //step 5: check if i < 3 --> true
    //step 6: print hello
    //step 7: back to i++ --> i become 2
    //step 8: check if i < 3 --> true
    //step 9: print hello
    //step 10: back to i++ --> i become 3
    //step 11: check if i < 3 --> false
    //step 12: exit loop
    for (int i = 0; i < 3; i++){
      System.out.println("Hello");}

      int sum = 0;
    //sum 1-10
    for (int i = 0; i < 11; i++){
      sum += i;  }
      System.out.println(sum);

      //sum up all even number between 1-20
      int sum1 = 0;
      for (int i = 0; i < 21; i++){
        if (i % 2 == 0){
        sum1 += i;}      }
        System.out.println(sum1);

        //sum up all even numbers and minus all odd number between 1-20

        int sum2 = 0;
        for (int i = 0; i < 21; i++){
          if (i % 2 == 0){
            sum2 += i;}  
            else{
              sum2 -= i;}
            }    
            System.out.println(sum2);

        //print out 10 8 6 4 2
        for (int i = 11; i > 0; i--){
          if (i % 2 == 0){
          System.out.println(i);}   }

        // String
        String s = "abcdefg";
        String output = " ";
        // output: aceg
       // charAt(), for loop i -> can be index
        for (int i = 0; i < s.length(); i++){
          if (i % 2 == 0){
            output += s.charAt(i); //String + char = String
             }       }
        System.out.println(output);

        //counting
        String s2 = "bbbbaaaayfhaad";  // a --> 6
        char target = 'a';
        int count = 0;
        for (int i = 0; i < s2.length(); i++){
          if (s2.charAt(i) == target){
            count++;
          }
        }
        System.out.println(count);

        // how many numebrs can be divided by 3 or 4 between 1-100?

        int count2 = 0;
        for (int i = 0; i < 101; i++){
          if (i % 3 == 0 || i % 4 == 0){
          count2++;}
          
        }
        System.out.println(count2);

        String s3 = "abcdabcdabcd";
        //print out last index of c, if not found, print out -1
        //do not use lastindexof()
        int index = -1;
        for (int i = 0; i < s3.length(); i++){
          if (s3.charAt(i) == 'c'){
            index = i;}
          }
          System.out.println(index); //last 'c' is positioned in 10th index

          //alternative
          System.out.println(s3.lastIndexOf('c'));  //10
          System.out.println(s3.indexOf('c')); //2, the 1st index of 'c'
          System.out.println(s3.indexOf("cda")); //2, the 1st index of 'c'

          //contains
          System.out.println(s3.contains("dab"));  //true
          //the fastest way if i want to find the pattern

          // substring (from begin index, end index -1)
          System.out.println(s3.substring(1,3)); //bc

          //find last 2 characters
          System.out.println(s3.substring(s3.length()-2, s3.length()));//cd
          System.out.println(s3.substring(s3.length()-2));//cd, 由-2果個位 print 到最後

          //continue & break
          //break: exit the nearest code block
          for (int i = 0; i < 5; i++){
            System.out.println("i= " + i);
            if (i > 2) {break;}
          }
          //i=0
          //i=1
          //i=2
          //i=3


          //continue = skip the rest and back to i++
          //early exit interation
          for (int i = 0; i < 5; i++){
            if(i % 2 == 0){
              continue;  //skip the rest and back to i++
            }
            if (i % 2 == 1 && i<3 || i > 7){
              continue;
            }          
            System.out.println("i = " + i);}
          //i = 3

          for (int i = 1; i < 6; i++)
{
  System.out.println(i);
} System.out.println("");

    // ! When i = 0, j from 0 to 3
    // ! When i = 1, j from 0 to 3

for (int i = 0; i < 5; i++){  //outer loop
  for (int j = 0; j < 4; j++){  //nested loop
  System.out.println("i= " + i + ", j = " + j);}}


  //*****
  //****
  //***
  //**
  //*
  //nested loop
  int n = 5;



  //*
  //***
  //*
  n = 3;

  









      
    
  
  
  
  
  
  
  
  
  
  
    }
  
  }
  
