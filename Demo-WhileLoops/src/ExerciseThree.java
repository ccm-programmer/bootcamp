// 15-Apr-2025
// Break & Continue
// break = break out of a loop (STOP)
// Continue = skip current iteration of a loop (SKIP)

public class ExerciseThree {
  public static void main(String[] args) {
    
    for (int i = 0; i < 10; i++){
      if (i == 5){
        break;
      }
      System.out.print(i + " ");
    }
    // 0 1 2 3 4

    System.out.print("\n");

    for (int i = 0; i < 10; i++){
      if (i == 5){
        continue;
      }
      System.out.print(i + " ");
    }
    //0 1 2 3 4 6 7 8 9

  }
  
}
