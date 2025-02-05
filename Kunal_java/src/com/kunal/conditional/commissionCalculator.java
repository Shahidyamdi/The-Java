package com.kunal.conditional;

import java.util.Scanner;

public class commissionCalculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Input the sales amount
        System.out.print("Enter the sales amount: ");
        double salesAmount = scanner.nextDouble();

        // Input the commission rate
        System.out.print("Enter the commission rate (in percentage): ");
        double commissionRate = scanner.nextDouble();

        // Calculate the commission
        double commission = calculateCommission(salesAmount, commissionRate);

        // Output the result
        System.out.println("The commission for sales amount " + salesAmount + " at a commission rate of " + commissionRate + "% is: " + commission);
    }

    public static double calculateCommission(double salesAmount, double commissionRate) {
        return (salesAmount * commissionRate) / 100;
    
	}

}
