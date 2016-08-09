package com.zooAssignment;

public class Bear extends Animals {

	private boolean eatsHoney = false;
	private boolean willEatMowgli = true;

	public Bear(String animalName, int age, boolean eatsMeat, int legItStandsOn, boolean dangerToHuman,
			boolean keptAsPets, String countryAnimalIsFrom, String color, boolean hasEatenToday, boolean eatsHoney,
			boolean willEatMowgli) {
		super(animalName, age, eatsMeat, legItStandsOn, dangerToHuman, keptAsPets, countryAnimalIsFrom, color,
				hasEatenToday);
		this.eatsHoney = eatsHoney;
		this.willEatMowgli = willEatMowgli;
	}

	public boolean isEatsHoney() {
		return eatsHoney;
	}

	public void setEatsHoney(boolean eatsHoney) {
		this.eatsHoney = eatsHoney;
	}

	public boolean isWillEatMowgli() {
		return willEatMowgli;
	}

	public void setWillEatMowgli(boolean willEatMowgli) {
		this.willEatMowgli = willEatMowgli;
	}

	@Override
	public String toString() {
		return "A " + color + " Bear named " + animalName + " from " + countryAnimalIsFrom + ". It is " + age
				+ " years old. \rIt is " + eatsMeat + " that it eats meat. It stands on " + legItStandsOn
				+ " legs. \rIt is " + dangerToHuman + " that it is a danger to humans, and it is " + hasEatenToday
				+ " that it has eaten today. \rIt is " + keptAsPets + " that people keep them as pets.\r" + "It is "
				+ eatsHoney + " that it likes to eat honey, and " + willEatMowgli + " that it will eat Mowgli.\r";
	}

}
