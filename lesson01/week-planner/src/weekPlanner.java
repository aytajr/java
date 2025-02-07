import java.util.Scanner;

public class weekPlanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] schedule = {
                {"Sunday", "do home work"},
                {"Monday", "go to courses; watch a film"},
                {"Tuesday", "go to the gym"},
                {"Wednesday", "attend meetings"},
                {"Thursday", "read a book"},
                {"Friday", "hang out with friends"},
                {"Saturday", "go shopping"}
        };

        while (true) {
            System.out.print("Please, input the day of the week: ");
            String input = scanner.nextLine().trim().toLowerCase();

            if (input.equals("exit")) {
                System.out.println("Exiting the program...");
                break;
            }

            boolean found = false;
            for (int i = 0; i < schedule.length; i++) {
                if (schedule[i][0].equalsIgnoreCase(input)) {
                    System.out.println("Your tasks for " + schedule[i][0] + ": " + schedule[i][1] + ".");
                    found = true;
                    break;
                }
            }

            if (input.startsWith("change ") || input.startsWith("reschedule ")) {
                String day = input.substring(input.indexOf(" ") + 1).trim();
                for (int j = 0; j < schedule.length; j++) {
                    if (schedule[j][0].equalsIgnoreCase(day)) {
                        System.out.print("Please, input new tasks for " + schedule[j][0] + ": ");
                        schedule[j][1] = scanner.nextLine().trim();
                        System.out.println("Tasks updated successfully.");
                        found = true;
                        break;
                    }
                }
            }

            if (!found) {
                System.out.println("Sorry, I don't understand you, please try again.");
            }
        }
        scanner.close();
    }
}

