package com.kunal;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		System.out.println("Enter a String");
		Scanner in = new Scanner(System.in);
		String original = in.next();
		String reverse = " ";

		for (int i = original.length() - 1; i >= 0; i--) {

			reverse = reverse + original.charAt(i);
		}
		if (original.equals(reverse)) {
			System.out.println("palindrome");
		} else {
			System.out.println("NO palindrome");
		}
	}

}
