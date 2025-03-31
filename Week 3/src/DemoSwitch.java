public class DemoSwitch {
  public static void main(String[] args) {
    
    //normal example

    int dayOfWeek = 3; // 1 - 7
    String dayName = "";
    switch (dayOfWeek) { // ! No range checking
      case 1:
        dayName = "Monday";
        System.out.println("Case 1");
        break;
      case 3:
        dayName = "Wednesday";
        System.out.println("Case 3");
        break;
      case 4:
        dayName = "Thursday";
        System.out.println("Case 4");
        break;
      case 7:
        dayName = "Sunday";
        System.out.println("Case 7");
        break;
    }
    System.out.println("Day Name=" + dayName); // Day Name=Wednesday

  }
  
}
