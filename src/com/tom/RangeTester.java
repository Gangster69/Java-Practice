package com.tom;

import java.util.Scanner;

public class RangeTester {

	public RangeTester() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your number:");
		int number =sc.nextInt();
		System.out.println("*"+number+"*");
		System.out.println(number>0 && number<5);
	}

}
