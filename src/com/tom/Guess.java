package com.tom;

import java.util.Random;
import java.util.Scanner;

public class Guess {

	public Guess() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max =100;
		int min = 1;
		Random random = new Random();
		int secret = random.nextInt(100)+1;
		System.out.println(secret);
		System.out.println("enter the number(1-100):");
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int x =sc.nextInt();
			if (x == secret) {
				System.out.println("Good job!");
			}
			else if(x<secret) {
				min =x;
				System.out.println(x+"to"+max);
			}
			else if(x>secret) {
				max=x;
				System.out.println(min+"to"+x);
			}
		}	
	}
	
}
