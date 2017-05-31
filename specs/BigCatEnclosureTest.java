import static org.junit.Assert.*;
import org.junit.*;
import zoo.*;

public class BigCatEnclosureTest {

  BigCatEnclosure bigCatEnclosure;
  BigCat bigCat;
  BigCat bigCat2;
  BigCat bigCat3;
  Food food;

  @Before
  public void before() {
    bigCatEnclosure = new BigCatEnclosure(5,15);
    bigCat = new BigCat("Lion");
    bigCat2 = new BigCat("Tiger");
    bigCat3 = new BigCat("Panther");
    food = new Food();

  }

  @Test
  public void bigCatEnclosureHasMinCapacity() {
    assertEquals(5, bigCatEnclosure.getMinCapacity());
  }

  @Test
  public void bigCatEnclosureHasMaxCapacity() {
    assertEquals(15, bigCatEnclosure.getMaxCapacity());
  }

  @Test
  public void cagedBigCatCount() {
    assertEquals(0, bigCatEnclosure.bigCatCount());
  }

  @Test
  public void canAddBigCat() {
    bigCatEnclosure.addBigCat(bigCat);
    bigCatEnclosure.addBigCat(bigCat);
    bigCatEnclosure.addBigCat(bigCat);
    assertEquals(3, bigCatEnclosure.bigCatCount());
  }

  @Test
  public void canRemoveBigCat() {
    bigCatEnclosure.addBigCat(bigCat);
    bigCatEnclosure.addBigCat(bigCat);
    bigCatEnclosure.addBigCat(bigCat);
    BigCat bigCat = bigCatEnclosure.remove();
    assertEquals(2, bigCatEnclosure.bigCatCount());
  }

  @Test
  public void canCountSpecies() {
    bigCatEnclosure.addBigCat(bigCat);
    bigCatEnclosure.addBigCat(bigCat2);
    bigCatEnclosure.addBigCat(bigCat3);
    assertEquals(3, bigCatEnclosure.getSpeciesCount().size());
  }

  @Test
  public void canCheckForLion() {
    bigCatEnclosure.addBigCat(bigCat);
    bigCatEnclosure.addBigCat(bigCat2);
    bigCatEnclosure.addBigCat(bigCat3);
    assertEquals(true, bigCatEnclosure.getSpeciesCount().keySet().contains("Lion"));
  }

  @Test
  public void canCheckForTiger() {
    bigCatEnclosure.addBigCat(bigCat);
    bigCatEnclosure.addBigCat(bigCat2);
    bigCatEnclosure.addBigCat(bigCat3);
    assertEquals(true, bigCatEnclosure.getSpeciesCount().keySet().contains("Tiger"));
  }

  @Test
  public void canCheckForPanther() {
    bigCatEnclosure.addBigCat(bigCat);
    bigCatEnclosure.addBigCat(bigCat2);
    bigCatEnclosure.addBigCat(bigCat3);
    assertEquals(true, bigCatEnclosure.getSpeciesCount().keySet().contains("Panther"));
  }

  @Test
  public void canStartMauling() {
    bigCatEnclosure.feedAnimal(bigCat, food);
    assertEquals("Digs claws in", bigCat.maul());
  }

}