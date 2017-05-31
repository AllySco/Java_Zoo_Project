import zoo.*;

class Runner {
  public static void main(String[] args) {

    Food food = new Food();

    BearEnclosure bearEnclosure = new BearEnclosure(2,8);
    Bear bear = new Bear("Grizzly");
    Bear bear2 = new Bear("Brown");
    Bear bear3 = new Bear("Kodiak");
    Bear bear4 = new Bear("Kodiak");
    Bear bear5 = new Bear("Grizzly");
    Bear bear6 = new Bear("Grizzly");
    bearEnclosure.addBear(bear);
    bearEnclosure.addBear(bear2);
    bearEnclosure.addBear(bear3);
    bearEnclosure.addBear(bear4);
    bearEnclosure.addBear(bear5);
    bearEnclosure.addBear(bear6);

    bearEnclosure.addFoodToFeeder(food);
    bearEnclosure.addFoodToFeeder(food);

    bearEnclosure.getSpeciesCount();
    bearEnclosure.toString();

    System.out.println(bearEnclosure.toString());
    System.out.println(bearEnclosure.feedAnimal(bear, food));
    System.out.println(bearEnclosure.feedAnimal(bear, food));
    System.out.println(bearEnclosure.feedAnimal(bear4, food));
    System.out.println("");
    System.out.println("");
    System.out.println("");




    BigCatEnclosure bigCatEnclosure = new BigCatEnclosure(4,12);
    BigCat bigCat = new BigCat("Lion");
    BigCat bigCat2 = new BigCat("Tiger");
    BigCat bigCat3 = new BigCat("Panther");
    BigCat bigCat4 = new BigCat("Panther");
    BigCat bigCat5 = new BigCat("Panther");
    BigCat bigCat6 = new BigCat("Panther");
    bigCatEnclosure.addBigCat(bigCat);
    bigCatEnclosure.addBigCat(bigCat2);
    bigCatEnclosure.addBigCat(bigCat3);
    bigCatEnclosure.addBigCat(bigCat4);
    bigCatEnclosure.addBigCat(bigCat5);
    bigCatEnclosure.addBigCat(bigCat6);

    bigCatEnclosure.addFoodToFeeder(food);
    bigCatEnclosure.addFoodToFeeder(food);

    bigCatEnclosure.getSpeciesCount();
    bigCatEnclosure.toString();

    System.out.println(bigCatEnclosure.toString());
    System.out.println(bigCatEnclosure.feedAnimal(bigCat2, food));
    System.out.println(bigCatEnclosure.feedAnimal(bigCat2, food));
    System.out.println(bigCatEnclosure.feedAnimal(bigCat, food));
    System.out.println("");
    System.out.println("");
    System.out.println("");



    BirdEnclosure birdEnclosure = new BirdEnclosure(5,20);
    Bird bird = new Bird("Parrot");
    Bird bird2 = new Bird("Flamingo");
    Bird bird3 = new Bird("Flamingo");
    Bird bird4 = new Bird("Raven");
    Bird bird5 = new Bird("Raven");
    Bird bird6 = new Bird("Raven");
    Bird bird7 = new Bird("Raven");
    birdEnclosure.addBird(bird);
    birdEnclosure.addBird(bird2);
    birdEnclosure.addBird(bird3);
    birdEnclosure.addBird(bird4);
    birdEnclosure.addBird(bird5);
    birdEnclosure.addBird(bird6);
    birdEnclosure.addBird(bird7);

    birdEnclosure.addFoodToFeeder(food);
    birdEnclosure.addFoodToFeeder(food);

    birdEnclosure.getSpeciesCount();

    birdEnclosure.toString();

    System.out.println(birdEnclosure.toString());
    System.out.println(birdEnclosure.feedAnimal(bird7, food));
    System.out.println(birdEnclosure.feedAnimal(bird7, food));
    System.out.println(birdEnclosure.feedAnimal(bird2, food));
    System.out.println("");
    System.out.println("");
    System.out.println("");


    GorillaEnclosure gorillaEnclosure = new GorillaEnclosure(3,6);
    Gorilla gorilla = new Gorilla("River Cross");
    Gorilla gorilla2 = new Gorilla("River Cross");
    Gorilla gorilla3 = new Gorilla("Lowland");
    Gorilla gorilla4 = new Gorilla("Lowland");
    Gorilla gorilla5 = new Gorilla("Mountain");
    Gorilla gorilla6 = new Gorilla("Mountain");
    gorillaEnclosure.addGorilla(gorilla);
    gorillaEnclosure.addGorilla(gorilla2);
    gorillaEnclosure.addGorilla(gorilla3);
    gorillaEnclosure.addGorilla(gorilla4);
    gorillaEnclosure.addGorilla(gorilla5);
    gorillaEnclosure.addGorilla(gorilla6);

    gorillaEnclosure.getSpeciesCount();

    gorillaEnclosure.addFoodToFeeder(food);
    gorillaEnclosure.addFoodToFeeder(food);

    gorillaEnclosure.toString();

    System.out.println(gorillaEnclosure.toString());
    System.out.println(gorillaEnclosure.feedAnimal(gorilla, food));
    System.out.println(gorillaEnclosure.feedAnimal(gorilla, food));
    System.out.println(gorillaEnclosure.feedAnimal(gorilla4, food));
    System.out.println("");
    System.out.println("");
    System.out.println("");


    MonkeyEnclosure monkeyEnclosure = new MonkeyEnclosure(5,30);
    Monkey monkey = new Monkey("Spider");
    Monkey monkey2 = new Monkey("Howler");
    Monkey monkey3 = new Monkey("Mandrill");
    Monkey monkey4 = new Monkey("Spider");
    monkeyEnclosure.addMonkey(monkey);
    monkeyEnclosure.addMonkey(monkey2);
    monkeyEnclosure.addMonkey(monkey3);
    monkeyEnclosure.addFoodToFeeder(food);
    monkeyEnclosure.addFoodToFeeder(food);
    monkeyEnclosure.getSpeciesCount();
    monkeyEnclosure.toString();
    System.out.println(monkeyEnclosure.toString());
    System.out.println(monkeyEnclosure.feedAnimal(monkey, food));
    System.out.println(monkeyEnclosure.feedAnimal(monkey, food));
    System.out.println(monkeyEnclosure.feedAnimal(monkey4, food));
    System.out.println("");
    System.out.println("");
    System.out.println("");
  }
}