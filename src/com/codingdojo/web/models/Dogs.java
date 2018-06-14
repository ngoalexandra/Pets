package com.codingdojo.web.models;

public class Dogs extends Animal implements Pets {
	private String name;
	private String breed;
	private double weight;
	
	public Dogs(String name, String breed, double weight) {
		super(name, breed, weight);
		
	}
	
	public String showAffection() {
		if (getWeight() > 40) {
			return "he loves to cuddle";
		}
		else {
			return "he likes to lick";
		}
	}

}
