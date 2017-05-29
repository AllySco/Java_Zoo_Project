package zoo;
import java.util.*;

public class MonkeyEnclosure extends Enclosure {

  public ArrayList<Monkey> caged;
  private HashMap<String, Integer> speciesCounter;


  public MonkeyEnclosure(int minCapacity, int maxCapacity){
    super(minCapacity, maxCapacity);
    this.caged = new ArrayList<Monkey>();
    this.speciesCounter = new HashMap<String, Integer>();

  }

  public int monkeyCount() {
    return this.caged.size();
  }

  public void addMonkey(Monkey monkey) {
    this.caged.add(monkey);
  }

  public Monkey remove() {
    if (monkeyCount() > 0) {
      return caged.remove(0);
    }
    return null;
  }

  public HashMap<String, Integer> getSpeciesCount() {
    for (Monkey monkey : this.caged) {
      String species = monkey.getSpecies();
      if (speciesCounter.get(species) == null) {
        speciesCounter.put(species, 1);
      } else {
        speciesCounter.put(species, speciesCounter.get(species) + 1);
      }
    }
    return speciesCounter;
  }

  public String toString() {
    String output = "Total Monkeys: " + caged.size() + "\n";

    for (String key: speciesCounter.keySet()) {
      output += key + " : " + speciesCounter.get(key) + "\n";
    }
    return output;
  }


}