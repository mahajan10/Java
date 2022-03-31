package com.naman;
class Employee1{
    int id;
    int salary;
    String name;
    public void printDetails(){
        System.out.println("My id is " + id);
        System.out.println("and my name is "+ name);
    }

    public int getSalary(){
        return salary;
    }
}

public class Creating_Custom_Class {

	public static void main(String[] args) {
		System.out.println("This is our custom class");
        Employee1 harry = new Employee1(); // Instantiating a new Employee Object
        Employee1 john = new Employee1(); // Instantiating a new Employee Object

        // Setting Attributes for Harry
        harry.id = 12;
        harry.salary = 34;
        harry.name = "Divij";

        // Setting Attributes for John
        john.id = 17;
        john.salary = 12;
        john.name = "Naman";

        // Printing the Attributes
        harry.printDetails();
        john.printDetails();
        int salary = john.getSalary();
        System.out.println(salary);
        // System.out.println(harry.id);
        // System.out.println(harry.name);
		

	}

}
