public class task2 {
    public static void main(String[] args) {
        int chosenNumber = 150;
        int[] arr = {2, 3, 0, 5, 10};

        try {
            System.out.println(arr[3]);

            for (int num : arr) {
                int result = chosenNumber / num;
                System.out.println("Result: " + result);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException! Index is out of bounds!");
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException! Cannot divide by zero!");
        }
    }
}
