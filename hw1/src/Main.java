public class Main {
    public static void main(String[] args) {
        student student = new student("Aytaj", 1010111, 17, 3.5, "fake@gmail.com");

        studentCheck studentCheck = new studentCheck();

        studentCheck.showDetails(student);
        studentCheck.updateGrade(student, 1);


        if(studentCheck.isEligibleForGraduation(student)) {
            System.out.println("The student is eligible for graduation!!!");
        } else {
            System.out.println("The student is NOT eligible for graduation!!!");
        }
    }
}


