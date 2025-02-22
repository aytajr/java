import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FamilyTest {

    @Test
    public void testAddChild() {
        Human mother = new Human("Jane", "Doe", 1980);
        Human father = new Human("John", "Doe", 1975);
        Family family = new Family(mother, father);

        Human child = new Human("Alice", "Doe", 2005);
        family.addChild(child);

        assertEquals(1, family.getChildren().size());
        assertEquals(child, family.getChildren().get(0));
    }

    @Test
    public void testDeleteChildByIndex() {
        Human mother = new Human("Jane", "Doe", 1980);
        Human father = new Human("John", "Doe", 1975);
        Family family = new Family(mother, father);

        Human child = new Human("Alice", "Doe", 2005);
        family.addChild(child);

        assertTrue(family.deleteChild(0));
        assertEquals(0, family.getChildren().size());
    }

    @Test
    public void testDeleteChildByObject() {
        Human mother = new Human("Jane", "Doe", 1980);
        Human father = new Human("John", "Doe", 1975);
        Family family = new Family(mother, father);

        Human child = new Human("Alice", "Doe", 2005);
        family.addChild(child);

        assertTrue(family.deleteChild(child));
        assertEquals(0, family.getChildren().size());
    }

    @Test
    public void testCountFamily() {
        Human mother = new Human("Jane", "Doe", 1980);
        Human father = new Human("John", "Doe", 1975);
        Family family = new Family(mother, father);

        Human child = new Human("Alice", "Doe", 2005);
        family.addChild(child);

        assertEquals(3, family.countFamily());
    }
}
