package zoo;
import java.util.*;

public class Enclosure {

  private int minCapacity;
  private int maxCapacity;
  private ArrayList<Food> feeder;


  public Enclosure(int minCapacity, int maxCapacity) {
    this.minCapacity = minCapacity;
    this.maxCapacity = maxCapacity;
    this.feeder = new ArrayList<Food>();
  }


  public int getMinCapacity() {
    return this.minCapacity;
  }

  public int getMaxCapacity() {
    return this.maxCapacity;
  }

  public int feederCount() {
    return this.feeder.size();
  }

  public void addFoodToFeeder(Food food) {
    this.feeder.add(food);
  }

  public Food removeFoodFromFeeder() {
    if (feederCount() > 0) {
      return feeder.remove(0);
    }
    return null;
  }

  public String feedAnimal(Animal animal, Food food) {
    if (feederCount() > 0) {
      animal.eat(food);
      this.removeFoodFromFeeder();
      return "Nom nom";
    } else {
      return "No food available";
    }
  }

}