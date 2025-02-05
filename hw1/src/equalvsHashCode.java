import java.util.Objects;
/* Before comparison, consistency between these two methods must be ensured, meaning if two objects are equal
according to the equals() method, they also have to have the same hashCode() value (the same hash code). Unequal
objects may have the same hash code, and the hash code must stay the same unless the fields of the equals method changes.*/


class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Person p1 = new Person("Aytaj", 18);
        Person p2 = new Person("Aytaj", 18);

        System.out.println(p1.equals(p2));
        System.out.println(p1.hashCode() == p2.hashCode());
    }
}

/* By default, these methods work with memory addresses, and as they are not the same objects in the memory, both
outputs will be false. */

class Person2 {
    private String name;
    private int age;

    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;  // Null check and class comparison
        Person2 person = (Person2) obj;  // Cast to Person class
        return age == person.age && name.equals(person.name);  // Compare fields
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public static void main(String[] args) {
        Person p1 = new Person("John", 30);
        Person p2 = new Person("John", 30);

        System.out.println(p1.equals(p2));
        System.out.println(p1.hashCode() == p2.hashCode());
    }
}

/* By overriding these methods, we are able to compare objects based on their contents. */

