package zoo;
import java.util.*;

public class BigCatEnclosure extends Enclosure {

  public ArrayList<BigCat> caged;

  public BigCatEnclosure(int minCapacity, int maxCapacity){
    super(minCapacity, maxCapacity);
    this.caged = new ArrayList<BigCat>();
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


}