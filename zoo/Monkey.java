package zoo;
import behaviours.*;

public class Monkey extends Animal implements Escapable {
  public Monkey(String species){
    super(species);
  }


  public String climb() {
    return "Shoots up a tree";
  }

  public String swing() {
    return "Moves gracefully betwen branches";
  }

  public String escape() {
    return "Jumps through a small hole in the fence, runs amok stealing food and visitors hats";
  }

}
