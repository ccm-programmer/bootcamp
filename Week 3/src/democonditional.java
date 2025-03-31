public class democonditional {
  public static void main (String[] args){
    int x = 3;
    //method 1:
    if (x>2){
      System.out.println("x>2");
    }
    //method 2:
    boolean result = x > 2;
    if (result){
      System.out.println("x>2");
    }

    String s = "hello";
  if (s.length() > 4){
    System.out.println("length > 4");}

    else{
      System.out.println("length <= 4");
    }

int a = 101;
int b = 100;
int max = -1;

if (a > b){
max = a;}
else{max = b;
}
System.out.println("max=" + max);

int historyScore = 70;
int passingScore = 60;
boolean examResult = false;

if (historyScore >= passingScore){
  examResult = true;}
else {examResult = false;}

//else if
String color = "";
if (historyScore > passingScore){
  color = "green";}
  else if (historyScore == passingScore){
    color = "yellow";}
    else { 
      color = "red";
    }
  
char grade = ' ';
int score = 85;
//Grade A: >= 90; Grade B: >=80; Grade C: >=70; Fail: <70;

if (score >=90){
  grade = 'A';
}else if (score >=80){
    grade = 'B';
  } else if (score >= 70){
      grade = 'C';
    } else {
        grade = 'F';}
        System.out.println("grade = " + grade);

// AND &&
// OR ||

if (score >=90){
  grade = 'A';
}else if (score >=80 && score <= 89){ //between 80 - 89
    grade = 'B';
  } else if (score >= 70 && score <= 79){ //between 70 - 79
      grade = 'C';
    } else { //below 70
        grade = 'F';}
        System.out.println("grade = " + grade);

        int CustomerAge = 70;
        char customerGender ='F';

        int baseFee = 100;
        // If male, 10% charge
        //Female and more than 60, 8% charge.
        //otherwise, 10% charge

if (customerGender == 'M'|| customerGender == 'F' && CustomerAge <= 60){
  baseFee *= 1.1;
} else if (customerGender == 'F' && CustomerAge > 60)
{baseFee *= 1.08;}

System.out.println(baseFee);
 
//String method
String s2 = "hello word";
// if string value contains "w", print "Contain w,"
// if string value contains "w" and length > 7, print "*****"
// Position 3 is upper case, print "upper case."

//s2.charAt(2) == s2.toUpperCae.charAt(2) -> 
//s2.length()>7
//s2.contains("w")









}
  
  }

