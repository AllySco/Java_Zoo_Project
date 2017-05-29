package zoo;
import java.util.*;

public class BigCatEnclosure extends Enclosure {

  public ArrayList<BigCat> caged;
  private HashMap<String, Integer> speciesCounter;


  public BigCatEnclosure(int minCapacity, int maxCapacity){
    super(minCapacity, maxCapacity);
    this.caged = new ArrayList<BigCat>();
    this.speciesCounter = new HashMap<String, Integer>();

  }

  public int bigCatCount() {
    return this.caged.size();
  }

  public void addBigCat(BigCat bigCat) {
    this.caged.add(bigCat);
  }

  public BigCat remove() {
    if (bigCatCount() > 0) {
      return caged.remove(0);
    }
    return null;
  }

    public HashMap<String, Integer> getSpeciesCount() {
      for (BigCat bigCat : this.caged) {
        String species = bigCat.getSpecies();
        if (speciesCounter.get(species) == null) {
          speciesCounter.put(species, 1);
        } else {
          speciesCounter.put(species, speciesCounter.get(species) + 1);
        }
      }
      return speciesCounter;
    }

    public String toString() {
            String output = "Total Big Cats: " + caged.size() + "\n";

            for (String key: speciesCounter.keySet()) {
                output += key + " : " + speciesCounter.get(key) + "\n";
            }
            return output;
  }


}