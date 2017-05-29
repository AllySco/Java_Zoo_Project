package zoo;
import java.util.*;

public class Enclosure {

  private int minCapacity;
  private int maxCapacity;


  public Enclosure(int minCapacity, int maxCapacity) {
    this.minCapacity = minCapacity;
    this.maxCapacity = maxCapacity;
  }


  public int getMinCapacity() {
    return this.minCapacity;
  }

  public int getMaxCapacity() {
    return this.maxCapacity;
  }

}