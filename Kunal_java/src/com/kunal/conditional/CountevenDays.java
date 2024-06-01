package com.kunal.conditional;

public class CountevenDays {
	public static void main(String[] args) {
		int totalEvenDays = 0;

		// August has 31 days, we need to count even days
		for (int day = 1; day <= 31; day++) {
			if (day % 2 == 0) {
				totalEvenDays++;
			}
		}

		System.out.println("Kunal can go out on " + totalEvenDays + " days in August.");
	}
}
