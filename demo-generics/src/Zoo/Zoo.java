package Zoo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// ! T in class
public class Zoo<T extends Animal> {
  private List<T> animals;

  public Zoo(){
    this.animals = new ArrayList<>();
  }

  public void add (T animal){
    this.animals.add(animal);
  }

  // ! "<K extends Animal" is to describe the range of "Zoo<K"
  public static <K extends Animal>  int animalCount (Zoo(K) zoo){
    return zoo.getAnimals().size(); }

    public static int animalCount2(Zoo<? extends Animal> zoo){
      return zoo.getAnimals.size();
    }
 

  public static void main(String[] args) {
    List<List<String>> stringLists = new LinkedList<>();

    // animalCount2() - Scenario 1 (Tiger or Panda)
    Zoo<Animal> animalZoo = new Zoo<>();
    animalCount2(animalZoo);

    Zoo<Tiger> tigerZoo = new Zoo<>();
    tigerZoo.add(new Tiger());


    
  }
  
  
}
