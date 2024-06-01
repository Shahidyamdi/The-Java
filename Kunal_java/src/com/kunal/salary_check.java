package com.kunal;

import java.util.Scanner;

public class salary_check {
	public static void main(String[] args) {
		System.out.println("Enter a salary");
		Scanner sc = new Scanner(System.in);
		int salary = sc.nextInt();
		if (salary > 15000) {
			salary = salary + 2000;
			System.out.println("SALARY " + salary);
		} else if (salary <= 15000) {
			salary = salary + 1000;
			System.out.println("SALARY " + salary);

		}

	}

}
