import static org.junit.Assert.*;
import org.junit.*;
import zoo.*;

public class GorillaEnclosureTest {

    GorillaEnclosure gorillaEnclosure;
    Gorilla gorilla;

  @Before
  public void before() {
    gorillaEnclosure = new GorillaEnclosure(3,8);
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
}