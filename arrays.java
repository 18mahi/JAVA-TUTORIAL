import java.util.Scanner;

public class arrays {

    public static void printallsubarray(int arr[]) { // time complexity O(n^2) space complexity O(1)
        // total number of subarrays in an array of size n is n*(n+1)/2
        int ts = 0;
        int n = arr.length; // Get the length of the array
        for (int i = 0; i < n; i++) { // Outer loop for starting index
            for (int j = i; j < n; j++) { // Inner loop for ending index
                for (int k = i; k <= j; k++) { // Loop to print elements from i to j
                    System.out.print(arr[k] + " "); // Print subarray elements
                }
                ts++;
                System.out.println(); // New line after printing each subarray
            }
            System.out.println(); // New line after printing each subarray
        }
        System.out.println("Total subarrays: " + ts); // Print total number of subarrays
    }

    public static void buysellstocks(int arr[]) { // time complexity O(n) space complexity O(1)
        // total number of transactions in an array of size n is n*(n-1)/2
        int maxProfit = 0; // Initialize maximum profit to 0
        int buyPrice = Integer.MAX_VALUE; // Initialize minimum price to the largest integer value

        for (int i = 0; i < arr.length; i++) { // Loop through each element in the array
            if (arr[i] < buyPrice) {
                buyPrice = arr[i]; // Update minimum price if current price is lower
            } else if (arr[i] - buyPrice > maxProfit) {
                maxProfit = arr[i] - buyPrice; // Update maximum profit if current profit is greater
            }
        }
        System.out.println("Maximum profit: " + maxProfit); // Print maximum profit
    }

    public static void trapping_rainwater(int arr[]) { // time complexity O(n) space complexity O(n)
        // total number of subarrays in an array of size n is n*(n+1)/2
        int n = arr.length; // Get the length of the array
        int leftMax[] = new int[n]; // Array to store maximum height to the left of each element
        int rightMax[] = new int[n]; // Array to store maximum height to the right of each element
        int waterTrapped = 0; // Initialize water trapped to 0

        // Fill leftMax array
        leftMax[0] = arr[0]; // First element is its own max
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], arr[i]); // Maximum height to the left
        }

        // Fill rightMax array
        rightMax[n - 1] = arr[n - 1]; // Last element is its own max
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], arr[i]); // Maximum height to the right
        }

        // Calculate water trapped at each index
        for (int i = 0; i < n; i++) {
            waterTrapped += Math.min(leftMax[i], rightMax[i]) - arr[i]; // Water trapped at index i
        }

        System.out.println("Total water trapped: " + waterTrapped); // Print total water trapped
    }

    public static void kadanesAlgorithm(int arr[]) { // time complexity O(n) space complexity O(1)

        // if all elements are negative, then the maximum subarray sum is the largest
        // element
        // if all elements are positive, then the maximum subarray sum is the sum of all
        // elements
        // if there are both positive and negative elements, then the maximum subarray
        // sum is the sum of the largest contiguous subarray
        // Kadane's algorithm is used to find the maximum subarray sum in linear time.
        int maxSum = Integer.MIN_VALUE; // Initialize maxSum to the smallest integer value
        int currentSum = 0; // Initialize currentSum to 0

        for (int i = 0; i < arr.length; i++) { // Loop through each element in the array
            currentSum += arr[i]; // Add current element to currentSum
            if (currentSum > maxSum) {
                maxSum = currentSum; // Update maxSum if currentSum is greater
            }
            if (currentSum < 0) {
                currentSum = 0; // Reset currentSum if it becomes negative
            }
        }
        System.out.println("Maximum subarray sum: " + maxSum); // Print maximum subarray sum
    }

    public static void maxsubarraysum(int arr[]) { // time complexity O(n^3) space complexity O(1)-brute force approach
        // total number of subarrays in an array of size n is n*(n+1)/2
        int maxSum = Integer.MIN_VALUE; // Initialize maxSum to the smallest integer value
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0]; // Initialize the first element of prefix sum array
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i]; // Calculate prefix sum
        }
        // The prefix sum array is used to calculate the sum of subarrays efficiently.
        // The prefix sum at index i gives the sum of elements from the start of the
        // array to index i.
        int n = arr.length; // Get the length of the array
        for (int i = 0; i < n; i++) { // Outer loop for starting index
            for (int j = i; j < n; j++) { // Inner loop for ending index
                int currentSum = 0; // Initialize currentSum for each subarray
                /*
                 * currentSum=start=0? prefix[j] : prefix[j] - prefix[i - 1]; // Calculate sum
                 * using prefix sum array
                 */
                // here time complexity is o(n^2) and space complexity is o(n)

                for (int k = i; k <= j; k++) { // Loop to calculate sum from i to j
                    currentSum += arr[k]; // Add current element to currentSum
                }
                maxSum = Math.max(maxSum, currentSum); // Update maxSum if currentSum is greater
            }
        }
        System.out.println("Maximum subarray sum: " + maxSum); // Print maximum subarray sum
    }

    public static void pairarray(int arr[]) { // time complexity O(n^2) space complexity O(1)
        // total number of pairs in an array of size n is n*(n-1)/2
        int n = arr.length; // Get the length of the array
        for (int i = 0; i < n; i++) { // Outer loop for first element
            for (int j = i + 1; j < n; j++) { // Inner loop for second element
                System.out.print("(" + arr[i] + ", " + arr[j] + ") "); // Print pairs
            }
            System.out.println(); // New line after printing all pairs
        }
    }
    // This method prints all pairs of elements in the array.

    public static void reverseArray(int arr[]) { // time complexity O(n) space complexity O(1)
        int left = 0; // Start index
        int right = arr.length - 1; // End index

        while (left < right) {
            // Swap elements at left and right indices
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++; // Move towards the center from the left
            right--; // Move towards the center from the right
        }
    }

    public static int binarysearch(int arr[], int target) { // time complexity O(log n)
        int left = 0; // Start index
        int right = arr.length - 1; // End index

        while (left <= right) {
            int mid = left + (right - left) / 2; // Calculate mid index

            if (arr[mid] == target) {
                return mid; // Target found, return index
            } else if (arr[mid] < target) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }
        return -1; // Target not found, return -1
    }

    public static int largestNumber(int arr[]) {
        // assume largest is - infinity
        int largest = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i]; // Update largest if current element is greater
            }
        }
        return largest; // Return the largest number found
    }

    public static int smallestNumber(int arr[]) {
        // assume smallest is +infinity
        int smallest = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i]; // Update smallest if current element is greater
            }
        }
        return smallest; // Return the smallest number found
    }

    public static void updateArray(int arr[], int nonchangeable) {
        nonchangeable = 10; // This won't change the original variable in main
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 1; // Increment each element by 1
        }
    }

    public static int linearSearch(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return the index if found
            }
        }
        return -1; // Return -1 if not found
    }

    public static void main(String[] args) {
        // array is list of elements of same type and placed in contiguous memory
        // locations
        // char size in java takes up 2 bytes in memory

        // operations on array

        // 1. declaration
        char[] arr = new char[5]; // declaration and initialization of array with size 5; here null values are
                                  // assigned to the array elements
        // new keyword is used to create a new array object
        // it allocates memory for the array in the heap
        // The size of the array is fixed at the time of creation and cannot be changed
        // later.
        // The array can hold 5 characters, and each character will take up 2 bytes of
        // memory in Java.
        // This means the total memory allocated for this array will be 5 * 2 = 10
        // bytes.
        // Note: In Java, arrays are objects, and they are created in the heap memory.

        // creation
        // datatype arrayname[]=new datatype[size];
        // Example: int[] arr = new int[10]; // creates an array of integers with size
        // 10

        String fruits[] = { "apple", "banana", "cherry" }; // declaration and initialization of an array with string
                                                           // values

        // input,output and update
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[100];

        System.out.println("length of array= " + marks.length); // length of array
        System.out.println("Enter marks for Physics, Chemistry, and Maths: ");
        // Taking input for marks
        marks[0] = sc.nextInt();// physics
        marks[1] = sc.nextInt();// chemistry
        marks[2] = sc.nextInt();// maths

        // output the marks
        System.out.println("Physics: " + marks[0]);
        System.out.println("Chemistry: " + marks[1]);
        System.out.println("Maths: " + marks[2]);

        // update the marks
        System.out.println("Enter new marks for Physics: ");
        marks[0] = sc.nextInt(); // update physics marks
        System.out.println("Updated Physics: " + marks[0]);

        // Display all marks
        System.out.println("All Marks:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }

        // passing array as argument to a method--> calling by reference
        int numbers[] = { 1, 2, 3, 4, 5 };
        int nonchangeable = 5;
        updateArray(numbers, nonchangeable); // Call the method to update the array
        System.out.println("Updated numbers in the array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " "); // Print updated array elements
        }
        System.out.println(); // New line for better readability
        System.out.println("Non-changeable variable: " + nonchangeable); // This will still print 5, as the original
                                                                         // variable is unchanged

        // linear search - find the index of a number in the array ; time complexity
        // O(n)
        System.out.println("Performing linear search in the array:");
        int target = 3; // Number to search for
        int index = linearSearch(numbers, target);
        if (index != -1) {
            System.out.println("Number " + target + " found at index: " + index);
        } else {
            System.out.println("Number " + target + " not found in the array.");
        }

        // largest number in an array time complexity O(n)
        System.out.println("Finding the largest number in the array:");
        int largest = largestNumber(numbers);
        System.out.println("The largest number in the array is: " + largest);
        // smallest number in an array time complexity O(n)
        System.out.println("Finding the smallest number in the array:");
        int smallest = smallestNumber(numbers);
        System.out.println("The smallest number in the array is: " + smallest);
        // Note: The above methods assume the array is not empty and has at least one
        // element.
        // You may want to add checks for empty arrays in a complete implementation.

        // binary search - find the index of a number in the array ; time complexity
        // O(log n)
        System.out.println("Performing binary search in the array:");
        int sortedNumbers[] = { 2, 4, 6, 8, 10, 12, 14 }; // Array must be sorted for binary search
        int targetBinary = 10; // Number to search for
        int binaryIndex = binarysearch(sortedNumbers, targetBinary);
        if (binaryIndex != -1) {
            System.out.println("Number " + targetBinary + " found at index: " + binaryIndex);
        } else {
            System.out.println("Number " + targetBinary + " not found in the array.");
            // Note: Binary search requires the array to be sorted.
        }

        reverseArray(sortedNumbers); // Reverse the sorted array
        System.out.println("Reversed array:");
        for (int i = 0; i < sortedNumbers.length; i++) {
            System.out.print(sortedNumbers[i] + " "); // Print reversed array elements
        }
        System.out.println(); // New line for better readability

        // pair array - print all pairs of elements in the array ; time complexity
        // O(n^2)
        System.out.println("Printing all pairs in the array:");
        pairarray(numbers); // Call the method to print pairs of elements in the array

        // print all subarrays of an array ; time complexity O(n^3)
        System.out.println("Printing all subarrays in the array:");
        printallsubarray(numbers); // Call the method to print all subarrays of the array

        // maximum subarray sum using brute force approach ; time complexity O(n^3)
        System.out.println("Finding maximum subarray sum using brute force approach:");
        maxsubarraysum(numbers); // Call the method to find maximum subarray sum
        // maximum subarray sum using kadane's algorithm ; time complexity O(n)
        System.out.println("Finding maximum subarray sum using Kadane's algorithm:");
        kadanesAlgorithm(numbers); // Call the method to find maximum subarray sum using Kadane's algorithm

        //value appears atleast twice in the array return true otherwise return false
        System.out.println("Checking if any value appears at least twice in the array:");
        boolean foundDuplicate = false; // Flag to check for duplicates
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) { // Check if any two elements are equal
                    foundDuplicate = true; // Set flag to true if a duplicate is found
                    break; // Exit inner loop if duplicate is found
                }
            }
        }
        System.out.println(foundDuplicate);
    }
}
