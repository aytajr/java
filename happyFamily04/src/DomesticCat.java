public class DomesticCat extends Pet {
    public DomesticCat(String nickname, int age, int trickLevel, String[] habits) {
        super(nickname, age, trickLevel, habits);
    }

    @Override
    public void respond() {
        System.out.println("Meow! I am " + getNickname());
    }

    @Override
    public void foul() {
        System.out.println("I need to cover it up with litter.");
    }
}