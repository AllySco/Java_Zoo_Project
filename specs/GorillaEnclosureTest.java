import static org.junit.Assert.*;
import org.junit.*;
import zoo.*;

public class GorillaEnclosureTest {

  GorillaEnclosure gorillaEnclosure;
  Gorilla gorilla;
  Gorilla gorilla2;
  Gorilla gorilla3;
  Food food;

  @Before
  public void before() {
    gorillaEnclosure = new GorillaEnclosure(3,8);
    gorilla = new Gorilla("Cross River");
    gorilla2 = new Gorilla("Lowland");
    gorilla3 = new Gorilla("Mountain");
    food = new Food();
  }

  @Test
  public void gorillaEnclosureHasMinCapacity() {
    assertEquals(3, gorillaEnclosure.getMinCapacity());
  }

  @Test
  public void gorillaEnclosureHasMaxCapacity() {
    assertEquals(8, gorillaEnclosure.getMaxCapacity());
  }

  @Test
  public void cagedGorillaCount() {
    assertEquals(0, gorillaEnclosure.gorillaCount());
  }

  @Test
  public void canAddGorilla() {
    gorillaEnclosure.addGorilla(gorilla);
    gorillaEnclosure.addGorilla(gorilla);
    gorillaEnclosure.addGorilla(gorilla);
    assertEquals(3, gorillaEnclosure.gorillaCount());
  }

  @Test
  public void canRemoveGorilla() {
    gorillaEnclosure.addGorilla(gorilla);
    gorillaEnclosure.addGorilla(gorilla);
    gorillaEnclosure.addGorilla(gorilla);
    Gorilla gorilla = gorillaEnclosure.remove();
    assertEquals(2, gorillaEnclosure.gorillaCount());
  }

  @Test
  public void canCountSpecies() {
    gorillaEnclosure.addGorilla(gorilla);
    gorillaEnclosure.addGorilla(gorilla2);
    gorillaEnclosure.addGorilla(gorilla3);
    assertEquals(3, gorillaEnclosure.getSpeciesCount().size());
  }

  @Test
  public void canCheckForCrossRiver() {
    gorillaEnclosure.addGorilla(gorilla);
    gorillaEnclosure.addGorilla(gorilla2);
    gorillaEnclosure.addGorilla(gorilla3);
    assertEquals(true, gorillaEnclosure.getSpeciesCount().keySet().contains("Cross River"));
  }

  @Test
  public void canCheckForLowland() {
    gorillaEnclosure.addGorilla(gorilla);
    gorillaEnclosure.addGorilla(gorilla2);
    gorillaEnclosure.addGorilla(gorilla3);
    assertEquals(true, gorillaEnclosure.getSpeciesCount().keySet().contains("Lowland"));
  }

  @Test
  public void canCheckForMountain() {
    gorillaEnclosure.addGorilla(gorilla);
    gorillaEnclosure.addGorilla(gorilla2);
    gorillaEnclosure.addGorilla(gorilla3);
    assertEquals(true, gorillaEnclosure.getSpeciesCount().keySet().contains("Mountain"));
  }

  @Test
  public void canFeedGorillas() {
    gorillaEnclosure.addFoodToFeeder(food);
    gorillaEnclosure.addFoodToFeeder(food);
    gorillaEnclosure.feedAnimal(gorilla, food);
    assertEquals(1, gorillaEnclosure.feederCount());
    assertEquals(1, gorilla.bellyCount());
  }

  @Test
  public void canRampageStart() {
    gorillaEnclosure.feedAnimal(gorilla, food);
    assertEquals("Breaks through the safety glass and knocks over everyone and everything in his path", gorilla.rampage());
  }


}