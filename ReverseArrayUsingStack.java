/*
        JAVA ASSIGNMENT
        SHAHMEER WASEEM SHAIKH
        2K24/CSE/138
*/

import java.util.Stack;

public class ReverseArrayUsingStack {

    // Method to reverse an array using a stack
    public static void reverseArray(int[] array) {
        Stack<Integer> stack = new Stack<>();

        // Push all elements of the array onto the stack
        for (int value : array) {
            stack.push(value);
        }

        // Pop all elements from the stack back into the array
        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }
    }

    // Utility method to print the array
    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        System.out.println("Original array:");
        printArray(array);

        reverseArray(array);

        System.out.println("Reversed array:");
        printArray(array);
    }
}
/* OUTPUT
Original array:
1 2 3 4 5
Reversed array:
5 4 3 2 1
*/