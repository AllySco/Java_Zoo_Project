import static org.junit.Assert.*;
import org.junit.*;
import zoo.*;

public class MonkeyEnclosureTest {

  MonkeyEnclosure monkeyEnclosure;
  Monkey monkey;
  Monkey monkey2;
  Monkey monkey3;
  Food food;

  @Before
  public void before() {
    monkeyEnclosure = new MonkeyEnclosure(5,30);
    monkey = new Monkey("Spider");
    monkey2 = new Monkey("Howler");
    monkey3 = new Monkey("Mandrill");
    food = new Food();
  }

  @Test
  public void monkeyEnclosureHasMinCapacity() {
    assertEquals(5, monkeyEnclosure.getMinCapacity());
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

  @Test
  public void canCountSpecies() {
    monkeyEnclosure.addMonkey(monkey);
    monkeyEnclosure.addMonkey(monkey2);
    monkeyEnclosure.addMonkey(monkey3);
    assertEquals(3, monkeyEnclosure.getSpeciesCount().size());
  }

  @Test
  public void canCheckForSpider() {
    monkeyEnclosure.addMonkey(monkey);
    monkeyEnclosure.addMonkey(monkey2);
    monkeyEnclosure.addMonkey(monkey3);
    assertEquals(true, monkeyEnclosure.getSpeciesCount().keySet().contains("Spider"));
  }

  @Test
  public void canCheckForHowler() {
    monkeyEnclosure.addMonkey(monkey);
    monkeyEnclosure.addMonkey(monkey2);
    monkeyEnclosure.addMonkey(monkey3);
    assertEquals(true, monkeyEnclosure.getSpeciesCount().keySet().contains("Howler"));
  }

  @Test
  public void canCheckForMandrill() {
    monkeyEnclosure.addMonkey(monkey);
    monkeyEnclosure.addMonkey(monkey2);
    monkeyEnclosure.addMonkey(monkey3);
    assertEquals(true, monkeyEnclosure.getSpeciesCount().keySet().contains("Mandrill"));
  }

  @Test
  public void canStartEscape() {
    monkeyEnclosure.feedAnimal(monkey, food);
    assertEquals("Monkeys jump through a small hole in the fence, runs amok stealing food and visitors hats", monkey.escape());
  }


}