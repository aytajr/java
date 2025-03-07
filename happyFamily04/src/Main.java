public class Main {
    public static void main(String[] args) {
        Man man = new Man("John", "Doe", 1975);
        System.out.println("Testing Man-specific method (repairCar):");
        man.repairCar();

        Woman woman = new Woman("Jane", "Doe", 1980);
        System.out.println("\nTesting Woman-specific method (makeup):");
        woman.makeup();


        System.out.println("\nTesting greetPet for Man and Woman:");


        Pet dog = new Dog("Rocky", 5, 75, new String[]{"eating", "sleeping"});
        Pet cat = new DomesticCat("Whiskers", 3, 60, new String[]{"playing", "napping"});
        Pet fish = new Fish("Bubbles", 1, 10, new String[]{"swimming"});

        man.setPet(dog);
        woman.setPet(cat);


        System.out.println("Man's greetPet:");
        man.greetPet();

        System.out.println("Woman's greetPet:");
        woman.greetPet();

        System.out.println("\nTesting foul method for pets:");
        System.out.println("Dog's foul:");
        dog.foul();

        System.out.println("Cat's foul:");
        cat.foul();

        System.out.println("Fish's foul:");
        fish.foul();
    }
}