package com.zooAssignment;

public class Lion extends Animals {
	private int howManyInPride = 0;
	private String maleOrFemale = null;

	public Lion(String animalName, int age, boolean eatsMeat, int legItStandsOn, boolean dangerToHuman,
			boolean keptAsPets, String countryAnimalIsFrom, String color, boolean hasEatenToday, int howManyInPride,
			String maleOrFemale) {
		super(animalName, age, eatsMeat, legItStandsOn, dangerToHuman, keptAsPets, countryAnimalIsFrom, color,
				hasEatenToday);
		this.howManyInPride = howManyInPride;
		this.maleOrFemale = maleOrFemale;
	}

	public int getHowManyInPride() {
		return howManyInPride;
	}

	public void setHowManyInPride(int howManyInPride) {
		this.howManyInPride = howManyInPride;
	}

	public String getMaleOrFemale() {
		return maleOrFemale;
	}

	public void setMaleOrFemale(String maleOrFemale) {
		this.maleOrFemale = maleOrFemale;
	}

	@Override
	public String toString() {
		return "A " + color + " Lion named " + animalName + " from " + countryAnimalIsFrom + ". It is " + age
				+ " years old. \rIt is " + eatsMeat + " that it eats meat. It stands on " + legItStandsOn
				+ " legs. \rIt is " + dangerToHuman + " that it is a danger to humans, and it is " + hasEatenToday
				+ " that it has eaten today. \rIt is " + keptAsPets + " that people keep them as pets.\r" + "This is a "
				+ maleOrFemale + " lion, with " + howManyInPride + " other lions in it's pride.\r";
	}

}
