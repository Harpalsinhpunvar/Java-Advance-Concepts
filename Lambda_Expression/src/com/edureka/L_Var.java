package com.edureka;

interface name{
	void n();
}

public class L_Var {
	static int a = 10;
	static int b = 20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		name obj = ()->{
			System.out.println(a);
			System.out.println(b);
		};

	}

}
