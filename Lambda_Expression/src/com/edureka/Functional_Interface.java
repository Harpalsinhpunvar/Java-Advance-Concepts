package com.edureka;

@FunctionalInterface
interface cab{//when an interface will have exactly 1 abstract method we can say it as a functional interface
	void bookedCab();//-> by default public abstract void bookcab();
}

class uberx implements cab{
	public void bookedCab() {
		System.out.println("Hello, Cab is booked by Uberx");
	}
}

public class Functional_Interface {

	public static void main(String[] args) {
		
		cab obj = new uberx();// polymorphic statement
		obj.bookedCab();
		
		

	}

}
