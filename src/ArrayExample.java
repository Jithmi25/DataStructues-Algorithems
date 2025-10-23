import java.util.Scanner;  // Import Scanner class for user input

public class ArrayExample {
    public static void main(String[] args) {

        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Ask the user for the size of the array
        System.out.print("Enter the number of elements: ");
        int size = input.nextInt();  // store the array size

        // Declare an array of integers with the given size
        int[] numbers = new int[size];

        // Get user input to fill the array
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = input.nextInt();  // store input in each array position
        }

        // Display the array elements
        System.out.println("\nYou entered:");
        for (int i = 0; i < size; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }

        // Close the scanner
        input.close();
    }
}

