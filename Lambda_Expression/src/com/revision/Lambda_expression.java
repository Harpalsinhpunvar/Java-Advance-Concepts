package com.revision;

interface classes{
	int student(int rollno);
}

public class Lambda_expression {

	public static void main(String[] args) {
		classes obj = (rollno)->{System.out.println("Hello student and rollno." + rollno); return  12;};
		int s =obj.student(108);
		System.out.println(s);
		 

	}

}
