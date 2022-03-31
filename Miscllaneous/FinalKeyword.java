package com.naman;
class Dummy{
	public final void someFunction() {};

}
class MoreDummy extends Dummy{
	//public void someFunction() {}; //error- because methods declared as final cannot be overridden
}

class Example{
	private final int x; //final instance member variable
	private final static int y; //final static member variable
	static {
		y=4;
	}
	Example(){
	x=5; 
	}
	public void fun()
	{
		final int k; // final local variable
	}
	
	
	
}

public class FinalKeyword {

	public static void main(String[] args) {
		Example e1= new Example();
		

	}

}
