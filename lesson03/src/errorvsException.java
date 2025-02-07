// In Java, errors are considered more serious problems as they are beyond the control of the programmer.

class errorExample {
    public static void main(String[] args) {
        recursiveCall();
    }
    public static void recursiveCall() {
        recursiveCall();
    }
}

/* This is an example of StackOverflowError. This code creates an infinite recursion by calling the method
within itself. Another example is OutOfMemoryError, which happens when the storage is used excessively.
VirtualMachineError is another common issue, mostly encountered as a result of system-related problems. */


/* Exceptions are problems that can be handled by the program. Some exceptions are solved by the program itself,
while the others are logic-related. */

class exceptionExample {
    public static void main(String[] args) {
        int result = 15 / 0;
        System.out.println("The result is: " + result + "!");
    }
}

/* Java will throw an ArithmeticException when this code is executed. Another common issue is ArrayIndexOutOfBoundsException
which happens when attempting to access to an invalid index of an array. We can encounter NoSuchMethodException when trying
to use an unexisting method. Or the problem can be related to variable types. An instance can happen when we try to
convert a string into a numeric type, but the input is not a valid number.*/



