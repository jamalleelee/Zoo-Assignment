package com.zooAssignment;

public class Fish extends Animals {

	private boolean hasScales = false;
	private boolean makesGoodSushi = true;

	public Fish(String animalName, int age, boolean eatsMeat, int legItStandsOn, boolean dangerToHuman,
			boolean keptAsPets, String countryAnimalIsFrom, String color, boolean hasEatenToday, boolean hasScales,
			boolean makesGoodSushi) {
		super(animalName, age, eatsMeat, legItStandsOn, dangerToHuman, keptAsPets, countryAnimalIsFrom, color,
				hasEatenToday);
		this.hasScales = hasScales;
		this.makesGoodSushi = makesGoodSushi;
	}

	public boolean isHasScales() {
		return hasScales;
	}

	public void setHasScales(boolean hasScales) {
		this.hasScales = hasScales;
	}

	public boolean isMakesGoodSushi() {
		return makesGoodSushi;
	}

	public void setMakesGoodSushi(boolean makesGoodSushi) {
		this.makesGoodSushi = makesGoodSushi;
	}

	@Override
	public String toString() {
		return "A " + color + " Fish named " + animalName + " from " + countryAnimalIsFrom + ". It is " + age
				+ " years old. \rIt is " + eatsMeat + " that it eats meat. It stands on " + legItStandsOn
				+ " legs. \rIt is " + dangerToHuman + " that it is a danger to humans, and it is " + hasEatenToday
				+ " that it has eaten today. \rIt is " + keptAsPets + " that people keep them as pets.\r" + "It is "
				+ hasScales + " that it has scales, and " + makesGoodSushi + " it makes tasty sushi.\r";
	}

}
