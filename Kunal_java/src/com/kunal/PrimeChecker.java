package com.kunal;

import java.util.Scanner;

public class PrimeChecker {
	public static void main(String[] args) {
		System.out.println("Enter a prime number");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		// You can change this number to check other numbers
		boolean isPrime = isPrime(number);

		if (isPrime) {
			System.out.println(number + " is a prime number.");
		} else {
			System.out.println(number + " is not a prime number.");
		}
	}

	public static boolean isPrime(int number) {
		if (number <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;

	}

}
