package zoo;
import java.util.*;

public class BearEnclosure extends Enclosure {

  public ArrayList<Bear> caged;

  public BearEnclosure(int minCapacity, int maxCapacity){
    super(minCapacity, maxCapacity);
    this.caged = new ArrayList<Bear>();
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


}