package com.naman;
abstract class Parent2{
    public Parent2(){
        System.out.println("Mai Parent2 ka constructor hoon");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}

class Child2 extends Parent2{
    @Override
    public void greet(){
        System.out.println("Good morning");
    }
    @Override
    public void greet2(){
        System.out.println("Good afternoon");
    }
}


public class AbstractClass {

	public static void main(String[] args) {
		//Parent2 p = new Parent2(); -- error
        Child2 c = new Child2();
        c.greet();
        c.greet2();
//		Parent2 p = new Child2();
//		p.greet();
//		p.greet2();
		

	}

}
