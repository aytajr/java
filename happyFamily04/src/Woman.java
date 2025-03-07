public final class Woman extends Human {
    public Woman(String name, String surname, int year) {
        super(name, surname, year);
    }

    public Woman(String name, String surname, int year, int iq, Pet pet, DayOfWeek[][] schedule) {
        super(name, surname, year, iq, pet, schedule);
    }

    @Override
    public void greetPet() {
        System.out.println("Hi, " + getPet().getNickname() + ".");
    }

    public void makeup() {
        System.out.println("I'm putting on makeup.");
    }
}