public class Dog extends Pet {
    public Dog(String nickname, int age, int trickLevel, String[] habits) {
        super(nickname, age, trickLevel, habits);
    }

    @Override
    public void respond() {
        System.out.println("Woof! I am " + getNickname());
    }

    @Override
    public void foul() {
        System.out.println("I need to dig a hole.");
    }
}