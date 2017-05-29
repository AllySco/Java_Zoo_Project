import static org.junit.Assert.*;
import org.junit.*;
import zoo.*;

public class BigCatEnclosureTest {

    BigCatEnclosure bigCatEnclosure;
    BigCat bigCat;

  @Before
  public void before() {
    bigCatEnclosure = new BigCatEnclosure(5,15);
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
}