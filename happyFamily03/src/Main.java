public class Main {
    public static void main(String[] args) {
        /*for (int i = 0; i < 100000; i++) {
            new Human("Name" + i, "Surname" + i, 2000);
        }
        System.gc(); // for running garbage collection*/

        // for returning the string representation
        DayOfWeek[][] schedule = {
                {DayOfWeek.MONDAY, DayOfWeek.TUESDAY},
                {DayOfWeek.WEDNESDAY, DayOfWeek.THURSDAY},
                {DayOfWeek.FRIDAY, DayOfWeek.SATURDAY}
        };

        // for checking the previous part
        Human human = new Human("Harry", "Potter", 1980, 100, null, schedule);
        System.out.println("Human toString(): " + human.toString()); // toString for Human

        System.out.println(human);

        // creating new family, to implement the checks
        Human mother = new Human("Jane", "Doe", 1980);
        Human father = new Human("John", "Doe", 1975);
        Family family = new Family(mother, father);

        Human child1 = new Human("Alice", "Doe", 2005);

        // checking if Alice is added
        System.out.println("Before adding Alice: " + family.getChildren().size());
        family.addChild(child1);
        System.out.println("After adding Alice: " + family.getChildren().size());
        System.out.println("Child in family: " + family.getChildren().get(0).getName());


        Human child2 = new Human("Bob", "Doe", 2010);

        family.addChild(child1);
        family.addChild(child2);

        // checking deletion part1
        /*System.out.println("Before deleting Alice: " + family.getChildren().size());
        boolean isDeleted = family.deleteChild(child1);
        System.out.println("Alice deleted: " + isDeleted); // Should print true
        System.out.println("After deleting Alice: " + family.getChildren().size());

        // checking deletion part2, checking the case the argument doesn't exist
        Human nonExistentChild = new Human("Charlie", "Doe", 2015);
        isDeleted = family.deleteChild(nonExistentChild);
        System.out.println("Charlie deleted: " + isDeleted);
        System.out.println("After trying to delete Charlie: " + family.getChildren().size());*/

        // checking deletion part, but with index
        System.out.println("Before deleting at index 0: " + family.getChildren().size());
        boolean isDeleted = family.deleteChild(0);
        System.out.println("Child at index 0 deleted: " + isDeleted);
        System.out.println("After deleting at index 0: " + family.getChildren().size());

        // deletion part again, with invalid index
        isDeleted = family.deleteChild(5);
        System.out.println("Child at index 5 deleted: " + isDeleted);
        System.out.println("After trying to delete at index 5: " + family.getChildren().size());


        Pet pet = new Pet(Species.DOG, "Rocky", 5, 75, new String[]{"eating", "sleeping"});
        family.setPet(pet);
        System.out.println("Pet toString(): " + pet.toString()); // toString for Pet class

        System.out.println("Family toString(): " + family.toString()); // toString for Family

        System.out.println("Total family members: " + family.countFamily()); // counting family members

        // check equals and hashCode
        Human mother1 = new Human("Jane", "Doe", 1980);
        Human father1 = new Human("John", "Doe", 1975);
        Family family1 = new Family(mother1, father1);

        Human mother2 = new Human("Jane", "Doe", 1980);
        Human father2 = new Human("John", "Doe", 1975);
        Family family2 = new Family(mother2, father2);


        System.out.println("Are families equal? " + family1.equals(family2));

        System.out.println("Family 1 hash code: " + family1.hashCode());
        System.out.println("Family 2 hash code: " + family2.hashCode());
        System.out.println("Do hash codes match? " + (family1.hashCode() == family2.hashCode()));
        }

    }