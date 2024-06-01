package com.kunal.conditional;

import java.util.Scanner;

public class Deprication {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Input the initial cost of the asset
		System.out.print("Enter the initial cost of the asset: ");
		double cost = scanner.nextDouble();

		// Input the salvage value of the asset
		System.out.print("Enter the salvage value of the asset: ");
		double salvageValue = scanner.nextDouble();

		// Input the useful life of the asset in years
		System.out.print("Enter the useful life of the asset (in years): ");
		int usefulLife = scanner.nextInt();

		// Calculate the annual depreciation
		double annualDepreciation = calculateDepreciation(cost, salvageValue, usefulLife);

		// Output the result
		System.out.println("The annual straight-line depreciation is: " + annualDepreciation);
	}

	public static double calculateDepreciation(double cost, double salvageValue, int usefulLife) {
		return (cost - salvageValue) / usefulLife;

	}

}
