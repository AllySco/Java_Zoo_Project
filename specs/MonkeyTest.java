import static org.junit.Assert.*;
import org.junit.*;
import zoo.*;

public class MonkeyTest {

  Monkey monkey;

  @Before
  public void before() {
    monkey = new Monkey("Spider");
  }

  @Test
  public void monkeyHasSpecies() {
    assertEquals("Spider", monkey.getSpecies());
  }


  @Test
  public void monkeyCanClimb() {
    assertEquals("Shoots up a tree", monkey.climb());
  }

  @Test
  public void monkeyCanSwing() {
    assertEquals("Moves gracefully betwen branches", monkey.swing());
  }

  @Test
  public void monkeyCanEscape() {
    assertEquals("Monkeys jump through a small hole in the fence, runs amok stealing food and visitors hats", monkey.escape());
  }

  

}