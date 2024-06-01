package com.kunal.conditional;

import java.util.Scanner;

public class perimeterofcircle {
	public static void main(String[] args) {
		double circumference, radius;  
		//object of the Scanner class  
		Scanner sc=new Scanner (System.in);  
		System.out.print("Enter the radius of the circle: ");  
		//reading radius from the user  
		radius=sc.nextDouble();  
		//formula to calculate circumference of the circle  
		circumference= Math.PI*2*radius;  
		//prints the circumference  
		System.out.println("The circumference of the circle is: "+circumference);  
		
	}

}
