public class Student implements Comparable<Student> {
    private int id;
    private String name;
    private String surname;
    private double grade;
    private String gender;
    private int birthYear;


    public Student(int id, String name, String surname, double grade, String gender, int birthYear) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.grade = grade;
        this.gender = gender;
        this.birthYear = birthYear;
    }


    public int getId() { return id; }
    public String getName() { return name; }
    public String getSurname() { return surname; }
    public double getGrade() { return grade; }
    public String getGender() { return gender; }
    public int getBirthYear() { return birthYear; }


    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", grade=" + grade +
                ", gender='" + gender + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }
}