package zoo;
import java.util.*;

public class BirdEnclosure extends Enclosure {

  public ArrayList<Bird> caged;

  public BirdEnclosure(int minCapacity, int maxCapacity){
    super(minCapacity, maxCapacity);
    this.caged = new ArrayList<Bird>();
  }

  public int birdCount() {
    return this.caged.size();
  }

  public void addBird(Bird bird) {
    this.caged.add(bird);
  }


}