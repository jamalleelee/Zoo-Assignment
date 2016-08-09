package com.zooAssignment;

public class Cheetah extends Animals {

	private int howManySpots = 0;
	private int howFastItRunsInMPH = 0;

	public Cheetah(String animalName, int age, boolean eatsMeat, int legItStandsOn, boolean dangerToHuman,
			boolean keptAsPets, String countryAnimalIsFrom, String color, boolean hasEatenToday, int howManySpots,
			int howFastItRunsInMPH) {
		super(animalName, age, eatsMeat, legItStandsOn, dangerToHuman, keptAsPets, countryAnimalIsFrom, color,
				hasEatenToday);
		this.howManySpots = howManySpots;
		this.howFastItRunsInMPH = howFastItRunsInMPH;
	}

	public int getHowManySpots() {
		return howManySpots;
	}

	public void setHowManySpots(int howManySpots) {
		this.howManySpots = howManySpots;
	}

	public int getHowFastItRunsInMPH() {
		return howFastItRunsInMPH;
	}

	public void setHowFastItRunsInMPH(int howFastItRunsInMPH) {
		this.howFastItRunsInMPH = howFastItRunsInMPH;
	}

	@Override
	public String toString() {
		return "A " + color + " Cheetah named " + animalName + " from " + countryAnimalIsFrom + ". It is " + age
				+ " years old. \rIt is " + eatsMeat + " that it eats meat. It stands on " + legItStandsOn
				+ " legs. \rIt is " + dangerToHuman + " that it is a danger to humans, and it is " + hasEatenToday
				+ " that it has eaten today. \rIt is " + keptAsPets + " that people keep them as pets.\r" + "It has "
				+ howManySpots + " spots, and can run up to " + howFastItRunsInMPH + "MPH.\r";
	}

}
