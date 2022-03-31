package com.naman;

//class Mobile{
//	static final Mobile APPLE = new Mobile();
//	static final Mobile SAMSUNG = new Mobile();
//	static final Mobile HTC = new Mobile();
//}

enum Mobile{
	APPLE(100),SAMSUNG,HTC(50);
	
	int price;
	
	Mobile(){
		price = 80;
	}
	Mobile(int p){
		price = p;
		
	}
	public int getPrice() {
		return price;
	}
	
	

}

public class enumerator {

	public static void main(String[] args) {
	Mobile m1= Mobile.SAMSUNG;
	System.out.println("Price of the mobile is: "+m1.getPrice());

	}

}
