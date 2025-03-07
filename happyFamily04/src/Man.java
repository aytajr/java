public final class Man extends Human {
    public Man(String name, String surname, int year) {
        super(name, surname, year);
    }

    public Man(String name, String surname, int year, int iq, Pet pet, DayOfWeek[][] schedule) {
        super(name, surname, year, iq, pet, schedule);
    }

    @Override
    public void greetPet() {
        System.out.println("Hey, " + getPet().getNickname() + "! Let's go for a walk.");
    }

    public void repairCar() {
        System.out.println("I'm fixing the car.");
    }
}