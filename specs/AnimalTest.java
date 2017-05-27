import static org.junit.Assert.*;
import org.junit.*;
import zoo.*;
public class AnimalTest {


    @Test
    public void canGetAnimalSpecies() {
        Animal animal = new Animal("Chimp");
    assertEquals("Chimp", animal.getSpecies());
    }

}