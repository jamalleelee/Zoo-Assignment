package com.ObjectsAssignment;

public class CellPhone {

	public String phoneNumber = null;
	public String manufacturer = null;
	public String operatingSystem = null;
	public String cellPhoneNetwork = null;
	public String screenSizeInInches = null;
	public String color = null;
	public String blutooth = null;
	public String wifi = null;
	public String speakerPhone = null;
	public String wantsCase = null;

	public CellPhone(String phoneNumber, String manufacturer, String operatingSystem, String cellPhoneNetwork,
			String screenSizeInInches, String color, String blutooth, String wifi, String speakerPhone,
			String wantsCase) {
		this.phoneNumber = phoneNumber;
		this.manufacturer = manufacturer;
		this.operatingSystem = operatingSystem;
		this.cellPhoneNetwork = cellPhoneNetwork;
		this.screenSizeInInches = screenSizeInInches;
		this.color = color;
		this.blutooth = blutooth;
		this.wifi = wifi;
		this.speakerPhone = speakerPhone;
		this.wantsCase = wantsCase;
	}

	public CellPhone() {
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public String getCellPhoneNetwork() {
		return cellPhoneNetwork;
	}

	public void setCellPhoneNetwork(String cellPhoneNetwork) {
		this.cellPhoneNetwork = cellPhoneNetwork;
	}

	public String getScreenSizeInInches() {
		return screenSizeInInches;
	}

	public void setScreenSizeInInches(String screenSizeInInches) {
		this.screenSizeInInches = screenSizeInInches;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBlutooth() {
		return blutooth;
	}

	public void setBlutooth(String blutooth) {
		this.blutooth = blutooth;
	}

	public String getWifi() {
		return wifi;
	}

	public void setWifi(String wifi) {
		this.wifi = wifi;
	}

	public String getSpeakerPhone() {
		return speakerPhone;
	}

	public void setSpeakerPhone(String speakerPhone) {
		this.speakerPhone = speakerPhone;
	}

	public String getWantsCase() {
		return wantsCase;
	}

	public void setWantsCase(String wantsCase) {
		this.wantsCase = wantsCase;
	}

	@Override
	public String toString() {
		return "So you want your cell phone to have the number of " + phoneNumber + ", made by " + manufacturer
				+ ", running " + operatingSystem + ", that talks to the " + cellPhoneNetwork
				+ " network.\rYou also want a " + screenSizeInInches + " inch screen, and the color of " + color
				+ ".\rYou have said " + blutooth + " to bluetooth, " + wifi + " to WIFI," + speakerPhone
				+ " to a Speakerphone, and " + wantsCase + " to a protective case";
	}

}
