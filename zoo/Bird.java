package zoo;

public class Bird extends Animal {
  public Bird(String species){
    super(species);
  }


  public String fly() {
    return "Flapping wings";
  }

}
