package com.kunal;

import java.util.Scanner;

public class Dollorcal {
	public static void main(String[] args) {
		System.out.println("Enter a rupess");
		Scanner in = new Scanner(System.in);
        float rupees;
		 rupees = in.nextLong();

		float dollars = rupees / 64;

		System.out.println(dollars + " Dollars");
	}

}
