
// Importing the Scanner class for input
import java.util.Scanner;

public class vnO { // same class name as the file name
    public static void main(String[] args) { // boilerplate code which is written by the user everytime 
        // Example usage of the vnO class
        System.out.println("vnO class is ready to use."); // FOR NEXT LINE USE println
        System.out.print("vnO class is ready to use."); // FOR SAME LINE USE print
        System.out.print("HELLO WORLD\nTHIS IS MY FIRST PROGRAM IN JAVA\n"); // FOR NEXT LINE USE \n

        // PRINT PATTERN
        System.out.println("LOWER left ANGLE TRIANGLE:");
        System.out.println("****\n***\n**\n*\n");

        // sum of two numbers
        int a = 5; // first number
        int b = 10; // second number
        int sum = a + b; // calculating the sum
        System.out.println("The sum of " + a + " and " + b + " is: " + sum); // printing the sum

        // comments
        // This is a single-line comment
        /*
         * This is a multi-line comment
         * It can span multiple lines
         */
        System.out.println("This is a comment explaining the code below"); // This is a comment explaining the code below

        // input in java
        Scanner sc = new Scanner(System.in); // creating a Scanner object for input
        String name = sc.next(); // variable to store the name
        System.out.println("Hello, " + name + "!"); // greeting the user with their name
        String name2 = sc.nextLine(); // variable to store the name with nextLine
        System.out.println("Hello, " + name2 + "!"); // greeting the user with their name using nextLine
        System.out.println("Enter your age: "); // prompt for age input
        int age = sc.nextInt(); // reading the age input
        System.out.println("You are " + age + " years old."); // printing the age

        // there are many types of input in java for example:
        // sc.nextInt() - for integer input
        // sc.nextDouble() - for double input
        // sc.nextFloat() - for float input
        // sc.nextBoolean() - for boolean input
        // sc.nextLine() - for string input (reads the entire line)
        // sc.nextByte() - for byte input
        // sc.nextShort() - for short input
        // sc.nextLong() - for long input
        // sc.nextBigInteger() - for BigInteger input
        // sc.nextBigDecimal() - for BigDecimal input
        // sc.next() is used to read a single word (token) input

        // SUM OF A AND B
        System.out.println("Enter two numbers to sum: "); // prompt for input
        int num1 = sc.nextInt(); // reading the first number
        int num2 = sc.nextInt(); // reading the second number
        int sumOfNumbers = num1 + num2; // calculating the sum
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sumOfNumbers); // printing the sum

        // PRODUCT OF A AND B
        System.out.println("Enter two numbers to multiply: "); // prompt for input
        int num3 = sc.nextInt(); // reading the first number
        int num4 = sc.nextInt(); // reading the second number
        int productOfNumbers = num3 * num4; // calculating the product
        System.out.println("The product of " + num3 + " and " + num4 + " is: " + productOfNumbers); // printing the product

        // DIVISION OF A AND B
        System.out.println("Enter two numbers to divide: "); // prompt for input
        double num5 = sc.nextDouble(); // reading the first number
        double num6 = sc.nextDouble(); // reading the second number
        if (num6 != 0) { // checking for division by zero
            double divisionOfNumbers = num5 / num6; // calculating the division
            System.out.println("The division of " + num5 + " by " + num6 + " is: " + divisionOfNumbers); // printing the division
        } else {
            System.out.println("Division by zero is not allowed."); // handling division by zero
        }
        // SUBTRACTION OF A AND B
        System.out.println("Enter two numbers to subtract: "); // prompt for input
        int num7 = sc.nextInt(); // reading the first number
        int num8 = sc.nextInt(); // reading the second number
        int subtractionOfNumbers = num7 - num8; // calculating the subtraction
        System.out.println("The subtraction of " + num7 + " and " + num8 + " is: " + subtractionOfNumbers); // printing the subtraction

        // AREA OF A RECTANGLE
        System.out.println("Enter the length and width of the rectangle: "); // prompt for length and width input
        double length = sc.nextDouble(); // reading the length input
        double width = sc.nextDouble(); // reading the width input
        double areaOfRectangle = length * width; // calculating the area of the rectangle
        System.out.println( "The area of the rectangle with length " + length + " and width " + width + " is: " + areaOfRectangle); // printing the area

        // AREA OF A TRIANGLE
        System.out.println("Enter the base and height of the triangle: "); // prompt for base and height input
        double base = sc.nextDouble(); // reading the base input
        double height = sc.nextDouble(); // reading the height input
        double areaOfTriangle = 0.5 * base * height; // calculating the area of the triangle
        System.out.println("The area of the triangle with base " + base + " and height " + height + " is: " + areaOfTriangle); // printing the area

        // AREA OF A CIRCLE
        System.out.println("Enter the radius of the circle: "); // prompt for radius input
        double radius = sc.nextDouble(); // reading the radius input
        double areaOfCircle = Math.PI * radius * radius; // calculating the area of the circle
        System.out.println("The area of the circle with radius " + radius + " is: " + areaOfCircle); // printing the  area

        // TYPE CONVERSION
        System.out.println("Type Conversion Example:"); // prompt for type conversion example
        // CONVERSION HAPPPENS WHEN :
        // DESTINATION TYPE>SOURCE TYPE
        // TYPE COMPATIBLE
        // byte>short>int>long>float>double also knowns as widening conversion as well
        // as implicit conversion
        int number = sc.nextInt(); // reading an integer input
        double convertedNumber = number; // implicit conversion from int to double
        System.out.println("The converted number is: " + convertedNumber); // printing the converted number

        // TYPE CASTING
        int marks = (int) (99.99f); // explicit type casting from float to int we know that float is greater than int so we have to do explicit type casting as well this is known as narrowing conversion as well data can be lost in this process
        System.out.println("The marks after type casting are: " + marks); // printing the marks after type casting

        char ch = 'A'; // declaring a character variable
        int number2 = ch;
        System.out.println("The ASCII value of character " + ch + " is: " + number2); // printing the ASCII value of the character

        // type promotion in expressions
        // java promotes smaller data types to larger data types in expressions
        // for example if we have an expression with byte, short, char and int then the
        // byte will be promoted to int
        // if we have an expression with int, long, float and double then the int will
        // be promoted to double

        char a2 = 'a';
        char b2 = 'b';
        System.out.println((int) (b2));
        System.out.println((int) (a2));
        System.out.println(a2); // byte b=5; b=b*2; // this will give an error because byte is smaller than int and we cannot assign a larger data type to a smaller data type without explicit type casting
        System.out.println(b2 - a2);

        // JDK (Java Development Kit) is a software development kit used to develop Java applications. It includes the Java Runtime Environment (JRE), an interpreter/loader (Java), a compiler (javac), an archiver (jar), a documentation generator (javadoc), and other tools needed for Java development.
        // JRE (Java Runtime Environment) is a part of the JDK that provides the libraries, Java Virtual Machine (JVM), and other components to run applications written in Java.
        // JVM (Java Virtual Machine) is an abstract machine that enables a computer to run Java programs. It provides a runtime environment in which Java bytecode can be executed.
        // JDK is used for developing Java applications, JRE is used for running Java applications, and JVM is the engine that executes Java bytecode.
        // sourcecode.java--> compiler--> bytecode (.class file) --> JVM (Java Virtual Machine) --> machine code (native code) --> execution on the host machine
        // portable means that Java programs can run on any platform that has a compatible JVM, without needing to be recompiled for each platform. This is achieved through the use of bytecode, which is platform-independent and can be executed by any JVM.
        // Java is platform-independent because it uses the Java Virtual Machine (JVM) to run Java bytecode, which can be executed on any platform that has a compatible JVM. This allows Java programs to be written once and run anywhere, without needing to be recompiled for each platform.
        // Java is a high-level, object-oriented programming language that is designed to be platform-independent, secure, and easy to use. It is widely used for developing web applications, mobile applications, and enterprise software.
        // compilation is source to byte code and execution is bytecode to machine code




        //operator in java



        //operand is a variable or value on which an operator performs an operation        // operators are special symbols that perform operations on variables and values
        // there are many types of operators in java for example:
        // arithmetic operators: +, -, *, /, % binary operators are used to perform operations on two operands
        // relational operators: ==, !=, >, <, >=, <=
        // logical operators: &&(and wala table), ||(or wala table), !(not wala table)
        // bitwise operators: &, |, ^, ~, <<, >>
        // assignment operators: =, +=, -=, *=, /=, %=
        // unary operators: +, -, ++, --
        //pre increment and post increment operators: ++a, a++, --a, a--
        // ternary operator: ? :
        // instance of operator: instanceof
        // bitwise operators are used to perform operations on bits and are used in low-level programming
        // logical operators are used to perform logical operations and are used in conditional statements
        // relational operators are used to compare two values and return a boolean value
        // arithmetic operators are used to perform mathematical operations on variables and values

        // closing the scanner to prevent resource leaks
        sc.close(); // closing the scanner object

        //binary operators
        int A=10;
        int B=5;
        System.out.println("A + B = " + (A + B)); // printing the sum of A and B
        System.out.println("A - B = " + (A - B)); // printing the difference of A and B
        System.out.println("A * B = " + (A * B)); // printing the product of A and B
        System.out.println("A / B = " + (A / B)); // printing the division of A and B
        System.out.println("A % B = " + (A % B)); // printing the modulus of A and B

        //unary operators
        // pre increment--> value change and then use  and in post increment--> use and then value change
        int x = 5; // declaring a variable x
        System.out.println("Pre-increment: " + (++x)); // pre-increment: increments x by 1 and then prints it
        System.out.println("Post-increment: " + (x++)); // post-increment: prints x and then increments it
        System.out.println("Value of x after post-increment: " + x); // prints the value of x after post-increment
        // pre decrement--> value change and then use  and in post decrement--> use and then value change
        int y = 10; // declaring a variable y
        System.out.println("Pre-decrement: " + (--y)); // pre-decrement: decrements y by 1 and then prints it
        System.out.println("Post-decrement: " + (y--)); // post-decrement: prints y and then decrements it
        System.out.println("Value of y after post-decrement: " + y); // prints the value of y after post-decrement
        // TERNARY OPERATOR
        int a1 = 10; // declaring a variable a1
        int b1 = 20; // declaring a variable b1
        int max = (a1 > b1) ? a1 : b1; // using the ternary operator to find the maximum of a1 and b1
        System.out.println("The maximum of " + a1 + " and " + b1 + " is: " + max); // printing the maximum value

        //logical operators
        System.out.println((3>2) && (5<0)); // prints false because 5 is not less than 0
        System.out.println((3>2) || (5<0)); // prints true because 3 is greater than 2
        System.out.println(!(3>2)); // prints false because 3 is greater than 2 and the not operator negates the result

        // assignment operators assign a value from the right side to the left side
        int c = 10; // declaring a variable c
        c += 5; // equivalent to c = c + 5; adds 5 to c
        System.out.println("The value of c after += operation is: " + c); // prints the value of c after += operation
        c -= 3; // equivalent to c = c - 3; subtracts 3 from c
        System.out.println("The value of c after -= operation is: " + c); // prints the value of c after -= operation
        c *= 2; // equivalent to c = c * 2; multiplies c by 2
        System.out.println("The value of c after *= operation is: " + c); // prints the value of c after *= operation
        c /= 4; // equivalent to c = c / 4; divides c by 4
        System.out.println("The value of c after /= operation is: " + c); // prints the value of c after /= operation
        c %= 3; // equivalent to c = c % 3; calculates the remainder of c divided by 3
        System.out.println("The value of c after %= operation is: " + c); // prints the value of c after %= operation

        //relational operators
        int d = 15; // declaring a variable d
        int e = 20; // declaring a variable e
        System.out.println("Is d equal to e? " + (d == e)); // prints false because d is not equal to e
        System.out.println("Is d not equal to e? " + (d != e)); // prints true because d is not equal to e
        System.out.println("Is d greater than e? " + (d > e)); // prints false because d is not greater than e
        System.out.println("Is d less than e? " + (d < e)); // prints true because d is less than e
        System.out.println("Is d greater than or equal to e? " + (d >= e)); // prints false because d is not greater than or equal to e
        System.out.println("Is d less than or equal to e? " + (d <= e)); // prints true because d is less than or equal to e
    }
    
}
