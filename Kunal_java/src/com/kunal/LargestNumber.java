package com.kunal;

public class LargestNumber {
	public static void main(String[] args) {
		int arr[] = { 5, 8, 3, 7, 2, 1, 10, 9 };
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max=arr[i];
			}
			
		}
		System.out.println(max);
		

	}
}
