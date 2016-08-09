package com.zooAssignment;

public class Bird extends Animals {
	private boolean flys = true;
	private boolean swims = false;
	private int numberOfEggs = 0;

	public Bird(String animalName, int age, boolean eatsMeat, int legItStandsOn, boolean dangerToHuman,
			boolean keptAsPets, String countryAnimalIsFrom, String color, boolean hasEatenToday, boolean flys,
			boolean swims, int numberOfEggs) {
		super(animalName, age, eatsMeat, legItStandsOn, dangerToHuman, keptAsPets, countryAnimalIsFrom, color,
				hasEatenToday);
		this.flys = flys;
		this.swims = swims;
		this.numberOfEggs = numberOfEggs;
	}

	public boolean isFlys() {
		return flys;
	}

	public void setFlys(boolean flys) {
		this.flys = flys;
	}

	public boolean isSwims() {
		return swims;
	}

	public void setSwims(boolean swims) {
		this.swims = swims;
	}

	public int getNumberOfEggs() {
		return numberOfEggs;
	}

	public void setNumberOfEggs(int numberOfEggs) {
		this.numberOfEggs = numberOfEggs;
	}

	@Override
	public String toString() {
		return "A " + color + " Penguin named " + animalName + " from " + countryAnimalIsFrom + ". It is " + age
				+ " years old. \rIt is " + eatsMeat + " that it eats meat. It stands on " + legItStandsOn
				+ " legs. \rIt is " + dangerToHuman + " that it is a danger to humans, and it is " + hasEatenToday
				+ " that it has eaten today. \rIt is " + keptAsPets + " that people keep them as pets.\r" + "It is "
				+ flys + " that it flys and " + swims + " that it swims. This penguin also has laid " + numberOfEggs
				+ " eggs.\r";
	}

}
