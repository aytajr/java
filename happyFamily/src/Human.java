import java.util.Random;

public class Human {
    public String name;
    public String surname;
    public int year;
    public int iq;
    public Pet pet;
    public Human mother;
    public Human father;
    public String[][] schedule;

    public Human() {}

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, Human father, Human mother) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.father = father;
        this.mother = mother;
    }

    public Human(String name, String surname, int year, int iq, Pet pet, Human mother, Human father, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;
    }

    public void greetPet() {
        if (pet != null) {
            System.out.println("Hello, " + pet.nickname);
        } else {
            System.out.println("There is no pet to greet!");
        }
    }

    public void describePet() {
        if (pet != null) {
            System.out.println("I have a " + pet.species + ", it is " + pet.age + " years old, he is " + (pet.trickLevel > 50 ? "very sly" : "almost not sly"));
        } else {
            System.out.println("There is no pet to describe!");
        }
    }

    boolean feedPet(boolean isTimeForFeeding) {
        if (isTimeForFeeding) {
            System.out.println("Hm... I will feed " + name + "'s " + pet.species);
            return true;
        } else {
            Random random = new Random();
            int randomValue = random.nextInt(101);
            if (pet.trickLevel > randomValue) {
                System.out.println("Hm... I will feed " + pet.nickname);
                return true;
            } else {
                System.out.println("I think " + pet.nickname + " is not hungry.");
                return false;
            }
        }
    }

    @Override
    public String toString() {
        return "Human{name='" + name + "', surname='" + surname + "', year=" + year + ", iq=" + iq + ", mother=" + (mother != null ? mother.name + " " + mother.surname : "no information") + ", father=" + (father != null ? father.name + " " + father.surname : "no information") + ", pet=" + (pet != null ? pet.toString() : "no information") + "}";
    }
}
