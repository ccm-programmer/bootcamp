import java.util.Scanner;

public class ex31010homework {
  public static void main (String[] args){
    Scanner input = new Scanner (System.in);
    //System.out.println("Please input a number");
    //int number = input.nextInt();

    int numberOfDaysInMonth = 0;
    String nameOfMonth = "Unknown";

    System.out.println("Please input a month (1-12): ");
    int month = input.nextInt();

    System.out.println("Please input a year: ");
    int year = input.nextInt();

    switch (month){
      case 1:
      nameOfMonth = "January";
      numberOfDaysInMonth = 31;
      break;

      case 2:
      nameOfMonth = "February";
      if (year % 4 ==0 && (year % 100 !=0 || year % 400 ==0)){
      numberOfDaysInMonth = 29;}
      else{
        numberOfDaysInMonth = 28;
      } 
      break;

      case 3:
      nameOfMonth = "March";
      numberOfDaysInMonth = 31;
      break;

      case 4:
      nameOfMonth = "April";
      numberOfDaysInMonth = 30;
      break;

      case 5:
      nameOfMonth = "May";
      numberOfDaysInMonth = 31;
      break;

      case 6:
      nameOfMonth = "June";
      numberOfDaysInMonth = 30;
      break;

      case 7:
      nameOfMonth = "July";
      numberOfDaysInMonth = 31;
      break;

      case 8:
      nameOfMonth = "August";
      numberOfDaysInMonth = 31;
      break;

      case 9:
      nameOfMonth = "September";
      numberOfDaysInMonth = 30;
      break;

      case 10:
      nameOfMonth = "October";
      numberOfDaysInMonth = 31;
      break;

      case 11:
      nameOfMonth = "November";
      numberOfDaysInMonth = 30;
      break;

      case 12:
      nameOfMonth = "December";
      numberOfDaysInMonth = 31;
      break;

      default:
      System.out.println("This is a invalid number, please input the correct number within 1-12 again.");
      return;
    }
      System.out.println(nameOfMonth + " " + year + " has " + numberOfDaysInMonth + " days");


  }
  
}
