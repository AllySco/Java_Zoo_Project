package zoo;
import java.util.*;

public class BearEnclosure extends Enclosure {

  private ArrayList<Bear> caged;
  private HashMap<String, Integer> speciesCounter;


  public BearEnclosure(int minCapacity, int maxCapacity){
    super(minCapacity, maxCapacity);
    this.caged = new ArrayList<Bear>();
    this.speciesCounter = new HashMap<String, Integer>();
  }

  public int bearCount() {
    return this.caged.size();
  }

  public void addBear(Bear bear) {
    this.caged.add(bear);
  }

  public Bear remove() {
    if (bearCount() > 0) {
      return caged.remove(0);
    }
    return null;
  }

  public HashMap<String, Integer> getSpeciesCount() {
    for (Bear bear : this.caged) {
      String species = bear.getSpecies();
      if (speciesCounter.get(species) == null) {
        speciesCounter.put(species, 1);
      } else {
        speciesCounter.put(species, speciesCounter.get(species) + 1);
      }
    }
    return speciesCounter;
  }

  public String toString() {
    String output = "Total Bears: " + caged.size() + "\n";

    for (String key: speciesCounter.keySet()) {
      output += key + " : " + speciesCounter.get(key) + "\n";
    }
    return output;
  }


  @Override
  public String feedAnimal(Animal animal, Food food) {
    if (feederCount() > 0) {
      animal.eat(food);
      this.removeFoodFromFeeder();
      return "Nom nom";
    } else {
      if (feederCount() < 1 && animal.bellyCount() <1) {
        Bear bear = (Bear) animal;
        return bear.maul();
      }
    }
    return null;
  }


}
