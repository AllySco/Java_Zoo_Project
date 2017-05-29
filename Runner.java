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



    BigCatEnclosure bigCatEnclosure = new BigCatEnclosure(4,12);
    BigCat bigCat = new BigCat("Lion");
    BigCat bigCat2 = new BigCat("Tiger");
    BigCat bigCat3 = new BigCat("Panther");
    bigCatEnclosure.addBigCat(bigCat);
    bigCatEnclosure.addBigCat(bigCat2);
    bigCatEnclosure.addBigCat(bigCat3);

    bigCatEnclosure.getSpeciesCount();

    bigCatEnclosure.toString();
    System.out.println(bigCatEnclosure.toString());



    BirdEnclosure birdEnclosure = new BirdEnclosure(5,20);
    Bird bird = new Bird("Parrot");
    Bird bird2 = new Bird("Flamingo");
    Bird bird3 = new Bird("Raven");
    birdEnclosure.addBird(bird);
    birdEnclosure.addBird(bird2);
    birdEnclosure.addBird(bird3);

    birdEnclosure.getSpeciesCount();

    birdEnclosure.toString();
    System.out.println(birdEnclosure.toString());



    GorillaEnclosure gorillaEnclosure = new GorillaEnclosure(3,6);
    Gorilla gorilla = new Gorilla("River Cross");
    Gorilla gorilla2 = new Gorilla("Lowland");
    Gorilla gorilla3 = new Gorilla("Mountain");
    gorillaEnclosure.addGorilla(gorilla);
    gorillaEnclosure.addGorilla(gorilla2);
    gorillaEnclosure.addGorilla(gorilla3);

    gorillaEnclosure.getSpeciesCount();

    gorillaEnclosure.toString();
    System.out.println(gorillaEnclosure.toString());



    MonkeyEnclosure monkeyEnclosure = new MonkeyEnclosure(5,30);
    Monkey monkey = new Monkey("Spider");
    Monkey monkey2 = new Monkey("Howler");
    Monkey monkey3 = new Monkey("Mandrill");
    monkeyEnclosure.addMonkey(monkey);
    monkeyEnclosure.addMonkey(monkey2);
    monkeyEnclosure.addMonkey(monkey3);

    monkeyEnclosure.getSpeciesCount();

    monkeyEnclosure.toString();
    System.out.println(monkeyEnclosure.toString());
  }
}