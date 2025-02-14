public class Main {
        public static void main(String[] args) {

            // Pet pet1 = new Pet("dog", "Rock", 5, 75, new String[]{"eating", "drinking", "sleeping"});
            // Pet pet2 = new Pet("cat", "Whiskers");


            Human mother = new Human("Jane", "Karleone", 1955, 120, null, new String[][]{{"Monday", "Work"}, {"Tuesday", "Grocery"}});
            Human father = new Human("Vito", "Karleone", 1950, 130, null, new String[][]{{"Monday", "Work"}, {"Tuesday", "Gym"}});

            Family family = new Family(mother, father);

            Human child1 = new Human("Michael", "Karleone", 1977, 100, null, new String[][]{{"Monday", "School"}, {"Tuesday", "Soccer"}});
            Human child2 = new Human("James", "Karleone", 2012);

            family.addChild(child1);
            family.addChild(child2);

            family.setPet(new Pet("dog", "Rock", 5, 75, new String[]{"eating", "drinking", "sleeping"}));

            System.out.println("Family details:\n" + family);

            // delete 1
            family.deleteChild(0);

            // after deletion
            System.out.println("After deleting child 1:\n" + family); // index 0

            // delete 2
            family.deleteChild(child2);

            // final result
            System.out.println("\nFamily details after deleting James (child 2):\n" + family);
        }
    }

