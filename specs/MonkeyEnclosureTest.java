import static org.junit.Assert.*;
import org.junit.*;
import zoo.*;

public class MonkeyEnclosureTest {

    MonkeyEnclosure monkeyEnclosure;
    Monkey monkey;

  @Before
  public void before() {
    monkeyEnclosure = new MonkeyEnclosure(10,30);
  }

  @Test
  public void monkeyEnclosureHasMinCapacity() {
    assertEquals(10, monkeyEnclosure.getMinCapacity());
  }

  @Test
  public void monkeyEnclosureHasMaxCapacity() {
    assertEquals(30, monkeyEnclosure.getMaxCapacity());
  }

  @Test
  public void cagedMonkeyCount() {
    assertEquals(0, monkeyEnclosure.monkeyCount());
  }

  @Test
  public void canAddMonkey() {
    monkeyEnclosure.addMonkey(monkey);
    monkeyEnclosure.addMonkey(monkey);
    monkeyEnclosure.addMonkey(monkey);
    assertEquals(3, monkeyEnclosure.monkeyCount());
  }

  @Test
  public void canRemoveMonkey() {
    monkeyEnclosure.addMonkey(monkey);
    monkeyEnclosure.addMonkey(monkey);
    monkeyEnclosure.addMonkey(monkey);
    Monkey monkey = monkeyEnclosure.remove();
    assertEquals(2, monkeyEnclosure.monkeyCount());
  }
}