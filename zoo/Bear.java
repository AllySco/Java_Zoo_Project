package zoo;
import behaviours.*;

public class Bear extends Animal implements Maulable {
  public Bear(String species){
    super(species);
  }


  public String climb() {
    return "Jumps up and grabs branch, gotta get that honey";
  }

  public String maul() {
    return "Slashes with claws";
  }

}
