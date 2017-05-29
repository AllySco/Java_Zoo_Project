import zoo.*;

class Runner {
  public static void main(String[] args) {

    BearEnclosure bearEnclosure = new BearEnclosure(2,8);
    Bear bear = new Bear("Grizzly");
    Bear bear2 = new Bear("Brown");
    Bear bear3 = new Bear("Kodiak");
    bearEnclosure.addBear(bear);
    bearEnclosure.addBear(bear2);
    bearEnclosure.addBear(bear3);
    bearEnclosure.addBear(bear2);

    bearEnclosure.getSpeciesCount();

    bearEnclosure.toString();
    System.out.println(bearEnclosure.toString());
  }
}