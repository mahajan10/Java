package com.naman;

class NegativeRadiusException extends Exception{
    @Override
    public String toString() {
        return "Radius cannot be negative!";
    }

    @Override
    public String getMessage() {
        return "Radius cannot be negative!";
    }
}

public class Throw_Vs_Throws {
	public static double area(int r) throws NegativeRadiusException{
        if (r<0){
            throw new NegativeRadiusException();
        }
        double result = Math.PI * r * r;
        return result;
    }
	public static void main(String[] args) {
		try{
          double ar = area(-6);
          System.out.println(ar);
      }
      catch(Exception e){
          System.out.println("Exception");
          System.out.println(e.toString());
          System.out.println(e.getMessage());
          
          
      }
		

	}

}
