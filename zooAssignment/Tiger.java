package com.zooAssignment;

public class Tiger extends Animals {
	private int howManyStripes = 0;
	private int howManyZebrasKilled = 0;

	public Tiger(String animalName, int age, boolean eatsMeat, int legItStandsOn, boolean dangerToHuman,
			boolean keptAsPets, String countryAnimalIsFrom, String color, boolean hasEatenToday, int howManyStripes,
			int howManyZebrasKilled) {
		super(animalName, age, eatsMeat, legItStandsOn, dangerToHuman, keptAsPets, countryAnimalIsFrom, color,
				hasEatenToday);
		this.howManyStripes = howManyStripes;
		this.howManyZebrasKilled = howManyZebrasKilled;
	}

	public int getHowManyStripes() {
		return howManyStripes;
	}

	public void setHowManyStripes(int howManyStripes) {
		this.howManyStripes = howManyStripes;
	}

	public int getHowManyZebrasKilled() {
		return howManyZebrasKilled;
	}

	public void setHowManyZebrasKilled(int howManyZebrasKilled) {
		this.howManyZebrasKilled = howManyZebrasKilled;
	}

	@Override
	public String toString() {
		return "A " + color + " Tiger named " + animalName + " from " + countryAnimalIsFrom + ". It is " + age
				+ " years old. \rIt is " + eatsMeat + " that it eats meat. It stands on " + legItStandsOn
				+ " legs. \rIt is " + dangerToHuman + " that it is a danger to humans, and it is " + hasEatenToday
				+ " that it has eaten today. \rIt is " + keptAsPets + " that people keep them as pets.\r" + "It has "
				+ howManyStripes + " stripes, and has killed " + howManyZebrasKilled
				+ " Zebras since he has lived here.\r";
	}

}
