import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class DemoDate{
  public static void main (String[] args){
    //Locate
    LocalDate date = LocalDate.of(2024,11,30);
    System.out.println(date);  //2024-11-30
    System.out.println(date.getDayOfWeek()); //SATURDAY
    System.out.println(date.plusDays(1)); //2024-12-01
    System.out.println(date.plusMonths(2));  //2025-01-30
    System.out.println(date); //2024-11-30

    LocalDate date2 = LocalDate.of(2024,11,30);
    System.out.println(date.equals(date2));  //true

    LocalDate date3 = LocalDate.of(2024,12,10);
    System.out.println(date2.compareTo(date3)); //-1  --> right is larger than left
    System.out.println(date3.compareTo(date2));  //1  --> right is smaller than left

    LocalDateTime dateTime = LocalDateTime.of(2024, 10, 1, 23, 55, 59);
    System.out.println(dateTime);  //2024-10-01T23:55:59
    System.out.println(dateTime.getSecond());  //59
    System.out.println(dateTime.plusSeconds(1));  //2024-10-01T23:56

    // Epoch Second, the number seconds since 1970 1 1
    System.out.println(dateTime.toEpochSecond(ZoneOffset.UTC));  //1727826959
  }
}