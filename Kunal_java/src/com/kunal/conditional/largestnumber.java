package com.kunal.conditional;

import java.util.Scanner;

public class largestnumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int largest = Integer.MIN_VALUE; // Initialize with the smallest possible integer value

		while (true) {
			// Prompt the user to enter an integer
			System.out.print("Enter an integer (0 to stop): ");
			int number = scanner.nextInt();

			// Check if the user entered 0 to stop the input
			if (number == 0) {
				break;
			}

			// Update the largest number if the current number is greater
			if (number > largest) {
				largest = number;
			}
		}

		// Check if no valid number was entered
		if (largest == Integer.MIN_VALUE) {
			System.out.println("No valid numbers were entered.");
		} else {
			// Print the largest number
			System.out.println("The largest number entered is: " + largest);
		}

		// Close the scanner
		scanner.close();

	}

}
