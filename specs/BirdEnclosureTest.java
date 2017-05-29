import static org.junit.Assert.*;
import org.junit.*;
import zoo.*;

public class BirdEnclosureTest {

    BirdEnclosure birdEnclosure;
    Bird bird;
    Bird bird2;
    Bird bird3;

  @Before
  public void before() {
    birdEnclosure = new BirdEnclosure(5,10);
    bird = new Bird("Parrot");
    bird2 = new Bird("Flamingo");
    bird3 = new Bird("Raven");
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

  @Test
  public void canRemoverBirds() {
    birdEnclosure.addBird(bird);
    birdEnclosure.addBird(bird);
    birdEnclosure.addBird(bird);
    Bird bird = birdEnclosure.remove();
    assertEquals(2, birdEnclosure.birdCount());
  }


  @Test
  public void canCountSpecies() {
    birdEnclosure.addBird(bird);
    birdEnclosure.addBird(bird2);
    birdEnclosure.addBird(bird3);
    assertEquals(3, birdEnclosure.getSpeciesCount().size());
  }

  @Test
  public void canCheckForParrot() {
    birdEnclosure.addBird(bird);
    birdEnclosure.addBird(bird2);
    birdEnclosure.addBird(bird3);
    assertEquals(true, birdEnclosure.getSpeciesCount().keySet().contains("Parrot"));
  }

  @Test
  public void canCheckForFlamingo() {
    birdEnclosure.addBird(bird);
    birdEnclosure.addBird(bird2);
    birdEnclosure.addBird(bird3);
    assertEquals(true, birdEnclosure.getSpeciesCount().keySet().contains("Flamingo"));
  }

  @Test
  public void canCheckForRaven() {
    birdEnclosure.addBird(bird);
    birdEnclosure.addBird(bird2);
    birdEnclosure.addBird(bird3);
    assertEquals(true, birdEnclosure.getSpeciesCount().keySet().contains("Raven"));
  }

}