import static org.junit.Assert.*;
import org.junit.*;
import zoo.*;

public class BirdTest {

  Bird bird;

  @Before
  public void before() {
    bird = new Bird("Cockatoo");
  }


  @Test
  public void birdCanFly() {
    assertEquals("Flapping wings", bird.fly());
  }


  @Test
  public void birdHasSpecies() {
    assertEquals("Cockatoo", bird.getSpecies());
  }


  @Test
  public void birdIsEscapable() {
    assertEquals("Bird has escaped and pooped on your car", bird.escape());
  }


}