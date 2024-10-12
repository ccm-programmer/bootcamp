public class day6Exercise4 {
  public static void main (String[] args){
    
    System.out.print("The first 10 natural numbers are, except 6:");
    for (int j = 0; j < 11; j++){
      if (j == 6)
      continue;
      System.out.println(j);
        }

        // Example : counting
        // 1-100
        // how many numbers can be divided by 3 or divide by 4?
        int count = 0;
        for ( int x = 0; x < 101; x++){
          if (x % 3 == 0 || x % 4 == 0){
            count++;            
          }
             }
        System.out.println("result : " + count);

        //1-50
        //Find the total number, which sum all odd number and substract all even number
        int sum = 0;
        for (int i = 0; i < 51; i++){
          if ( i % 2 != 0){
            sum+=i;}
            else {
              sum-=i;}
        }
        System.out.println(sum);
        

        
  






  }
  
}
