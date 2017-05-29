import static org.junit.Assert.*;
import org.junit.*;
import zoo.*;

public class BigCatTest {

  BigCat bigCat;

  @Before
  public void before() {
    bigCat = new BigCat("Lion");
  }

  @Test
  public void bigCatHasSpecies() {
    assertEquals("Lion", bigCat.getSpecies());
  }

  @Test
  public void bigCatCanClimb() {
    assertEquals("Jumps up and lays on a branch", bigCat.climb());
  }
}