package com.tom;

import java.util.Scanner;

public class Temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter the temperture(Calsius)");
		Scanner sc = new Scanner(System.in);
		double c =sc.nextDouble();
		Temperture temp =new Temperture(c);
		System.out.printf("%.1f C = %.1f F\n",c,temp.fahrenheit());
		
		
	}

}
