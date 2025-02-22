import java.util.Arrays;

public class Pet {
    private Species species;
    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits;

    static {
        System.out.println("Class Pet is being loaded.");
    }

    // non-static
    {
        System.out.println("A new Pet object is being created.");
    }


    public Pet() {}

    public Pet(Species species, String nickname) {
        this.species = species;
        this.nickname = nickname;
    }

    public Pet(Species species, String nickname, int age, int trickLevel, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public void setTrickLevel(int trickLevel) {
        this.trickLevel = trickLevel;
    }

    public String[] getHabits() {
        return habits;
    }

    public void setHabits(String[] habits) {
        this.habits = habits;
    }

    public void eat() {
        System.out.println("I am eating");
    }

    public void respond() {
        System.out.println("Hello, owner. I am - " + nickname + ". I miss you!");
    }

    public void foul() {
        System.out.println("I need to cover it up.");
    }

    @Override
    public String toString() {
        return species.name() + "{nickname='" + nickname + "', age=" + age + ", trickLevel=" + trickLevel +
                ", habits=" + Arrays.toString(habits) + ", canFly=" + species.canFly() +
                ", numberOfLegs=" + species.getNumberOfLegs() + ", hasFur=" + species.hasFur() + "}";
    }

    @Override
    @Deprecated(since = "9")
    @SuppressWarnings("deprecation")
    protected void finalize() throws Throwable {    // finalize method is deprecated so I tried to suppress warnings about deprecation
        throw new UnsupportedOperationException("finalize() method is not supported in this class.");
        // System.out.println("Pet object " + this.nickname + " is being garbage collected.");
        // super.finalize();
    }
}
