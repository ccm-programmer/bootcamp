public class DemoDatatype{
  public static void main(String[] args) {
    //hello, we can drop notes here
    //automation, accurcy
    //data type
    int x = 1;
    int y = 10;
    int a = x+y;
    //print out the result
    //System.out.println(a);

    //Math Operation: +,-,x,/
    int c=a*10;
    //System.out.println(c);

    //Math Operation: %
    int remainder = 10%3;
    //System.out.println(remainder);

    // double (a number with decimal places)
    double w = 10.5;
    double w2 =10;
    //System.out.println(w);
    //System.out.println(w2);

    //! what is 10?
    //10 is an int value

    //!what is w2?
    //w2 is an int variable

    //Assign an int value to a double variable
    //int value -> double value
    //assign double value to double variable
    //Convert 10 to double value 10.0 and put into variable w2

    //Naming convention: camel case  
    //python will use english_score
    //Java will use englishscore
    int englishScore=70;
    double historyScore=85;
    int mathScore=90;

    //int+int->int
    //int+double->double+double->double

    //Step 1: int+int+int->int
    //Step 2: int/int->int
    //Step 3: assign int value to double variable
    double AvergeScore=(englishScore+historyScore+mathScore)/3;
    //System.out.println(AvergeScore);

    //Re-assignment
    x=20;
    a=-40;

    //!we cannot reuse the same variable name within a same code block

    //how to backup a value?
    int backup=x;
    //we can call out the original value of x when print out "backup"
    x=25;
    //System.out.println(x);
    //System.out.println(backup);

    //Operators: +=, -=, *=, /=
    int e = 9;
    e = e + 1;
    //System.out.println("e+" + e);//10
    e+=1; //e=e+1
    System.out.println(e);

    //++,--
    //e++ ->e=e+1
    //e- -->e=e-1

    //++e -> e=e+1
    //--e -> e=e-1

    
  }
}
