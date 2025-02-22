import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HumanTest {

    @Test
    public void testEquals() {
        Human human1 = new Human("Harry", "Potter", 1980);
        Human human2 = new Human("Harry", "Potter", 1980);

        assertTrue(human1.equals(human2));
    }

    @Test
    public void testHashCode() {
        Human human1 = new Human("Harry", "Potter", 1980);
        Human human2 = new Human("Harry", "Potter", 1980);

        assertEquals(human1.hashCode(), human2.hashCode());
    }
}
