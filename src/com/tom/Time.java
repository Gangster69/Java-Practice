package com.tom;

import java.util.Scanner;

public class Time {

	public Time() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter the time(Second):");
		double second;
		int minute , hour ,remainder ;
		final int SEC_PER_MIN =60;
		final int MIN_PER_H =60;
		Scanner sc =new Scanner(System.in);
		second =sc.nextDouble();
		minute =(int)(second/SEC_PER_MIN);
		hour =minute/MIN_PER_H;
		remainder =minute % MIN_PER_H;
		System.out.printf("%.2f sec = %d H , %d min\n",second , hour , remainder);
	}

}
