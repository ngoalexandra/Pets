package com.codingdojo.web.models;

public class Cats extends Animal implements Pets {
	private String name;
	private String breed;
	private double weight;
	
	public Cats(String name, String breed, double weight) {
		//	super is used inside sub-class methods defined in the superclass. 
		//	It is also used in constructors to invoke constructors of it's parent class
		super(name, breed, weight);
		
	}
	
	public String showAffection() {
		return "is purring at you";
	}

}
