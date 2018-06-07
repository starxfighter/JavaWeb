package com.starxfighter.pets.models;

public class Dog extends Animal implements Pet {

	public Dog(String name, String breed, int weight) {
		super(name, breed, weight);
	}
	
	@Override
	public String showAffection() {
		String statement;
		String tempName = this.getName();
		String tempBreed = this.getBreed();
		int tempWeight = this.getWeight();
		if(tempWeight >= 30) {
			statement = tempName + " curled up on the floor next to you";
		} else {
			statement = tempName + " hopped into your lap and cuddled you";
		}
		
		return statement;
	}
	
	

}
