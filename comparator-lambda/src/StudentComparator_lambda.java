import java.util.Comparator;

public class StudentComparator_lambda {

    public static Comparator<Student> getCustomComparator() {
        return (s1, s2) -> {
            if (s1.getGrade() != s2.getGrade()) {
                return Double.compare(s2.getGrade(), s1.getGrade());
            }

            if (s1.getBirthYear() != s2.getBirthYear()) {
                return Integer.compare(s1.getBirthYear(), s2.getBirthYear());
            }
            if (!s1.getGender().equals(s2.getGender())) {
                return s2.getGender().compareTo(s1.getGender());
            }
            if (!s1.getName().equals(s2.getName())) {
                return s2.getName().compareTo(s1.getName());
            }
            return Integer.compare(s1.getId(), s2.getId());
        };
    }
}