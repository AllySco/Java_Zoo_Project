package zoo;
import java.util.*;

public class GorillaEnclosure extends Enclosure {

  public ArrayList<Gorilla> caged;

  public GorillaEnclosure(int minCapacity, int maxCapacity){
    super(minCapacity, maxCapacity);
    this.caged = new ArrayList<Gorilla>();
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


}