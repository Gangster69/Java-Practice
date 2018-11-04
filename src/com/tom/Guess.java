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
		Random radom =new Random();
		int number =radom.nextInt(100)+1;
		System.out.println(number);
		System.out.println("Guess a number(1-100):");
		while(true) {
			Scanner sc = new Scanner(System.in);
			int anwser =sc.nextInt();
			
			if(anwser == number) {
				System.out.println("Your are right!");
			}
			else if(anwser <number){
				min =anwser;
				System.out.println(anwser+"to"+max);
			}
			else if(anwser>number) {
				max =anwser;
				System.out.println(min+"to"+anwser);
			}
		}
		

	}
	
}
