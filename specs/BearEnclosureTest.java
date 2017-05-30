import static org.junit.Assert.*;
import org.junit.*;
import zoo.*;

public class BearEnclosureTest {

  BearEnclosure bearEnclosure;
  Bear bear;
  Bear bear2;
  Bear bear3;
  Food food;

  @Before
  public void before() {
    bearEnclosure = new BearEnclosure(2,4);
    bear = new Bear("Grizzly");
    bear2 = new Bear("Brown");
    bear3 = new Bear("Kodiak");
    food = new Food();
  }

  @Test
  public void bearEnclosureHasMinCapacity() {
    assertEquals(2, bearEnclosure.getMinCapacity());
  }

  @Test
  public void bearEnclosureHasMaxCapacity() {
    assertEquals(4, bearEnclosure.getMaxCapacity());
  }

  @Test
  public void cagedBearCount() {
    assertEquals(0, bearEnclosure.bearCount());
  }

  @Test
  public void canAddBears() {
    bearEnclosure.addBear(bear);
    bearEnclosure.addBear(bear);
    bearEnclosure.addBear(bear);
    assertEquals(3, bearEnclosure.bearCount());
  }

  @Test
  public void canRemoveBears() {
    bearEnclosure.addBear(bear);
    bearEnclosure.addBear(bear);
    bearEnclosure.addBear(bear);
    Bear bear = bearEnclosure.remove();
    assertEquals(2, bearEnclosure.bearCount());
  }

  @Test
  public void canCountSpecies() {
    bearEnclosure.addBear(bear);
    bearEnclosure.addBear(bear2);
    bearEnclosure.addBear(bear3);
    assertEquals(3, bearEnclosure.getSpeciesCount().size());
  }

  @Test
  public void canCheckForGrizzly() {
    bearEnclosure.addBear(bear);
    bearEnclosure.addBear(bear2);
    bearEnclosure.addBear(bear3);
    assertEquals(true, bearEnclosure.getSpeciesCount().keySet().contains("Grizzly"));
  }

  @Test
  public void canCheckForBrown() {
    bearEnclosure.addBear(bear);
    bearEnclosure.addBear(bear2);
    bearEnclosure.addBear(bear3);
    assertEquals(true, bearEnclosure.getSpeciesCount().keySet().contains("Brown"));
  }

  @Test
  public void canCheckForKodiak() {
    bearEnclosure.addBear(bear);
    bearEnclosure.addBear(bear2);
    bearEnclosure.addBear(bear3);
    assertEquals(true, bearEnclosure.getSpeciesCount().keySet().contains("Kodiak"));
  }

  @Test
  public void canStartMauling() {
    bearEnclosure.feedAnimal(bear, food);
    assertEquals("Slashes with claws", bear.maul());
  }

}