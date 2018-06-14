package com.codingdojo.web.models;

public abstract class Animal {
	//	attributes within the abstract class
	private String name;
	private String breed;
	private double weight;
	// all these methods are made for the Animal class
	public Animal(String name, String breed, double weight) {
		this.name = name;
		this.breed = breed;
		this.weight = weight;
	}
	//	getters. When getting information you always have to write it's data type and return it
	public String getName() {
		return this.name;
	}
	public String getBreed() {
		return this.breed;
	}
	public double getWeight() {
		return this.weight;
	}
	//	setters. always put void because we aren't returning anything
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public void setName(String name) {
		this.name = name;
	}
}
