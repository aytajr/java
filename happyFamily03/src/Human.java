import java.util.Arrays;
import java.util.Random;

public class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private Pet pet;
    private DayOfWeek[][] schedule;
    private Family family;

    static {
        System.out.println("Class Human is being loaded.");
    }

    // Non-static initialization block
    {
        System.out.println("A new Human object is being created.");
    }

    public Human() {}

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }


    public Human(String name, String surname, int year, int iq, Pet pet, DayOfWeek[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.schedule = schedule;
    }

    public Human(String name, String surname, int year, int iq, Pet pet, DayOfWeek[][] schedule, Family family) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.schedule = schedule;
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public DayOfWeek[][] getSchedule() {
        return schedule;
    }

    public void setSchedule(DayOfWeek[][] schedule) {
        this.schedule = schedule;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public void greetPet() {
        if (pet != null) {
            System.out.println("Hello, " + pet.getNickname());
        } else {
            System.out.println("There is no pet to greet!");
        }
    }

    public void describePet() {
        if (pet != null) {
            System.out.println("I have a " + pet.getSpecies() + ", it is " + pet.getAge() + " years old, he is " + (pet.getTrickLevel() > 50 ? "very sly" : "almost not sly"));
        } else {
            System.out.println("There is no pet to describe!");
        }
    }

    boolean feedPet(boolean isTimeForFeeding) {
        if (isTimeForFeeding) {
            System.out.println("Hm... I will feed " + name + "'s " + pet.getSpecies());
            return true;
        } else {
            Random random = new Random();
            int randomValue = random.nextInt(101);
            if (pet.getTrickLevel() > randomValue) {
                System.out.println("Hm... I will feed " + pet.getNickname());
                return true;
            } else {
                System.out.println("I think " + pet.getNickname() + " is not hungry.");
                return false;
            }
        }
    }

    @Override
    public String toString() {
        String scheduleFormatted = Arrays.deepToString(schedule);
        return "Human{name='" + name + "', surname='" + surname + "', year=" + year + ", iq=" + iq + ", schedule=" + scheduleFormatted + "}";
    }

    @Override
    @Deprecated(since = "9")
    @SuppressWarnings("deprecation")
    protected void finalize() throws Throwable {
        System.out.println("Human object " + this.name + " " + this.surname + " is being garbage collected.");
        super.finalize();
    }

}
