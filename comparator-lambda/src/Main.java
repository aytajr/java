import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Alice", "Smith", 85.5, "Female", 2000));
        students.add(new Student(2, "Bob", "Johnson", 90.0, "Male", 1999));
        students.add(new Student(3, "Charlie", "Brown", 85.5, "Male", 2000));
        students.add(new Student(4, "Diana", "Lee", 90.0, "Female", 1999));
        students.add(new Student(5, "Eve", "Taylor", 85.5, "Female", 2000));
        students.add(new Student(6, "Frank", "Miller", 88.0, "Male", 2001));
        students.add(new Student(7, "Grace", "Harris", 92.5, "Female", 1998));
        students.add(new Student(8, "Henry", "Clark", 88.0, "Male", 2001));
        students.add(new Student(9, "Ivy", "Lewis", 92.5, "Female", 1998));
        students.add(new Student(10, "Jack", "Walker", 85.5, "Male", 2000));

        Collections.sort(students);
        System.out.println("Sorted by ID:");
        students.forEach(System.out::println);

        List<Student> studentsCopy1 = new ArrayList<>(students);
        Collections.sort(studentsCopy1, new StudentComparator_task2());
        System.out.println("\nSorted by StudentComparator:");
        studentsCopy1.forEach(System.out::println);

        List<Student> studentsCopy2 = new ArrayList<>(students);
        Collections.sort(studentsCopy2, StudentComparator_lambda.getCustomComparator());
        System.out.println("\nSorted by lambda expression:");
        studentsCopy2.forEach(System.out::println);
    }
}