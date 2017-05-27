package zoo;
import java.util.*;

public class Animal {

  private String species;
  private ArrayList<Food> belly;

  public Animal(String species) {
    this.species = species;
    this.belly = new ArrayList<Food>();
  }


  public String getSpecies() {
    return this.species;
  }

  public int bellyCount() {
    return this.belly.size();
  }

  public void eat(Food food) {
    this.belly.add(food);
  }

  public void sleep() {
    this.belly.clear();
  }




}
