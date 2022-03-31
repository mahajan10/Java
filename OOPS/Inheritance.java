package com.naman;
class Base{
    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in base class and setting x now");
        this.x = x;
    }

    public void printMe(){
        System.out.println("I am a constructor");
    }
}

class Derived extends Base{
    public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
    	System.out.println("I am in Derived class and setting y now");
        this.y = y;
    }
}


public class Inheritance {

	public static void main(String[] args) {
		 // Creating an Object of base class
//        Base b = new Base();
//        b.setX(4);
//        System.out.println(b.getX());

        // Creating an object of derived class
        Derived d = new Derived();
        d.setX(22);
        System.out.println(d.getX());
        d.setY(43);
        System.out.println(d.getY());

	}

}
