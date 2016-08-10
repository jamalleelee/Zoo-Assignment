package com.ObjectsAssignment;

import java.util.Scanner;

public class CellPhoneStore {

	public static void main(String[] args) {
		CellPhone phoneA = new CellPhone();
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Thank you for coming to the Cell Phone Store!");

		System.out.println("What is your cell phone number?");
		String userInputA = keyboard.nextLine().toUpperCase();
		phoneA.setPhoneNumber(userInputA);

		System.out.println("What manufacturer do you want?");
		userInputA = keyboard.nextLine().toUpperCase();
		phoneA.setManufacturer(userInputA);

		System.out.println("What operating system do you want?");
		userInputA = keyboard.nextLine().toUpperCase();
		phoneA.setOperatingSystem(userInputA);

		System.out.println("What cell network do you want?");
		userInputA = keyboard.nextLine().toUpperCase();
		phoneA.setCellPhoneNetwork(userInputA);

		System.out.println("What size screen do you want in inches?");
		userInputA = keyboard.nextLine().toUpperCase();
		phoneA.setScreenSizeInInches(userInputA);

		System.out.println("What color phone would you like?");
		userInputA = keyboard.nextLine().toUpperCase();
		phoneA.setColor(userInputA);

		System.out.println("Do you want Bluetooth?");
		userInputA = keyboard.nextLine().toUpperCase();
		phoneA.setBlutooth(userInputA);

		System.out.println("Do you want WIFI?");
		userInputA = keyboard.nextLine().toUpperCase();
		phoneA.setWifi(userInputA);

		System.out.println("Do you want a speakerphone?");
		userInputA = keyboard.nextLine().toUpperCase();
		phoneA.setSpeakerPhone(userInputA);

		System.out.println("Whould you also like to purchase a case?");
		userInputA = keyboard.nextLine().toUpperCase();
		phoneA.setWantsCase(userInputA);

		keyboard.close();

		System.out.println(phoneA);
	}

}
