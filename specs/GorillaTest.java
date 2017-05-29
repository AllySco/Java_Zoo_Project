import static org.junit.Assert.*;
import org.junit.*;
import zoo.*;

public class GorillaTest {

  Gorilla gorilla;

  @Before
  public void before() {
    gorilla = new Gorilla("Silverback");
  }

  @Test
  public void gorillaHasSpecies() {
    assertEquals("Silverback", gorilla.getSpecies());
  }

  @Test
  public void gorillaCanClimb() {
    assertEquals("Pulls up branch by branch", gorilla.climb());
  }

  @Test
  public void gorillaCanBeatChest() {
    assertEquals("Thump thump thump", gorilla.beatChest());
  }


  @Test
  public void gorillaCanRampage() {
    assertEquals("Breaks through the safety glass and knocks over everyone and everthing in his path", gorilla.rampage());
  }
}