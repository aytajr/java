public class customExceptionExample {

    static class customException extends Exception {
        public customException(String message) {
            super(message);
        }
    }

    public static void checkException(int number) throws customException {
        if (number < 0) {
            throw new customException("Number cannot be negative!");
        } else {
            System.out.println("Number is valid: " + number);
        }
    }

    public static void main(String[] args) {
        try {
            checkException(-7);
        } catch (customException e) {
            System.out.println("Caught custom exception: " + e.getMessage());
        } finally {
            System.out.println("This block always executes!");
        }
    }
}