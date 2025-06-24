/*
        JAVA ASSIGNMENT
        SHAHMEER WASEEM SHAIKH
        2K24/CSE/138
*/

public class RecursiveArraySum {

    // Recursive method to calculate the sum of array elements
    public static int recursiveSum(int[] arr, int index) {
        // Base case: if index reaches end of array
        if (index == arr.length) {
            return 0;
        }
        // Recursive step
        return arr[index] + recursiveSum(arr, index + 1);
    }

    public static void main(String[] args) {
        // Example array
        int[] numbers = {5, 8, 12, 3, 7};

        // Call the recursive sum function starting from index 0
        int totalSum = recursiveSum(numbers, 0);

        // Print the result
        System.out.println("The sum of array elements is: " + totalSum);
    }
}

/* OUTPUT
The sum of array elements is: 35
*/