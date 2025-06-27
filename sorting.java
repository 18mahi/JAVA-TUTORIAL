public class sorting {
    //bubble sort is a simple sorting algorithm that repeatedly steps through the list, compares adjacent elements and swaps them if they are in the wrong order. 
    //The pass through the list is repeated until the list is sorted. 
    //The algorithm gets its name from the way smaller elements "bubble" to the top of the list.
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        // Traverse through all array elements
        for (int i = 0; i < n - 1; i++) {
            // Last i elements are already sorted
            for (int j = 0; j < n - i - 1; j++) {
                // Swap if the element found is greater than the next element
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    //SELECTION SORT is a simple sorting algorithm that divides the input list into two parts: a sorted and an unsorted part.
    //The algorithm repeatedly selects the smallest (or largest, depending on the order) element from the unsorted part and moves it to the end of the sorted part.
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        // Traverse through all array elements
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    //Insertion sort is a simple sorting algorithm that builds the final sorted array one item at a time.
    //It is much less efficient on large lists than more advanced algorithms such as quicksort,
    //heapsort, or merge sort.
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        // Traverse through 1 to n
        for (int i = 1; i < n; i++) {
            int curr = arr[i];
            int prev = i - 1;
            // Move elements of arr[0..i-1], that are greater than key,
            // to one position ahead of their current position
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            // Place the current element at its correct position
            // After the while loop, prev is at the position where curr should be inserted
            // So we place curr at prev + 1
            // This ensures that the elements before prev are all less than or equal to curr
            // and the elements after prev are all greater than or equal to curr
            // This maintains the sorted order of the array
            // This is the key step in insertion sort where we insert the current element into its correct position
            // in the already sorted part of the array
            arr[prev + 1] = curr;
        }
    }   
    //in-built sort is a method in Java that sorts the elements of an array or a collection using the natural ordering of its elements.
    //It is a part of the java.util package and can be used to sort arrays of
    //primitive types (like int, char, etc.) or objects that implement the Comparable interface.
    public static void inBuiltSort(int[] arr) {
        java.util.Arrays.sort(arr);
        //java.util.Arrays.sort(arr,si,ei);
        //This method sorts the specified range of the array into ascending order.
        //The range to be sorted extends from the index specified by si (inclusive) to the index specified by ei (exclusive).
        //This allows for sorting a specific portion of the array rather than the entire array.
        //Integer[] arr = {5, 2, 8, 1, 3, 4, 7, 6};
        //Arrays.sort(arr,Collection.reverseOrder());
        //This method sorts the specified array of Integer objects into descending order using the natural ordering of its elements.
        //It uses the Collection.reverseOrder() comparator to achieve this.
        //This is useful when you want to sort an array in reverse order without manually implementing a sorting algorithm.
        
    }

    //COUTNING SORT is a non-comparison based sorting algorithm that is used to sort a collection of objects according to keys that are small integers.
    //It works by counting the number of objects that have distinct key values, and using arithmetic to determine the position of each key in the output sequence.
    //it works in small ranges of integers, making it efficient for sorting integers or objects with integer keys. but only in positive integers.
    //It is not a comparison-based algorithm, so it does not compare elements directly.
    //Counting sort is particularly useful when the range of input values is known and limited, as it can achieve linear time complexity O(n + k), where n is the number of elements in the array and k is the range of the input values.
    public static void countingSort(int[] arr) {
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest=Math.max(largest,arr[i]);
        }
        int count[] = new int[largest + 1];
        // Count the occurrences of each element
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        // Reconstruct the sorted array
        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[index] = i;
                index++;
                count[i]--;
            }
        }
    }
    // A utility function to print an array of size n
    // This function prints the elements of the array in a single line
    // It iterates through the array and prints each element followed by a space
    // After printing all elements, it prints a newline character for better readability
    public static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        //sorting means arranging elements in a specific order
        //increasing order or decreasing order
        //BASIC ALGORITHMS- Insertion Sort, Selection Sort, Bubble Sort
        //ADVANCED ALGORITHMS- Merge Sort, Quick Sort, Heap Sort, counting Sort, Radix Sort
        //Time Complexity- O(n^2) for basic algorithms, O(n log n) for advanced algorithms
        //Space Complexity- O(1) for basic algorithms, O(n) for advanced algorithms
        //Example of an array to be sorted
        //We will use an array of integers for demonstration
        //You can change the array elements to test with different inputs
        //This is a simple example of an unsorted array
        //You can implement sorting algorithms on this array
        System.out.println("Unsorted array:");
        int[] arr = {5, 2, 8, 1, 3, 4, 7, 6};
        bubbleSort(arr);
        System.out.println("Sorted array:");
        printArray(arr);
        //The output will show the unsorted array followed by the sorted array

        
    }
}
