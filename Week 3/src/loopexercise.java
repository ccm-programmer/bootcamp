public class loopexercise {
  public static void main(String[] args) {
    int sum = 0;
for (int i = 0; i < 11; i++){
sum += i;}
System.out.println("The sum of 1-10= " + sum);

for (int y = 1; y <=3; y++){
  for (int j = 1; j <=3; j++){
  System.out.println("y= " + y + "; " + "j= " + j);
  }
  }
  
  for (int y = 0; y <=5; y++){
    if (y == 3){
    break;}
    System.out.println(y);
  }

  for (int i = 1; i <=10; i++){
    if (i % 2 == 0){
    continue;}
    System.out.println(i);
    }

    String name = "God loves people very much";
    int count = 0;
    for (int y = 0; y < name.length(); y++){
      if (name.charAt(y) == 'p'){
        count++;}
      }
      System.out.println(count);

      String word = "ABCDEFGHIJKLMNO";
      char ch = 'J';
      int index = 0;

      for (int i = 0; i < word.length(); i++){
        if (word.charAt(i) == ch){
          index = i;
        }
        }
        System.out.println(index);

        //1-100, how many number can be divided by 3 & 4?

        int count1 = 0;

        for (int i = 0; i <=100; i++){
          if (i % 5 == 0 && i % 6 == 0){
            count1++;
          }
          }
          System.out.println(count1);

        //1-100, which number can be divided by 3 & 4?

        for (int i = 0; i <=100; i++){
          if (i % 5 == 0 && i % 6 == 0){
            System.out.println(i);
          }
          }
         
        //1-50, sum of odd number and substract even number

        int sum1 = 0;

        for (int i = 0; i <= 50; i++){
        if (i % 2 != 0){
          sum1 += i;}
          else {
            sum1 -= i;
          }
        }
        System.out.println(sum1);

        String str1 = "hello";
        String str2 = "girl";
        System.out.println(str1.compareTo(str2));

        String text = "HelloWorld";
        if (text.charAt(3) == 108){
        System.out.println("true");}
        else {
          System.out.println(false);
        }

        String str3 = "hello";
if (str3.contains("h")){
System.out.println("contains h");}
if (str3.charAt(3) >= 65 && str3.charAt(3) <= 90){
System.out.println("isUpperCase");}
else{
System.out.println("noUpperCase");}

int y = 0;
while ( y < 4) {
System.out.println("y= " + y);
y++;
System.out.println("hello world");}
System.out.println("Finally = " + y);

String letters = "abcdabcdabcd";
int count3 = 0;
int j = 0;
while (j < letters.length()){
if (letters.charAt(j) == 'b'){
count3++;}
j++;}
System.out.println(count3);

String original = "Programming";
String reversed = " ";

for (int k = original.length()-1; k >= 0; k--){
char ch1 = original.charAt(k);
reversed += ch1;}
System.out.println(reversed);




        
        

    
    





  }
  
}
