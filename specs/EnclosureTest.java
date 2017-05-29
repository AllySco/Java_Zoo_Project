import static org.junit.Assert.*;
import org.junit.*;
import zoo.*;


public class EnclosureTest {

    Enclosure enclosure;

  @Before
  public void before() {
    enclosure = new Enclosure(4,10);
  }


  @Test
  public void enclosureHasMinCapacity() {
    assertEquals(4, enclosure.getMinCapacity());
  }

  @Test
  public void enclosureHasMaxCapacity() {
    assertEquals(10, enclosure.getMaxCapacity());
  }






}