import java.math.BigDecimal;

public class TestPassByValue {

  // For other types, pass by reference
  int[] arr = new int[]{2,3,1};
  // int[] to List<Integer>
  List<Integer> integers = Arrays.stream(arr).boxed.collect(Collectors.toList());

  // NOT OK, 
  Collections.sort(Arrays.asList(arr))

  //BigDecimal

  //Local date
  LocalDate ld1 = LocalDate.of(2024, 10, 1);
  updateLocalDate(ld1);
  System.out.println(ld1);
}

public static void updateLocalDate(LocalDate ld){
  ld = LocalDate.of(2024, 12, 31);
}
