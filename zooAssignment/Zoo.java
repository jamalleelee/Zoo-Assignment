package com.zooAssignment;

import java.util.ArrayList;

public class Zoo {

	public static void main(String[] args) {
		ArrayList<Animals> myZoo = new ArrayList<>();

		Lion lionA = new Lion("Simba", 3, true, 4, true, false, "Africa", "brown", true, 20, "Male");
		Gorrilla gorrillaA = new Gorrilla("King Kong", 7, false, 4, true, false, "New York, USA", "black", false, true,
				true);
		Chimp chimpA = new Chimp("Poopy Thrower", 2, false, 2, false, true, "Mexico", "black", true, true, 5);
		Shark sharkA = new Shark("Jaws", 30, true, 0, true, false, "USA", "grey", false, true, true);
		Bird birdA = new Bird("Mumble", 1, true, 2, false, true, "Alaska", "black & white", false, false, true, 1);
		Kangeroo kangerooA = new Kangeroo("Jack", 9, false, 2, true, false, "Africa", "brown", true, true, 20.6);
		Bear bearA = new Bear("Baloo", 10, true, 2, false, true, "USA", "black", false, true, false);
		Fish fishA = new Fish("Nemo", 1, false, 0, false, true, "USA", "orange & black", true, true, true);
		Cheetah cheetahA = new Cheetah("Cheeto", 13, true, 4, true, false, "Africa", "orange & black", false, 100, 30);
		Tiger tigerA = new Tiger("Tony", 50, true, 4, true, true, "Africa", "orange & black", true, 30, 450);

		myZoo.add(lionA);
		myZoo.add(gorrillaA);
		myZoo.add(chimpA);
		myZoo.add(sharkA);
		myZoo.add(birdA);
		myZoo.add(kangerooA);
		myZoo.add(bearA);
		myZoo.add(fishA);
		myZoo.add(cheetahA);
		myZoo.add(tigerA);

		System.out.println("Today at the zoo I saw:\r");
		for (int i = 0; i < myZoo.size(); i++) {
			System.out.println(myZoo.get(i));

		}

	}

}
