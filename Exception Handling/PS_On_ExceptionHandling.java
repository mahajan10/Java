package com.naman;
import java.util.Scanner;


class MaxRetriesException extends Exception{
    @Override
    public String toString() {
        return "Max Retries Error";
    }

    @Override
    public String getMessage() {
        return "You have reached max tries,you cannot proceed further";
    }
}

public class PS_On_ExceptionHandling {
	 public static void getArrayElementUntilLimitReached() throws MaxRetriesException{
	        //Problem 3-:

	        int []arr={1,2,3};
	        int i;
	        int index;
	        Scanner sc=new Scanner(System.in);

	        for(i=1;i<=5;i++){

	            try {
	                index=sc.nextInt();
	                System.out.println("Array element at index "+index+" is "+arr[index]);
	                break;
	            }
	            catch (Exception e){
	                if(i!=5)
	                    System.out.println("Not a valid Index,try again");
	                else
	                    System.out.println("Not a valid Index");
	            }

	        }

	        if(i==6){
	            throw new MaxRetriesException();


	        }
	    }
	 public static void main(String[] args) {
		 try {
	            getArrayElementUntilLimitReached();
	        } 
		 catch (Exception e) {
	            System.out.println(e);
	        }
	}

}
