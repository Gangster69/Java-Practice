package com.tom;

public class Bmi {

	public Bmi() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person(75.5f ,1.75f);
		p.weight = 75.5f;
		p.height = 1.75f;
		System.out.println("your bmi is :"+p.bmi());

	}

}
