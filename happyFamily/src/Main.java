public class Main {
    public static void main(String[] args) {

        Pet dog = new Pet("dog", "Rock", 5, 75, new String[]{"eat", "drink", "sleep"});
        Pet cat = new Pet("cat", "Whiskers");
        Pet bird = new Pet();

        Human mother1 = new Human("Jane", "Karleone", 1955);
        Human father1 = new Human("Vito", "Karleone", 1950);

        // Human mother2 = new Human("Anna", "Wright", 1960);
        // Human father2 = new Human("George", "Wright", 1952);

        // Human mother3 = new Human("Lily", "Potter", 1960);
        // Human father3 = new Human("James", "Potter", 1960);


        Human child1 = new Human("Michael", "Karleone", 1977, 90, dog, mother1, father1, new String[][]{{"Monday", "Jogging"}});
        // Human child2 = new Human("Fred", "Wright", 1985, 95, cat, mother2, father2, new String[][]{{"Wednesday", "Swimming"}});
        // Human child3 = new Human("Harry", "Potter", 1980, 90, bird, mother3, father3, new String[][]{{"Saturday", "Tennis"}});


        System.out.println(mother1);
        System.out.println(father1);
        System.out.println(child1);

        // System.out.println(mother2);
        // System.out.println(father2);
        // System.out.println(child2);

        // System.out.println(mother3);
        // System.out.println(father3);
        // System.out.println(child3);


        child1.greetPet();
        child1.describePet();
        dog.eat();
        dog.respond();
        dog.foul();
        child1.feedPet(false);

        // child2.greetPet();
        // child2.describePet();
        // cat.eat();
        // cat.respond();
        // cat.foul();
        // child2.feedPet(true);

        // child3.greetPet();
        // child3.describePet();
        // bird.eat();
        // bird.respond();
        // bird.foul();
        // child3.feedPet(false);

    }
}
