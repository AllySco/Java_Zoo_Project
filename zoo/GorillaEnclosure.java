package zoo;
import java.util.*;

public class GorillaEnclosure extends Enclosure {

  private ArrayList<Gorilla> caged;
  private HashMap<String, Integer> speciesCounter;


  public GorillaEnclosure(int minCapacity, int maxCapacity){
    super(minCapacity, maxCapacity);
    this.caged = new ArrayList<Gorilla>();
    this.speciesCounter = new HashMap<String, Integer>();
  }


  public int gorillaCount() {
    return this.caged.size();
  }


  public void addGorilla(Gorilla gorilla) {
    this.caged.add(gorilla);
  }


  public Gorilla remove() {
    if (gorillaCount() > 0) {
      return caged.remove(0);
    }
    return null;
  }

  public HashMap<String, Integer> getSpeciesCount() {
    for (Gorilla gorilla : this.caged) {
      String species = gorilla.getSpecies();
      if (speciesCounter.get(species) == null) {
        speciesCounter.put(species, 1);
      } else {
        speciesCounter.put(species, speciesCounter.get(species) + 1);
      }
    }
    return speciesCounter;
  }

  public String toString() {
    String output = "Total Gorillas: " + caged.size() + "\n";

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
        Gorilla gorilla = (Gorilla) animal;
        return gorilla.rampage();
      }
    }
    return null;
  }
}
