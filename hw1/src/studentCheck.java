public class studentCheck {
    public void showDetails(student student) {
        System.out.println("Name: " + student.getName());
        System.out.println("ID: " + student.getId());
        System.out.println("Age: " + student.getAge());
        System.out.println("Grade: " + student.getGrade());
        System.out.println("Email: " + student.getEmail());
    }

    public void updateGrade(student student, double grade) {
        student.setGrade(grade);
        System.out.println("New grade: " + student.getGrade());
    }

    public boolean isEligibleForGraduation(student student) {
        return student.getGrade() >= 2.5;
    }
}
