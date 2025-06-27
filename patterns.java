public class patterns {

    public static void hollow_rectangle(int row, int col) {
        for (int i = 1; i <= row; i++) { // outside loop for rows
            for (int j = 1; j <= col; j++) { // inside loop for columns
                if (i == 1 || i == row || j == 1 || j == col) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void inverted_rotated_half_pyramid(int n) {
        for (int i = 1; i <= n; i++) { // outside loop for rows
            for (int j = 1; j <= n - i; j++) { // inside loop for columns
                System.out.print("");
            }
            for (int j = 1; j <= i; j++) { // inside loop for columns
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void inverted_half_pyramid_numbers(int n) {
        for (int i = 1; i <= n; i++) { // outside loop for rows
            for (int j = 1; j <= n - i + 1; j++) { // inside loop for columns
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void floyd_triangle(int n) {
        int num = 1; // Initialize the number to be printed
        for (int i = 1; i <= n; i++) { // outside loop for rows
            for (int j = 1; j <= i; j++) { // inside loop for columns
                System.out.print(num + " ");
                num++; // Increment the number after printing
            }
            System.out.println();
        }
    }

    public static void number_pyramid(int n) {
        for (int i = 1; i <= n; i++) { // outside loop for rows
            for (int j = 1; j <= n - i; j++) { // inside loop for spaces
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) { // inside loop for columns
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void palindromic_with_number(int n) {
        for (int i = 1; i <= n; i++) { // outside loop for rows
            for (int j = 1; j <= n - i; j++) { // inside loop for spaces
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) { // inside loop for decreasing numbers
                System.out.print(j);
            }
            for (int j = 2; j <= i; j++) { // inside loop for increasing numbers
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void hollow_pyramid(int n) {
        for (int i = 1; i <= n; i++) { // outside loop for rows
            for (int j = 1; j <= n - i; j++) { // inside loop for spaces
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) { // inside loop for columns
                if (j == 1 || j == 2 * i - 1 || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void solid_square(int n) {
        for (int i = 1; i <= n; i++) { // outside loop for rows
            for (int j = 1; j <= n; j++) { // inside loop for columns
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void hollow_square(int n) {
        for (int i = 1; i <= n; i++) { // outside loop for rows
            for (int j = 1; j <= n; j++) { // inside loop for columns
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void solid_triangle(int n) {
        for (int i = 1; i <= n; i++) { // outside loop for rows
            for (int j = 1; j <= i; j++) { // inside loop for columns
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void hollow_triangle(int n) {
        for (int i = 1; i <= n; i++) { // outside loop for rows
            for (int j = 1; j <= i; j++) { // inside loop for columns
                if (j == 1 || j == i || i == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void triangle_0_1(int n) {
        for (int i = 1; i <= n; i++) { // outside loop for rows
            for (int j = 1; j <= i; j++) { // inside loop for columns
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    public static void solid_rhombus(int n) {
        for (int i = 1; i <= n; i++) { // outside loop for rows
            for (int j = 1; j <= n - i; j++) { // inside loop for spaces
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) { // inside loop for columns
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void hollow_rhombus(int n) {
        for (int i = 1; i <= n; i++) { // outside loop for rows
            for (int j = 1; j <= n - i; j++) { // inside loop for spaces
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) { // inside loop for columns
                if (j == 1 || j == n || i == 1 || i == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void diamond_pattern(int n) {
        // Upper part of the diamond
        for (int i = 1; i <= n; i++) { // outside loop for rows
            for (int j = 1; j <= n - i; j++) { // inside loop for spaces
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) { // inside loop for columns
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower part of the diamond
        for (int i = n - 1; i >= 1; i--) { // outside loop for rows
            for (int j = 1; j <= n - i; j++) { // inside loop for spaces
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) { // inside loop for columns
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void butterfly_pattern(int n) {
        // Upper part of the butterfly
        for (int i = 1; i <= n; i++) { // outside loop for rows
            for (int j = 1; j <= i; j++) { // inside loop for columns
                System.out.print("* ");
            }
            for (int j = 1; j <= 2 * (n - i); j++) { // inside loop for spaces
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) { // inside loop for columns
                System.out.print("* ");
            }
            System.out.println();
        }

        // Lower part of the butterfly
        for (int i = n; i >= 1; i--) { // outside loop for rows
            for (int j = 1; j <= i; j++) { // inside loop for columns
                System.out.print("* ");
            }
            for (int j = 1; j <= 2 * (n - i); j++) { // inside loop for spaces
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) { // inside loop for columns
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        System.out.println("Patterns in Java:");

        // example of inverse star pattern
        System.out.println("Inverse Star Pattern:");
        for (int line = 4; line >= 1; line--) {
            for (int star = 1; star <= line; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // print half pyramid pattern
        System.out.println("Half Pyramid Pattern:");
        for (int line = 1; line <= 4; line++) {
            for (int num = 1; num <= line; num++) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        // print character pattern
        System.out.println("Character Pattern:");
        char ch = 'A';
        for (int line = 1; line <= 4; line++) {
            for (int num = 1; num <= line; num++) {
                System.out.print(ch + " ");
            }
            ch++;
            System.out.println();
        }

        // number pyramid
        System.out.println("Number Pyramid:");
        number_pyramid(5);
        System.out.println("palindromic with number:");
        palindromic_with_number(5);
        System.out.println("Hollow Pyramid:");
        hollow_pyramid(5);
        System.out.println("Hollow Rectangle:");
        hollow_rectangle(5, 10);
        System.out.println("Inverted Rotated Half Pyramid:");
        inverted_rotated_half_pyramid(5);
        System.out.println("Inverted Half Pyramid with Numbers:");
        inverted_half_pyramid_numbers(5);
        System.out.println("Floyd's Triangle:");
        floyd_triangle(5);
        System.out.println("Hollow Triangle:");
        hollow_triangle(5);
        System.out.println("Solid Square:");
        solid_square(5);
        System.out.println("Hollow Square:");
        hollow_square(5);
        System.out.println("Solid Triangle:");
        solid_triangle(5);
        System.out.println("triangle 0-1:");
        triangle_0_1(5);
        System.out.println("Solid Rhombus:");
        solid_rhombus(5);
        System.out.println("Hollow Rhombus:");
        hollow_rhombus(5);
        System.out.println("Diamond Pattern:");
        diamond_pattern(5);
        System.out.println("Butterfly Pattern:");
        butterfly_pattern(5);
    }
}
