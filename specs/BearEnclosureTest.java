import static org.junit.Assert.*;
import org.junit.*;
import zoo.*;

public class BearEnclosureTest {

    BearEnclosure bearEnclosure;
    Bear bear;

  @Before
  public void before() {
    bearEnclosure = new BearEnclosure(2,4);
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
}