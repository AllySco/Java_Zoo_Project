package zoo;
import behaviours.*;

public class Gorilla extends Animal implements Rampaging, Climbable {

  public Gorilla(String species){
    super(species);
  }


  public String climb() {
    return "Pulls up branch by branch";
  }

  public String beatChest() {
    return "Thump thump thump";
  }

  public String rampage() {
      return "Breaks through the safety glass and knocks over everyone and everything in his path";
    }

}
