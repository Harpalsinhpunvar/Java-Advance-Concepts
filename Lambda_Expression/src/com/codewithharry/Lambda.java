package com.codewithharry;

interface DemoAno{
	void method1(int a);
}

public class Lambda {
	public static void main (String [] args) {
		
		DemoAno obj = (a)->System.out.println("Hello method here!." + a);
		obj.method1(5);
	}

}
