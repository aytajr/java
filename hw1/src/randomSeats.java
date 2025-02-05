import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class randomSeats {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();
        students.add("Abbasgulu Zeynalov");
        students.add("Anar Gurbanov");
        students.add("Arif Hajiyev");
        students.add("Asmar Karimli");
        students.add("Ayla Aghadadashova");
        students.add("Aytaj Abdullayeva");
        students.add("Aytaj Rustamova");
        students.add("Elmir Abbasov");
        students.add("Elshad Shafaggatov");
        students.add("Farid Guliyev");
        students.add("Farid Mahmudlu");
        students.add("Farid Mehtiyev");
        students.add("Fatima Aliyeva");
        students.add("Fuad Aliyev");
        students.add("Hijran Shukurlu");
        students.add("Ildirim Ismayilzada");
        students.add("Islam Islamzade");
        students.add("Ismayil Abdullayev");
        students.add("Javid Nazarov");
        students.add("Kanan Ahmadov");
        students.add("Mehin Aliyeva");
        students.add("Murad Guliyev");
        students.add("Nazrin Gasimova");
        students.add("Nazrin Muradli");
        students.add("Nihad Huseynli");
        students.add("Nikhat Mamedov");
        students.add("Nilgun Arifli");
        students.add("Ravan Poladli");
        students.add("Sanani Zeynalli");
        students.add("Seyfulla Mehdiyev");
        students.add("Suleyman Mammadov");
        students.add("Tunjay Rzazada");



        List<Integer> seats = new ArrayList<>();
        for (int i = 1; i <= students.size(); i++) {
            seats.add(i);
        }


        Collections.shuffle(seats);

        for (int i = 0; i < students.size(); i++) {
            System.out.println("Student " + students.get(i) + " is assigned to seat " + seats.get(i) + ".");
        }
    }
}
