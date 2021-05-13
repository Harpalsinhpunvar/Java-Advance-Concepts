package com.hp;

interface anony{
	void method1();
	void method2();
	String method3();
}

public class Anonymous_class {

	public static void main(String[] args) {
	
		anony obj = new anony() {
			
			public void method1() {System.out.println("method 1 here!");}
			public void method2() {System.out.println("method 2 here!");}
			public String method3() {System.out.println("method 3 here!");return null; }
		};
		
		obj.method1();
		obj.method2();
		obj.method3();

	}

}
