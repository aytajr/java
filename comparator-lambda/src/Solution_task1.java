import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

interface PerformOperation {
    boolean check(int a);
}

public class Solution_task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();

        PerformOperation isOdd = (int a) -> a % 2 != 0;
        PerformOperation isPrime = (int a) -> {
            if (a < 2) return false;
            for (int i = 2; i * i <= a; i++) {
                if (a % i == 0) return false;
            }
            return true;
        };
        PerformOperation isPalindrome = (int a) -> {
            String str = Integer.toString(a);
            String reversed = new StringBuilder(str).reverse().toString();
            return str.equals(reversed);
        };

        while (testCases-- > 0) {
            int operation = scanner.nextInt();
            int number = scanner.nextInt();
            String result = "";

            if (operation == 1) {
                result = isOdd.check(number) ? "ODD" : "EVEN";
            } else if (operation == 2) {
                result = isPrime.check(number) ? "PRIME" : "COMPOSITE";
            } else if (operation == 3) {
                result = isPalindrome.check(number) ? "PALINDROME" : "NOT PALINDROME";
            }

            System.out.println(result);
        }

        scanner.close();
    }
}
