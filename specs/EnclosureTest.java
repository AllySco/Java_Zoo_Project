import static org.junit.Assert.*;
import org.junit.*;
import zoo.*;


public class EnclosureTest {

    Enclosure enclosure;
    Food food;
    Animal animal;

  @Before
  public void before() {
    enclosure = new Enclosure(4,10);
    food = new Food();
    animal = new Animal("Grizzly");
  }


  @Test
  public void enclosureHasMinCapacity() {
    assertEquals(4, enclosure.getMinCapacity());
  }

  @Test
  public void enclosureHasMaxCapacity() {
    assertEquals(10, enclosure.getMaxCapacity());
  }

  @Test
  public void feederStartsEmpty() {
      assertEquals(0, enclosure.feederCount());
    }

    @Test
    public void canAddFoodToFeeder() {
      enclosure.addFoodToFeeder(food);
      assertEquals(1, enclosure.feederCount());
    }

    @Test
    public void canRemoveFoodFromFeeder() {
      enclosure.addFoodToFeeder(food);
      enclosure.addFoodToFeeder(food);
      enclosure.removeFoodFromFeeder();
      assertEquals(1, enclosure.feederCount());
    }

    @Test
    public void canFeedAnimals() {
      enclosure.addFoodToFeeder(food);
      enclosure.addFoodToFeeder(food);
      enclosure.feedAnimal(animal, food);
      assertEquals(1, enclosure.feederCount());
      assertEquals(1, animal.bellyCount());
    }







}