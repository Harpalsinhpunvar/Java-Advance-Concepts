package com.edureka;

//interface cab3{
//	void bookedcab(String msg);
//}

interface cab4{
	double bookedcab4(String msg, String msg2);
}
public class Lambda_Expression {
	
	int instanceVar = 10;
	static int sVar = 100;

	public static void main(String[] args) {
		
//		cab3 obj= (msg)->System.out.println("Booked: " + msg);
//		obj.bookedcab("Arriving soon!");
		
		cab4 obj2 = (msg, msg2)-> {
			int localVar = 1000;
			
			System.out.println("booked" + msg + " to " + msg2); 
//			System.out.println("Instance variable: " +instanceVar);
			System.out.println("static variable: " +  Lambda_Expression.sVar);
			System.out.println("local variable: " + localVar);


		
		
		return 980.10;};
		double fare = obj2.bookedcab4("pune", "mumbai");
		
		System.out.println(fare);
		
		

	}

}
