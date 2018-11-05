package com.tom;

public class Person {
	double weight;
	double height;
	
	public Person(double weight,double height) {
		// TODO Auto-generated constructor stub
		this.weight =weight;
		this.height =height;
	}
	public double bmi() {
		double bmi =weight /(height*height) ;
		return bmi;
	}
}
