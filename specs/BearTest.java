import static org.junit.Assert.*;
import org.junit.*;
import zoo.*;

public class BearTest {

  Bear bear;

  @Before
  public void before() {
    bear = new Bear("Grizzly");
  }

  @Test
  public void bearHasSpecies() {
    assertEquals("Grizzly", bear.getSpecies());
  }


  @Test
  public void bearCanClimb() {
    assertEquals("Jumps up and grabs branch, gotta get that honey", bear.climb());
  }

  @Test
  public void bearIsMaulable() {
    assertEquals("Slashes with claws", bear.maul());
  }


}