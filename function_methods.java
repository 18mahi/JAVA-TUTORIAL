import java.util.Scanner;

// This is a Java program that demonstrates the use of functions.
public class function_methods {
    // function is a block of code that performs a specific task
    // and can be reused throughout the program.
    // A function can take inputs, called parameters, and can return a value.
    // Functions help in organizing code, making it more readable and maintainable.

    public static void printhello() {
        System.out.println("hello world!!");
        return; // This return statement is optional here, as the method does not return any
                // value.
    }

    // This is a simple function that prints "hello world!!" to the console.
    // syntax with parameters
    // parameters are the inputs to the function

    public static int add(int a, int b) { // parameters or formal parameters call when defining the function
        return a + b;
        // returns the sum of a and b
    }

    public static int add(int a, int b, int c) { // function overloading
        return a + b + c;
        // returns the sum of a, b and c
    }

    public static int add(int a, double b) { // function overloading
        return a + (int) b;
        // returns the sum of a and b after converting b to int
    }

    public static float add(float a, float b) { // function overloading
        return a + b;
        // returns the sum of a and b
    }

    /*
     * public static double add(int a, int b) { // Error! Only return type is
     * different
     * return a + b;
     * }
     */

    // This function takes two integers as parameters and returns their sum.
    public static int multiply(int a, int b) {
        return a * b;
    }

    // This function takes two integers as parameters and returns their product.
    public static int subtract(int a, int b) {
        return a - b;
    }

    // This function takes two integers as parameters and returns their difference.
    public static int divide(int a, int b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero");
            return 0; // Return 0 or handle the error as needed
        }
        return a / b;
    }

    // This function takes two integers as parameters and returns their quotient.
    public static int modulus(int a, int b) {
        return a % b;
    }

    // This function takes two integers as parameters and returns the remainder of
    // their division.
    public static int power(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }
    // This function takes a base and an exponent as parameters and returns the base
    // raised to the power of the exponent.

    public static void factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        System.out.println("Factorial of " + n + " is: " + result);
    }
    // This function takes an integer n as a parameter and prints the factorial of
    // n.

    public static void binomial_coefficient(int n, int k) {
        int fact_n = factorial(n);
        int fact_k = factorial(k);
        int fact_n_k = factorial(n - k);
        int result = fact_n / (fact_k * fact_n_k);
        System.out.println("Binomial coefficient C(" + n + ", " + k + ") is: " + result);
    }
    // This function calculates the binomial coefficient C(n, k) using the formula
    // C(n, k) = n! / (k! * (n - k)!).

    // This function takes two integers a and b as parameters and swaps their
    // values.
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }

    public static Boolean isprime(int n) {
        if (n == 2) {
            return true; // 2 is a prime number
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primerange(int n) {
        System.out.println("Prime numbers from 1 to " + n + ":");
        for (int i = 2; i <= n; i++) {
            if (isprime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // convert from binary to decimal
    public static int binaryToDecimal(int binary) {
        int pow = 0; // Initialize power to 0
        int decimal = 0;

        while (binary > 0) {
            int lastDigit = binary % 10; // Get the last digit
            decimal += lastDigit * (int) Math.pow(2, pow); // Add the last digit multiplied by the current base
            pow++; // Update the base to the next power of 2
            binary /= 10; // Remove the last digit from binary
        }
        return decimal;
    }

    // convert from decimal to binary
    public static int decimalToBinary(int decimal) {
        int pow = 0;
        int binary = 0;
        while (decimal > 0) {
            int lastDigit = decimal % 2; // Get the last digit in binary
            binary += lastDigit * (int) Math.pow(10, pow); // Add the last digit multiplied by the current base
            pow++; // Update the base to the next power of 10
            decimal /= 2; // Remove the last digit from decimal
        }
        return binary;
    }

    public static Boolean isEven(int n) {
        if (n % 2 == 0) {
            return true; // n is even
        } else {
            return false; // n is odd
        }
    }

    public static Boolean palindrome(int n) {
        int original = n;
        int reversed = 0;

        while (n > 0) {
            int lastDigit = n % 10; // Get the last digit
            reversed = reversed * 10 + lastDigit; // Build the reversed number
            n /= 10; // Remove the last digit from n
        }

        return original == reversed; // Check if the original number is equal to the reversed number
    }

    public static int sum_of_digits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10; // Add the last digit to the sum
            n /= 10; // Remove the last digit from n
        }
        return sum; // Return the total sum of digits
    }

    public static void main(String[] args) {

        // here void is the return type of the function
        // and main is the name of the function.
        // The main function is the entry point of the program.
        // public static is the access modifier and static is a keyword that allows the
        // method to be called without creating an instance of the class which will be
        // studied in detail in oops

        // Scanner is a class in Java that is used to read input from various sources,
        // including user input from the console.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Sum: " + add(a, b));
        System.out.println("Product: " + multiply(a, b));
        System.out.println("Difference: " + subtract(a, b)); // aguments or actual parameters written while calling the
                                                             // function
        System.out.println("Quotient: " + divide(a, b));
        System.out.println("Remainder: " + modulus(a, b));
        System.out.println("Power: " + power(a, b));
        printhello(); // Calling the function to print "hello world!!"
        factorial(5);
        binomial_coefficient(5, 2);
        swap(5, 10); // Calling the swap function to swap the values of a and b

        sc.close(); // Closing the scanner to prevent resource leaks
        // The main function calls other functions to perform operations on the input
        // numbers.

        // scope
        // The scope of a variable is the region of the program where the variable can
        // be accessed.
        // In Java, variables can have different scopes:
        // 1. Local Scope: Variables declared inside a function or method are local to
        // that function and cannot be accessed outside of it.
        // 2. Global Scope: Variables declared outside of any function or method are
        // global and can be accessed from anywhere in the program.
        // 3. Class Scope: Variables declared as class members (fields) can be accessed
        // by all methods within the class.
        // 4. Block Scope: Variables declared inside a block (enclosed by curly braces
        // {}) are only accessible within that block.
        // For example, a variable declared inside the main function is local to that
        // function and cannot be accessed outside of it.
        // In this program, the variables a and b are local to the main function and
        // cannot be accessed outside of it.
        // Functions can also have their own local variables, which are only accessible
        // within that function.
        // For example, the variables a and b in the add function are local to that
        // function and cannot be accessed outside of it.
        // Functions can also have parameters, which are variables that are passed to
        // the function when it is called.
        // Parameters are also local to the function and cannot be accessed outside of
        // it.
        // Functions can also have return types, which specify the type of value that
        // the function will return.
        // In this program, the add function has a return type of int, which means it
        // will return an integer value.

        // user defined and built in functions or methods:
        // In Java, functions are often referred to as methods, especially when they are
        // part of a class.
        // User-defined functions are those that you create to perform specific tasks,
        // eg-factorial, binomial coefficient, etc.,
        // while built-in functions are those provided by Java's standard library, such
        // as System.out.println() for printing to the console.
        // example of built in function is System.out.println() which is used to print
        // output to the console.
        // Functions can be defined with or without parameters, and they can return a
        // value or be void (not returning anything).

        // Functions can also be overloaded, meaning you can have multiple functions
        // with the same name but different parameters and different parameter can be
        // either different types of paramter or different number of parameter of same
        // type
        // for example int sum(int a, int b) and double sum(double a, double b) are two
        // different functions with the same name but different parameter types.
        // above example is function overloading because function overloading is
        // determined by the method signature, which includes the method name and
        // parameter list (number, type, and order of parameters). The return type is
        // NOT considered when deciding if methods are overloaded.
        // This allows for flexibility in how functions are called based on the types
        // and number of arguments passed.
        // For example, you can have a function sum(int a, int b) and another function
        // sum(double a, double b).
        // This allows you to call the same function name with different types of
        // parameters.
        // For example, you can have a function sum(int a, int b) and another function
        // sum(int a, int b, int c).

        // what happens in memory when a function is called:
        // When a function is called, a new stack frame is created in the call stack.
        // This stack frame contains the function's parameters, local variables, and
        // return address.
        // When the function completes, the stack frame is removed, and control returns
        // to the calling function.
        // Functions help in breaking down complex problems into smaller, manageable
        // parts.
        // This makes the code easier to understand, test, and maintain.

        // Functions can also be used to avoid code duplication, as the same function
        // can be called multiple times with different arguments.

        // call by value vs call by reference:
        // In Java, all primitive types (like int, float, etc.) are passed by value,
        // meaning that a copy of the value is passed to the function.
        // call by reference is not supported in Java for primitive types.
        // For example, if you pass an int variable to a function, the function receives
        // a copy of that variable's value.
        // If you modify the parameter inside the function, it does not affect the
        // original variable outside the function.
        // generally c++ supports call by reference but java does not support call by
        // reference
        // For objects, Java uses a reference to the object, but the reference itself is
        // passed by value.
        // This means that if you modify the object inside the function, the changes
        // will be reflected outside the function,
        // but if you reassign the reference to a new object, the original reference
        // outside the function will not change.
        // In summary, functions are essential for structuring code, promoting
        // reusability, and enhancing readability.
        // Functions can also be overloaded, meaning you can have multiple functions
        // with the same name but different parameters.
        // This allows for flexibility in how functions are called based on the types
        // and number of arguments passed.
        // In conclusion, functions are a fundamental concept in programming that help
        // in organizing code,
        // making it more modular, and improving maintainability.
        // Functions can also be recursive, meaning a function can call itself to solve
        // a problem.

    }
}