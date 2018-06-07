package com.starxfighter.pets.models;

public class Cat extends Animal implements Pet {

	public Cat(String name, String breed, int weight) {
		super(name, breed, weight);
	}
	
	@Override
	public String showAffection() {
		String tempName = this.getName();
		String tempBreed = this.getBreed();
		int tempWeight = this.getWeight();
		String statement = "Your " + tempBreed + " cat, " + tempName + ", looked at you with some affection. You think";
		return statement;
	}
}
