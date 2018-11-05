package com.tom;

import java.util.Scanner;

public class test2 {

	public test2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Are you 18?(Y/N)");
		Scanner sc =new Scanner(System.in);
		String anwser =sc.nextLine();
		System.out.println("*"+anwser+"*");
		boolean adult = anwser.toUpperCase().equals("Y");
		
		if(adult) {
			System.out.println("How old are you?");
			int age =sc.nextInt();
			sc.nextLine();
			System.out.println("What's your name?");
			String name = sc.nextLine();
			System.out.println("What's your nickname?");
			String nickname = sc.nextLine();
			System.out.println(name+"/"+nickname+"/"+age);
			
		}
		else {
			System.out.println("Thanks,Bye!");
		}
	}	
}
