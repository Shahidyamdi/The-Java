package com.kunal;

import java.util.Scanner;

public class Even_odd {
	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		if(i%2==0) {
			System.out.println("Even");
		}
		else {
			System.out.println("odd");
		}
	}

}
