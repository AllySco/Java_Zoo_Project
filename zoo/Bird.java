package zoo;
import behaviours.*;

public class Bird extends Animal implements Escapable {
  public Bird(String species){
    super(species);
  }


  public String fly() {
    return "Flapping wings";
  }

  public String escape() {
    return "Bird has escaped and pooped on your car";
  }

}
