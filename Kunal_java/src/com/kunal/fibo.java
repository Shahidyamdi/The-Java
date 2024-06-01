package com.kunal;

import java.util.Scanner;

public class fibo {
	public static void main(String[] args) {
		System.out.println("enter a number ");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a = 0;
		int b = 1;
		int count = 2;

		while (count <= n) {
			int temp = b;
			b = b + a;
			a = temp;
			count++;
		}

		System.out.println(b);

	}
}
