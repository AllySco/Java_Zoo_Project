package zoo;

import org.junit.Test;
import static org.junit.Assert.*;

public class AnimalTest {


    @Test
    public void canGetAnimalSpecies() {
        Animal animal = new Animal("Chimp");
    assertEquals("Chimp", animal.getSpecies());
    }

}