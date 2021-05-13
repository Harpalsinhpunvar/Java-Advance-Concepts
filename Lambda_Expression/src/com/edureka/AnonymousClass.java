package com.edureka;

interface cab2{
	void bookCab();
}

class AnonymousClass{
	public static void main (String [] args) {
		
		cab2 obj = new cab2() {
			public void bookCab() {
				System.out.println("Booked finally!!!!!!!!!!!!");
			}
		};
		obj.bookCab();
		
	}
}