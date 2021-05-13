package com.revision;

interface a{
	void add(int x, int y);
}
class b{
	public static void add(int x, int y) {
		System.out.println(x +" " + y);
	}
	
	public void add2(int x, int y) {
		System.out.println(x +" " + y);
	}
}





public class MethodReference {
	public static void main(String[] args) {
		
	//reference to static
//		a obj = b::add;
//		obj.add(10, 20);
		
		//reference to no static
		
		b obj1 = new b();
		a cr = obj1::add2;
		cr.add(10, 20);
		

	}

}
