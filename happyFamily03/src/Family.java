import java.util.ArrayList;
import java.util.List;

public class Family {
    private Human mother;
    private Human father;
    // private Human[] children;
    private List<Human> children;
    private Pet pet;
    private boolean familyCheck;

    static {
        System.out.println("Class Family is being loaded.");
    }

    {
        System.out.println("A new Family object is being created.");
    }


    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
        // this.children = new Human[0];
        children = new ArrayList<>();
        this.mother.setFamily(this);
        this.father.setFamily(this);
        // familyCheck = true;
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
        int familyCount = 2;
        familyCount += children.size();
        if (pet != null) {
            familyCount += 1;
        }
        return familyCount;
    }



    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        // if (familyCheck) {
        //   throw new IllegalStateException("The mother cannot be changed. It's a different family.");
        //}
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        // if (familyCheck) {
        //     throw new IllegalStateException("The father cannot be changed. It's a different family.");
        // }
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Family family = (Family) obj;

        return mother.equals(family.mother) && father.equals(family.father);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Mother: " + mother.getName() + " " + mother.getSurname() + ", Age: " + mother.getYear() + "\n");
        result.append("Father: ").append(father.getName()).append(" ").append(father.getSurname()).append(", Age: ").append(father.getYear()).append("\n");

        // checking if there are any children
        if (!children.isEmpty()) {
            result.append("Children: ");
            for (Human child : children) {
                result.append(child.getName()).append(" ").append(child.getSurname()).append(" (Age: ").append(child.getYear()).append("), ");
            }
            // Remove the last comma and space
            result = new StringBuilder(result.substring(0, result.length() - 2));
            result.append("\n");
        }

        result.append("Pet: ");
        if (pet != null) {
            result.append(pet.getNickname()).append(" (Species: ").append(pet.getSpecies()).append(", Age: ").append(pet.getAge()).append(", Trick Level: ").append(pet.getTrickLevel()).append(")");
        } else {
            result.append("No pet.");
        }

        result.append("\nTotal Family Members: ").append(countFamily());

        return result.toString();
    }

    @Override
    @Deprecated(since = "9")
    @SuppressWarnings("deprecation")
    protected void finalize() throws Throwable {
        throw new UnsupportedOperationException("finalize() method is not supported in this class.");
        // System.out.println("Family object with mother " + mother.getName() + " and father " + father.getName() + " is being garbage collected.");
        // super.finalize();
    }



}


