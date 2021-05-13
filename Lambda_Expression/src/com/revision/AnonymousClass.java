package com.revision;

interface water{
	void saveWater();
}

public class AnonymousClass {

	public static void main(String[] args) {
		
		water obj = new water() {
			public void saveWater() {
				System.out.println("Save water and drink beer");
			}
		};
		obj.saveWater();

	}

}
