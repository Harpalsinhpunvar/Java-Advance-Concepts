package com.codewithharry;

interface DemoAnony{
	void m1();
	void m2();
}

class AnnonymousClass{
	public static void main (String [] args) {
		
		DemoAnony obj = new DemoAnony() {// anonymous class is using for making expression, 
			public void m1() {
				System.out.println("Hello, I am method one");
			}
			public void m2() {
				System.out.println("Hello, I am method two");
			}
		};
		
		obj.m1();
		
		
	}
}