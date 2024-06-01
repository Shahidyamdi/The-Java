package com.kunal.conditional;

import java.util.Scanner;

public class Hcf {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Input the first number
		System.out.print("Enter the first number: ");
		int num1 = scanner.nextInt();

		// Input the second number
		System.out.print("Enter the second number: ");
		int num2 = scanner.nextInt();

		// Calculate the HCF
		int hcf = calculateHCF(num1, num2);

		// Output the result
		System.out.println("The HCF of " + num1 + " and " + num2 + " is: " + hcf);
	}

	// Method to calculate HCF using Euclidean algorithm
	public static int calculateHCF(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;

	}

}
