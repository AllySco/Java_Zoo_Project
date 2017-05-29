import static org.junit.Assert.*;
import org.junit.*;
import zoo.*;

public class BirdEnclosureTest {

    BirdEnclosure birdEnclosure;
    Bird bird;

  @Before
  public void before() {
    birdEnclosure = new BirdEnclosure(5,10);
  }


  @Test
  public void birdEnclosureHasMinCapacity() {
    assertEquals(5, birdEnclosure.getMinCapacity());
  }

  @Test
  public void birdEnclosureHasMaxCapacity() {
    assertEquals(10, birdEnclosure.getMaxCapacity());
  }

  @Test
  public void cagedBirdCount() {
    assertEquals(0, birdEnclosure.birdCount());
  }

  @Test
  public void canAddBirds() {
    birdEnclosure.addBird(bird);
    birdEnclosure.addBird(bird);
    birdEnclosure.addBird(bird);
    assertEquals(3, birdEnclosure.birdCount());
  }

}