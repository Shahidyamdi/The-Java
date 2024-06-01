package com.kunal.conditional;

import java.util.Scanner;

public class FutureInvestment {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Input the principal investment amount
		System.out.print("Enter the principal investment amount (P): ");
		double principal = scanner.nextDouble();

		// Input the annual interest rate in percentage
		System.out.print("Enter the annual interest rate (r) in percentage: ");
		double annualInterestRate = scanner.nextDouble();

		// Input the number of times interest is compounded per year
		System.out.print("Enter the number of times interest is compounded per year (n): ");
		int compoundsPerYear = scanner.nextInt();

		// Input the number of years the money is invested for
		System.out.print("Enter the number of years the money is invested for (t): ");
		int years = scanner.nextInt();

		// Calculate the future investment value
		double futureInvestmentValue = calculateFutureInvestmentValue(principal, annualInterestRate, compoundsPerYear,
				years);

		// Output the result
		System.out.println("The future investment value is: " + futureInvestmentValue);
	}

	public static double calculateFutureInvestmentValue(double principal, double annualInterestRate,
			int compoundsPerYear, int years) {
		double ratePerPeriod = annualInterestRate / 100 / compoundsPerYear;
		return principal * Math.pow(1 + ratePerPeriod, compoundsPerYear * years);

	}

}
