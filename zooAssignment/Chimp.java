package com.zooAssignment;

public class Chimp extends Animals {

	public boolean throwsPoop = true;
	public int howManyMonkeysInTroop = 0;

	public Chimp(String animalName, int age, boolean eatsMeat, int legItStandsOn, boolean dangerToHuman,
			boolean keptAsPets, String countryAnimalIsFrom, String color, boolean hasEatenToday, boolean throwsPoop,
			int howManyMonkeysInTroop) {
		super(animalName, age, eatsMeat, legItStandsOn, dangerToHuman, keptAsPets, countryAnimalIsFrom, color,
				hasEatenToday);
		this.throwsPoop = throwsPoop;
		this.howManyMonkeysInTroop = howManyMonkeysInTroop;
	}

	public boolean isThrowsPoop() {
		return throwsPoop;
	}

	public void setThrowsPoop(boolean throwsPoop) {
		this.throwsPoop = throwsPoop;
	}

	public int getHowManyMonkeysInTroop() {
		return howManyMonkeysInTroop;
	}

	public void setHowManyMonkeysInTroop(int howManyMonkeysInTroop) {
		this.howManyMonkeysInTroop = howManyMonkeysInTroop;
	}

	@Override
	public String toString() {
		return "A " + color + " Chimp named " + animalName + " from " + countryAnimalIsFrom + ". It is " + age
				+ " years old. \rIt is " + eatsMeat + " that it eats meat. It stands on " + legItStandsOn
				+ " legs. \rIt is " + dangerToHuman + " that it is a danger to humans, and it is " + hasEatenToday
				+ " that it has eaten today. \rIt is " + keptAsPets + " that people keep them as pets.\r" + "It is "
				+ throwsPoop + " that it throws poop and this chimp has " + howManyMonkeysInTroop
				+ " monkeys in its troop.\r";
	}

}
