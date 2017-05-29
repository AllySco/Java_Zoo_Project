package zoo;
import behaviours.*;

public class BigCat extends Animal implements Maulable {
  public BigCat(String species){
    super(species);
  }


  public String climb() {
    return "Jumps up and lays on a branch";
  }

  // public String roar() {
  //   return "";
  // }

  public String maul() {
    return "Digs claws in";
  }

}
