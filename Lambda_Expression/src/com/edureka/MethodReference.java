package com.edureka;

interface Calculator{
	void add(int num1, int num2);
}

class calC{
	public static void addSomething(int num1, int num2) {
		System.out.println(num1 + " and " + num2 + " Addition is: " + (num1+num2));
	}
	
	public  void add(int num1, int num2) {
		System.out.println(num1 + " and " + num2 + " Addition is: " + (num1+num2));
	}
}

interface Messager{
	Message getMessage(String msg);
	}

class Message{
	Message(String msg){
		System.out.println(">> Message is: " + msg);
	}
}
public class MethodReference {
	public static void main(String[] args) {
		
//		calC.addSomething(10, 20);
		
		//1.reference to a static method
//		Calculator cRef = calC::addSomething;
//		cRef.add(10, 20);
		
		//2.reference to a non static method or instance method
//		calC c = new calC();
//		Calculator cR = c::add;
//		cR.add(10, 20);
		
		//3. Reference to a constructor
		Messager m = Message::new;
		m.getMessage("Search the candle a than cursing darkness !!");

	}

}
