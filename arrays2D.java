import java.util.*;
public class arrays2D {

    public static void search_sorted_matrix(int matrix[][], int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            System.out.println("Matrix is empty or null");
            return;
        }
        int rows = matrix.length;
        int cols = matrix[0].length;
        int i = 0, j = cols - 1; // Start from the top-right corner

        while (i < rows && j >= 0) {
            if (matrix[i][j] == target) {
                System.out.println("Found at cell(" + i + "," + j + ")");
            } else if (matrix[i][j] > target) {
                j--; // Move left
            } else {
                i++; // Move down
            }
        }
        System.out.println("Not found");
    }

    public static void DiagonalSum(int matrix[][]){
        // This function calculates the sum of the main diagonal and secondary diagonal of a 2D array
        // It assumes that the matrix is square (same number of rows and columns)
        int n = matrix.length;
        int mainDiagonalSum = 0;
        int secondaryDiagonalSum = 0;

        for (int i = 0; i < n; i++) {
            mainDiagonalSum += matrix[i][i]; // Main diagonal
            if(i!= n - 1 - i) {
                // Avoid double counting the middle element in odd-sized matrices
                secondaryDiagonalSum += matrix[i][n - 1 - i]; // Secondary diagonal
            }
        }

        System.out.println("Main Diagonal Sum: " + mainDiagonalSum);
        System.out.println("Secondary Diagonal Sum: " + secondaryDiagonalSum);
    }

    public static void printSpiral(int matrix[][]){
        int startrow=0;
        int startcol=0;
        int endrow=matrix.length-1;
        int endcol=matrix[0].length-1;
        while(startrow<=endrow && startcol<=endcol){
            //print top row
            for(int i=startcol;i<=endcol;i++){
                System.out.print(matrix[startrow][i]+" ");
            }
            startrow++;
            //print right column
            for(int i=startrow;i<=endrow;i++){
                System.out.print(matrix[i][endcol]+" ");
            }
            endcol--;
            //print bottom row
            if(startrow<=endrow){
                for(int i=endcol;i>=startcol;i--){
                    System.out.print(matrix[endrow][i]+" ");
                }
                endrow--;
            }
            //print left column
            if(startcol<=endcol){
                for(int i=endrow;i>=startrow;i--){
                    System.out.print(matrix[i][startcol]+" ");
                }
                startcol++;
            }
        }
        System.out.println();
    }

    public static boolean search(int matrix[][], int target) {
        // This function searches for a target value in a 2D array
        // It returns true if the target is found, otherwise false
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == target) {
                    System.out.println("found at cell("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("not found");
        return false;
    }
    public static void main(String[] args){
        //1D array are simple, but 2D arrays are like a table or matrix.        //2D arrays are arrays of arrays.
        //They can be visualized as a grid
        //or a table with rows and columns.        //2D arrays are declared with two sets of square brackets.
        

        //real world example: 3x4 matrix 
        //total cells = 3*4 = 12
        //Each cell can hold a value, and you can access them using two indices: one for the row and one for the column.
        //For example, to access the element in the first row and second column, you would use matrix[0][1].
        //Here is how you can declare a 2D array in Java:
        //Syntax: dataType arrayName[][] = new dataType[rows][columns];
        //Example:
        int matrix[][]=new int[3][4];
        //This creates a 2D array with 3 rows and 4 columns.
        int n=matrix.length,m=matrix[0].length;
        //You can also initialize a 2D array with values at the time of declaration 
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        //output the 2D array
        System.out.println("The 2D array is:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        search(matrix,5); // Example search for the number 5 in the matrix
        
        //2d arrays in memory
        //2D arrays are stored in a contiguous block of memory, just like 1D
        //However, they are accessed using two indices: one for the row and one for the column.
        //This means that the memory layout is still linear, but the indices help us navigate
        //through the rows and columns of the array.
        //In Java, 2D arrays are actually arrays of arrays, so each row can
        //have a different length, making them more flexible than traditional matrices.
        //This flexibility allows for jagged arrays, where each row can have a different number of
        //columns, but it also means that the memory layout is not as straightforward as in a
        //fixed-size matrix.
        //In summary, 2D arrays are like a table or matrix, where you can
        //store and access data in a structured way using two indices.
        //They are declared with two sets of square brackets and can be initialized with values.


        //SPIRAL MATRIX 
        //Spiral matrix is a way of traversing a 2D array in a spiral order.
        //It starts from the top left corner and goes right, then down, then left,
        //then up, and continues in this pattern until all elements are visited.
        //Here is a simple implementation of spiral matrix traversal in Java:
        int[][] spiralMatrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        System.out.println("Spiral Matrix Traversal:");
        printSpiral(spiralMatrix);

        //diagonal sum 
        //Diagonal sum is the sum of the elements in the main diagonal and the secondary diagonal of a 2D array.
        //The main diagonal is the diagonal that goes from the top left corner to the bottom right
        //corner, and the secondary diagonal is the diagonal that goes from the top right corner to
        //the bottom left corner.
        //Here is a simple implementation of diagonal sum in Java:
        int[][] diagonalMatrix = {
            {1, 2, 3,4},
            {5, 6, 7,8},
            {9, 10, 11,12},
            {13, 14, 15,16}
        };
        System.out.println("Diagonal Sum:");
        DiagonalSum(diagonalMatrix);
        //The output will show the sum of the main diagonal and the secondary diagonal.

        //search sorted matrix
        //A sorted matrix is a 2D array where each row and each column is sorted
        //in ascending order. To search for a target value in a sorted matrix,
        //we can use a more efficient approach than a simple linear search.
        //We can start from the top right corner and move left or down based on the comparison
        //with the target value. If the target is smaller than the current element,
        //we move left; if it is larger, we move down. This way, we
        //can find the target in O(m+n) time complexity, where m is the number
        //of rows and n is the number of columns.
        int[][] sortedMatrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        int target = 7;
        System.out.println("Searching for " + target + " in the sorted matrix:");
        search_sorted_matrix(sortedMatrix, target); 

        //print the number of 7's are in 2d arrat 
        int matrix2[][]={
            {4,7,8},
            {8,8,7}
        };
        int count =0;
        for(int i=0;i<matrix2.length;i++){
            for(int j=0;j<matrix2[0].length;j++){
                if(matrix2[i][j]==7){
                    count++;
                }
            }
        }
        System.out.println("The number of 7's in the matrix is: " + count);

        //print out the sum of the elements row of a 2D array
        int num[][]={
            {1,4,9},
            {11,4,3},
            {2,2,3}
        };
        int sum=0;
        for(int i=0;i<num.length;i++){
            for(int j=0;j<num[0].length;j++){
                if(i==1){
                    sum+=num[i][j];
                }
            }
        }
        System.out.println("The sum of the elements in the second row is: " + sum);

        //transpose of a 2d array 
        //The transpose of a 2D array is obtained by swapping its rows and columns.
        //For example, if we have a 2D array like this:
        int[][] Matrix3 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("Transpose of the matrix:");
        int[][] transpose = new int[Matrix3.length][Matrix3[0].length];
        for (int i = 0; i < Matrix3.length; i++) {
            for (int j = 0; j < Matrix3[0].length; j++) {
                transpose[j][i] = Matrix3[i][j];
            }
        }
        //The transpose will be:
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[0].length; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
