import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PetTest {

    @Test
    public void testEquals() {
        Pet pet1 = new Pet(Species.DOG, "Rocky", 5, 75, new String[]{"eating", "sleeping"});
        Pet pet2 = new Pet(Species.DOG, "Rocky", 5, 75, new String[]{"eating", "sleeping"});

        assertTrue(pet1.equals(pet2));
    }

    @Test
    public void testHashCode() {
        Pet pet1 = new Pet(Species.DOG, "Rocky", 5, 75, new String[]{"eating", "sleeping"});
        Pet pet2 = new Pet(Species.DOG, "Rocky", 5, 75, new String[]{"eating", "sleeping"});

        assertEquals(pet1.hashCode(), pet2.hashCode());
    }
}
