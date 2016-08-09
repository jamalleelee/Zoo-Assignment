package com.zooAssignment;

public class Kangeroo extends Animals {
	private boolean babyInPouch = false;
	private double howManyFeetCanItJump = 0;

	public Kangeroo(String animalName, int age, boolean eatsMeat, int legItStandsOn, boolean dangerToHuman,
			boolean keptAsPets, String countryAnimalIsFrom, String color, boolean hasEatenToday, boolean babyInPouch,
			double howManyFeetCanItJump) {
		super(animalName, age, eatsMeat, legItStandsOn, dangerToHuman, keptAsPets, countryAnimalIsFrom, color,
				hasEatenToday);
		this.babyInPouch = babyInPouch;
		this.howManyFeetCanItJump = howManyFeetCanItJump;
	}

	public boolean isBabyInPouch() {
		return babyInPouch;
	}

	public void setBabyInPouch(boolean babyInPouch) {
		this.babyInPouch = babyInPouch;
	}

	public double getHowManyFeetCanItJump() {
		return howManyFeetCanItJump;
	}

	public void setHowManyFeetCanItJump(double howManyFeetCanItJump) {
		this.howManyFeetCanItJump = howManyFeetCanItJump;
	}

	@Override
	public String toString() {
		return "A " + color + " Kangeroo named " + animalName + " from " + countryAnimalIsFrom + ". It is " + age
				+ " years old. \rIt is " + eatsMeat + " that it eats meat. It stands on " + legItStandsOn
				+ " legs. \rIt is " + dangerToHuman + " that it is a danger to humans, and it is " + hasEatenToday
				+ " that it has eaten today. \rIt is " + keptAsPets + " that people keep them as pets.\r" + "It is "
				+ babyInPouch + " that it has a baby in its pouch. And it can jump " + howManyFeetCanItJump
				+ " feet in the air.\r";
	}
}
