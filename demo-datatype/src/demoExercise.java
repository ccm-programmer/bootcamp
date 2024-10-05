public class demoExercise {
  public static void main(String[] args) {
 
    boolean r1=10>3;
    //System.out.println("r1:" + r1);

    int a = 31;    
    int b = 42;
    int c = a+b;
    //System.out.println("The sum is " + c); //c=73

    c=b-a;
    //System.out.println("The subtraction reuslt is " + c); //c=11

    int d = 119+c;
    //System.out.println("The another sum result is " + d); //d=130

    Boolean varB = c>d;
    //System.out.println("The variable varB is " + varB);

    Boolean varC = b>a;
    //System.out.println("The variable varB is " + varC);

    double fNumber=-130.5;
    //System.out.println("The variable fnumber is " + fNumber);

    double dNumber=-20.5;
    //System.out.println("The variable dnumber is " + dNumber);

    int i = 10 % 3;
    //System.out.println("The variable reminder is " + i);

    int y=2;
    i=y+1;
    //System.out.println("The variable result is " + i);


    //AND=&&
    //OR=||

    int s = 3100;
    int t = 300;

    if (s>t){
      //System.out.println("s is >t : true");
    }

      else{
        //System.out.println("s is not >t: false");      
    }

    //!= ->not ; == -> is
    // If a year is divisible by 4 and not divisible by 100 or divisible by 400, 
    //then it is leap year.

    int year1=2000;

    if (year1%4==0 && (year1%100!=0 || year1%400==0)){
      System.out.println(year1 + " is leap year.");
    }
    else{
      System.out.println(year1 + " is not leap year.");
      }

    }




  }



  

