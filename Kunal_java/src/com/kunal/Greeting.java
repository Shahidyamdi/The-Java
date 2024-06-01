package com.kunal;

import java.util.Scanner;

public class Greeting {
	public static void main(String[] args) {
		System.out.println("Enter a name");
		Scanner sc = new Scanner(System.in);
		String next = sc.next();
		System.out.println("Welcome to coding pratices " + next);
	}

}
 