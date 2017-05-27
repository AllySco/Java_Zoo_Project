import static org.junit.Assert.*;
import org.junit.*;
import zoo.*;
public class AnimalTest {

  Food food;
  Animal animal;

  @Before 
  public void before() {
    animal = new Animal("Chimp");
    food = new Food(); 
  }

  @Test
  public void canGetAnimalSpecies() {
    assertEquals("Chimp", animal.getSpecies());
  }


  @Test
  public void bellyStartsEmpty() {
    assertEquals(0, animal.bellyCount());

  }

}