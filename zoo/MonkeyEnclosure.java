package zoo;
import java.util.*;

public class MonkeyEnclosure extends Enclosure {

  public ArrayList<Monkey> caged;

  public MonkeyEnclosure(int minCapacity, int maxCapacity){
    super(minCapacity, maxCapacity);
    this.caged = new ArrayList<Monkey>();
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


}