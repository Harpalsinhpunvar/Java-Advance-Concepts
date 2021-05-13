package com.hp;

interface hi{
	void hello(int a);
}

public class Lambda_Expression {

	public static void main(String[] args) {
		
		hi obj = (a)->System.out.println("hello" + a);
		obj.hello(10);
	}

}
