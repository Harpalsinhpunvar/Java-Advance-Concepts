package com.revision;

@FunctionalInterface
interface teacher{
	void teachers();
}

class school implements teacher{
	public void teachers() {
		System.out.println("Hello, I am teacher");
	}
}

public class FunctionInterface {

	public static void main(String[] args) {
		
		teacher obj = new school();
		obj.teachers();
	}

}
