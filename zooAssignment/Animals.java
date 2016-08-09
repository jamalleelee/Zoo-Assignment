package com.zooAssignment;

public class Animals {
	protected String animalName = null;
	protected int age = 0;
	protected boolean eatsMeat = false;
	protected int legItStandsOn = 0;
	protected boolean dangerToHuman = false;
	protected boolean keptAsPets = false;
	protected String countryAnimalIsFrom = null;
	protected String color = null;
	protected boolean hasEatenToday = false;

	public Animals(String animalName, int age, boolean eatsMeat, int legItStandsOn, boolean dangerToHuman,
			boolean keptAsPets, String countryAnimalIsFrom, String color, boolean hasEatenToday) {
		this.animalName = animalName;
		this.age = age;
		this.eatsMeat = eatsMeat;
		this.legItStandsOn = legItStandsOn;
		this.dangerToHuman = dangerToHuman;
		this.keptAsPets = keptAsPets;
		this.countryAnimalIsFrom = countryAnimalIsFrom;
		this.color = color;
		this.hasEatenToday = hasEatenToday;
	}

	public String getAnimalName() {
		return animalName;
	}

	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isEatsMeat() {
		return eatsMeat;
	}

	public void setEatsMeat(boolean eatsMeat) {
		this.eatsMeat = eatsMeat;
	}

	public int getLegItStandsOn() {
		return legItStandsOn;
	}

	public void setLegItStandsOn(int legItStandsOn) {
		this.legItStandsOn = legItStandsOn;
	}

	public boolean isDangerToHuman() {
		return dangerToHuman;
	}

	public void setDangerToHuman(boolean dangerToHuman) {
		this.dangerToHuman = dangerToHuman;
	}

	public boolean isKeptAsPets() {
		return keptAsPets;
	}

	public void setKeptAsPets(boolean keptAsPets) {
		this.keptAsPets = keptAsPets;
	}

	public String getCountryAnimalIsFrom() {
		return countryAnimalIsFrom;
	}

	public void setCountryAnimalIsFrom(String countryAnimalIsFrom) {
		this.countryAnimalIsFrom = countryAnimalIsFrom;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isHasEatenToday() {
		return hasEatenToday;
	}

	public void setHasEatenToday(boolean hasEatenToday) {
		this.hasEatenToday = hasEatenToday;
	}

}
