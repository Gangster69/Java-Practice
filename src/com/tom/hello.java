package com.tom;

import java.util.Random;
import java.util.Scanner;

public class hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random random = new Random();
		int number = random.nextInt(100) + 1;
		System.out.println(number);

		int max = 100;
		int min = 1;

		Scanner scanner = new Scanner(System.in);
		System.out.println("choose number(1-100)");
		int x = scanner.nextInt();

		if (x == number) {
			System.out.println("good!");
		}
		while (x != number) {
			if (x < number) {
				min = x;
				System.out.println(min + "to" + max);
				Scanner sc = new Scanner(System.in);
				int xx = sc.nextInt();
				x = xx;

			} else if (x > number) {
				max = x;
				System.out.println(min + "to" + x);
				Scanner sc = new Scanner(System.in);
				int xx = sc.nextInt();
				x = xx;
			}
			if (x == number) {
				System.out.println("good!");
			}
		}

	}

}
