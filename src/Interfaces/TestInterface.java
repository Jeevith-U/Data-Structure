package Interfaces;

/**
 * If there are two interface with the same default method
 * And a class is implementing the two interface 
 * then there will be a confusion which one to use.
 * so compiler will force us to override the method
 */

interface A{
	
	default void check() {
		System.out.println("The Check Method Of A");
	}
}



interface B{
	
	default void check() {
		System.out.println("The Check Method Of B");
	}
}

public class TestInterface implements A, B {

	@Override
	public void check() {

//		A.super.check();
		B.super.check();
	}
	
	public static void main(String[] args) {
		
		TestInterface obj = new TestInterface() ;
		
		obj.check();
	}
	
}


