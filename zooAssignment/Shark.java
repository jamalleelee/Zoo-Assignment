package com.zooAssignment;

public class Shark extends Animals {

	private boolean swimsFast = false;
	private boolean eatsOtherSharks = false;

	public Shark(String animalName, int age, boolean eatsMeat, int legItStandsOn, boolean dangerToHuman,
			boolean keptAsPets, String countryAnimalIsFrom, String color, boolean hasEatenToday, boolean swimsFast,
			boolean eatsOtherSharks) {
		super(animalName, age, eatsMeat, legItStandsOn, dangerToHuman, keptAsPets, countryAnimalIsFrom, color,
				hasEatenToday);
		this.swimsFast = swimsFast;
		this.eatsOtherSharks = eatsOtherSharks;
	}

	public boolean isSwimsFast() {
		return swimsFast;
	}

	public void setSwimsFast(boolean swimsFast) {
		this.swimsFast = swimsFast;
	}

	public boolean isEatsOtherSharks() {
		return eatsOtherSharks;
	}

	public void setEatsOtherSharks(boolean eatsOtherSharks) {
		this.eatsOtherSharks = eatsOtherSharks;
	}

	@Override
	public String toString() {
		return "A " + color + " Shark named " + animalName + " from " + countryAnimalIsFrom + ". It is " + age
				+ " years old. \rIt is " + eatsMeat + " that it eats meat. It stands on " + legItStandsOn
				+ " legs. \rIt is " + dangerToHuman + " that it is a danger to humans, and it is " + hasEatenToday
				+ " that it has eaten today. \rIt is " + keptAsPets + " that people keep them as pets.\r" + "It is "
				+ swimsFast + " that it swims fast, and also " + eatsOtherSharks + " it eats other sharks.\r";
	}

}
