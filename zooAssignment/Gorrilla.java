package com.zooAssignment;

public class Gorrilla extends Animals {

	private boolean beatsChest = true;
	private boolean hasClimbedTheEmpireStateBuilding = false;

	public Gorrilla(String animalName, int age, boolean eatsMeat, int legItStandsOn, boolean dangerToHuman,
			boolean keptAsPets, String countryAnimalIsFrom, String color, boolean hasEatenToday, boolean beatsChest,
			boolean hasClimbedTheEmpireStateBuilding) {
		super(animalName, age, eatsMeat, legItStandsOn, dangerToHuman, keptAsPets, countryAnimalIsFrom, color,
				hasEatenToday);
		this.beatsChest = beatsChest;
		this.hasClimbedTheEmpireStateBuilding = hasClimbedTheEmpireStateBuilding;
	}

	public boolean isBeatsChest() {
		return beatsChest;
	}

	public void setBeatsChest(boolean beatsChest) {
		this.beatsChest = beatsChest;
	}

	public boolean isHasClimbedTheEmpireStateBuilding() {
		return hasClimbedTheEmpireStateBuilding;
	}

	public void setHasClimbedTheEmpireStateBuilding(boolean hasClimbedTheEmpireStateBuilding) {
		this.hasClimbedTheEmpireStateBuilding = hasClimbedTheEmpireStateBuilding;
	}

	@Override
	public String toString() {
		return "A " + color + " Gorilla named " + animalName + " from " + countryAnimalIsFrom + ". It is " + age
				+ " years old. \rIt is " + eatsMeat + " that it eats meat. It stands on " + legItStandsOn
				+ " legs. \rIt is " + dangerToHuman + " that it is a danger to humans, and it is " + hasEatenToday
				+ " that it has eaten today. \rIt is " + keptAsPets + " that people keep them as pets.\r" + "It is "
				+ beatsChest + " that it beats its chest and its also " + hasClimbedTheEmpireStateBuilding
				+ " that it has climbed the Empire State Building.\r";
	}

}
