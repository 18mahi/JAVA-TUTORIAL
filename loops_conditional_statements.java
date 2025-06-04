import java.util.Scanner;

public class loops_conditional_statements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = 20;
        if (age > 13 && age < 18) {
            System.out.println("You are a teenager.");
        } else if (age >= 18 && age < 60) {
            System.out.println("You are an adult.");
        } else if (age >= 60) {
            System.out.println("You are a senior citizen.");
        } else {
            System.out.println("You are a child.");
        }

        // print the largest of two numbers
        int A = 10;
        int B = 20;
        if (A > B) {
            System.out.println("A is larger than B");
        } else if (B > A) {
            System.out.println("B is larger than A");
        } else {
            System.out.println("A and B are equal");
        }

        // print if a number is even or odd
        int number = sc.nextInt();
        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }

        // income tax calculator
        double income = sc.nextDouble();
        double tax = 0;
        if (income < 500000) {
            tax = 0;
        } else if (income >= 500000 && income <= 1000000) {
            tax = income * 0.2; // 20% tax for income between 500000 and 1000000
            income = income + tax; // adding tax to income
        } else if (income > 1000000) {
            tax = income * 0.3;
            income = income + tax; // 12500 is the tax for the first slab
            System.out.println("Your income after tax is: " + (int) income);
            // print the largest of three numbers
            int x = 10;
            int y = 20;
            int z = 30;
            if (x >= y && x >= z) {
                System.out.println("x is the largest number: " + x);
            } else if (y >= x && y >= z) {
                System.out.println("y is the largest number: " + y);
            } else {
                System.out.println("z is the largest number: " + z);
            }
        }
        // print the largest of three numbers
        int x = 10, y = 20, z = 30;
        if (x >= y && x >= z) {
            System.out.println("x is the largest number: " + x);
        } else if (y >= x && y >= z) {
            System.out.println("y is the largest number: " + y);
        } else {
            System.out.println("z is the largest number: " + z);
        }

        // switch case example
        int number2 = 2;
        switch (number2) {
            case 1:
                System.out.println("samosa");
                break;
            case 2:
                System.out.println("burger");
                break;
            case 3:
                System.out.println("pizza");
                break;
            default:
                System.out.println("Invalid choice");
        }

        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("enter operator (+, -, *, /): ");
        // Simple calculator using switch case
        sc.nextLine(); // Consume the newline character
        System.out.println("Enter an operator (+, -, *, /): ");
        sc.nextLine(); // Consume the newline character
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println("Sum: " + (a + b));
                break;
            case '-':
                System.out.println("Difference: " + (a - b));
                break;
            case '*':
                System.out.println("Product: " + (a * b));
                break;
            case '/':
                if (b != 0) {
                    System.out.println("Quotient: " + (a / b));
                } else {
                    System.out.println("Cannot divide by zero.");
                }
                break;
            default:
                System.out.println("Invalid operator.");
        }

        // print whether a number is positive, negative, or zero
        int num = sc.nextInt();
        if (num > 0) {
            System.out.println("The number is positive.");
        } else if (num < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        // prints you have a fever if your temperature is above 100
        double temperature = sc.nextDouble();
        if (temperature > 100) {
            System.out.println("You have a fever.");
        } else {
            System.out.println("You do not have a fever.");
        }

        // print day of week name using switch case
        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("IT IS MONDAY!!");
                break;
            case 2:
                System.out.println("IT IS TUESDAY!!");
                break;
            case 3:
                System.out.println("IT IS WEDNESDAY!!");
                break;
            case 4:
                System.out.println("IT IS THURSDAY!!");
                break;
            case 5:
                System.out.println("IT IS FRIDAY!!");
                break;
            case 6:
                System.out.println("IT IS SATURDAY!!");
                break;
            case 7:
                System.out.println("IT IS SUNDAY!!");
                break;
            default:
                System.out.println("Invalid day number. Please enter a number between 1 and 7.");
                break;
        }

        // print whether year is a leap year or not
        int year = sc.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        // loops
        // print number from 1 to 10
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        int n = sc.nextInt();
        while (i <= n) {
            System.out.println(i);
            i++;
        }
        int sum = 0;
        while (i <= n) {
            sum = sum + i;
            i++;
        }
        System.out.println("The sum of numbers from 1 to " + n + " is: " + sum);

        // print square pattern
        int row = 1;
        while (row <= 4) {
            System.out.println("****");
            row++;
        }

        // print reverse of a number
        int numb = 10899;
        while (numb != 0) {
            int digit = numb % 10; // get the last digit
            System.out.print(digit); // build the reversed number
            numb /= 10; // remove the last digit
        }
        System.out.println();

        // reverse the given number
        int reverse = 0;
        while (numb > 0) {
            int lastdigit = numb % 10;
            reverse = reverse * 10 + lastdigit;
            numb = numb / 10;
        }
        System.out.println(reverse);

        // do while loop
        int j = 1;
        do {
            System.out.println(j);
            j++;
        } while (j <= 10);

        // break and continue statements
        for (int k = 1; k <= 10; k++) {
            if (k == 5) {
                System.out.println("Skipping number 5");
                continue; // skip the rest of the loop when k is 5
            }
            if (k == 8) {
                System.out.println("Breaking at number 8");
                break; // exit the loop when k is 8
            }
            System.out.println(k);
        }

        // check whether number is prime or not
        int numToCheck = sc.nextInt();
        boolean isprime = true;
        if (numToCheck <= 1) {
            isprime = false; // numbers less than or equal to 1 are not prime
        } else {
            for (int m = 2; m <= Math.sqrt(numToCheck); m++) {
                if (numToCheck % m == 0) {
                    isprime = false; // found a divisor, not prime
                    break;
                }
            }
        }
        if (isprime) {
            System.out.println(numToCheck + " is a prime number.");
        } else {
            System.out.println(numToCheck + " is not a prime number.");
        }

        // print read a set of integers and then print the sume of even and odd integers
        int evenSum = 0, oddSum = 0;
        String user_input = sc.next("enter yes or stop:\t");
        do {
            System.out.println("Enter an integer : ");
            int input = sc.nextInt();
            if (input == 0) {
                break; // exit the loop if input is 0
            }
            if (input % 2 == 0) {
                evenSum += input; // add to even sum
            } else {
                oddSum += input; // add to odd sum
            }
        } while (user_input != "stop");
        System.out.println("Sum of even integers: " + evenSum);
        System.out.println("Sum of odd integers: " + oddSum);

        // factorial of any number entered by user
        System.out.println("Enter a number to calculate its factorial: ");
        int num3 = sc.nextInt();
        long factorial = 1;
        for (int f = 1; f <= num3; f++) {
            factorial *= f; // multiply to get factorial
        }
        System.out.println("Factorial of " + num3 + " is: " + factorial);

        // print fibonacci series
        System.out.println("Enter the number of terms in Fibonacci series: ");
        int terms = sc.nextInt();
        int a2 = 0, b2 = 1;
        System.out.print("Fibonacci Series: " + a2 + ", " + b2);
        for (int f = 2; f < terms; f++) {
            int next = a2 + b2;
            System.out.print(", " + next);
            a2 = b2;
            b2 = next;
        }
        System.out.println();

        // print multiplication table of any number entered by user
        System.out.println("Enter a number to print its multiplication table: ");
        int tableNum = sc.nextInt();
        System.out.println("Multiplication Table of " + tableNum + ":");
        for (int t = 1; t <= 10; t++) {
            System.out.println(tableNum + " x " + t + " = " + (tableNum * t));
        }

    }

}
