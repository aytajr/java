import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Family implements HumanCreator {
    private Human mother;
    private Human father;
    private List<Human> children;
    private Pet pet;

    static {
        System.out.println("Class Family is being loaded.");
    }

    {
        System.out.println("A new Family object is being created.");
    }

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
        this.children = new ArrayList<>();
        this.mother.setFamily(this);
        this.father.setFamily(this);
    }

    public void addChild(Human child) {
        if (child != null) {
            children.add(child);
            child.setFamily(this);
        }
    }

    public boolean deleteChild(int index) {
        if (index >= 0 && index < children.size()) {
            Human removedChild = children.remove(index);
            removedChild.setFamily(null);
            return true;
        }
        return false;
    }

    public boolean deleteChild(Human child) {
        if (child == null || !children.contains(child)) {
            return false;
        }
        children.remove(child);
        child.setFamily(null);
        return true;
    }

    public int countFamily() {
        return 2 + children.size() + (pet != null ? 1 : 0);
    }

    @Override
    public Human bornChild() {
        Random random = new Random();
        boolean isMale = random.nextBoolean();
        String name = isMale ? "John" : "Jane"; // Replace with a list of names if needed
        int iq = (getFather().getIq() + getMother().getIq()) / 2;

        if (isMale) {
            return new Man(name, getFather().getSurname(), 2023, iq, null, null);
        } else {
            return new Woman(name, getFather().getSurname(), 2023, iq, null, null);
        }
    }

    // Getters and setters
    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public List<Human> getChildren() {
        return children;
    }

    public void setChildren(List<Human> children) {
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "Family{mother=" + mother.getName() + ", father=" + father.getName() + ", children=" + children + ", pet=" + pet + "}";
    }
}