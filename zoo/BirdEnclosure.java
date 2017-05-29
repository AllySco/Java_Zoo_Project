package zoo;
import java.util.*;

public class BirdEnclosure extends Enclosure {

  public ArrayList<Bird> caged;
  private HashMap<String, Integer> speciesCounter;

  public BirdEnclosure(int minCapacity, int maxCapacity){
    super(minCapacity, maxCapacity);
    this.caged = new ArrayList<Bird>();
    this.speciesCounter = new HashMap<String, Integer>();
  }

  public int birdCount() {
    return this.caged.size();
  }

  public void addBird(Bird bird) {
    this.caged.add(bird);
  }

  public Bird remove() {
    if (birdCount() > 0) {
      return caged.remove(0);
    }
    return null;
  }


  public HashMap<String, Integer> getSpeciesCount() {
    for (Bird bird : this.caged) {
      String species = bird.getSpecies();
      if (speciesCounter.get(species) == null) {
        speciesCounter.put(species, 1);
      } else {
        speciesCounter.put(species, speciesCounter.get(species) + 1);
      }
    }
    return speciesCounter;
  }

  public String toString() {
    String output = "Total Birds: " + caged.size() + "\n";

    for (String key: speciesCounter.keySet()) {
      output += key + " : " + speciesCounter.get(key) + "\n";
    }
    return output;
  }


}