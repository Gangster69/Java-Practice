package com.tom;

import java.util.Scanner;

public class test2 {

	public test2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Are you 18?(Y/N)");
		String anwser =sc.nextLine();
		System.out.println("*"+anwser+"*");
		boolean adult =anwser.toUpperCase().equals("Y");
		System.out.println(adult);
		
		if(adult) {
			System.out.println("What's your name?");
			String name =sc.nextLine();
			System.out.println("What's your nickname?");
			String nickname = sc.nextLine();
			System.out.println("How old are you?");
			int age =sc.nextInt();
			System.out.println(name+"/"+nickname+"/"+age);
		}
	}	
}
