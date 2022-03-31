package com.naman;
class MyMainEmployee{
    private int id;
    private String name;

    public MyMainEmployee(){
        id = 1;
        name = "Naman";
    }
    public MyMainEmployee(String myName, int myId){
        id = myId;
        name = myName;
    }
    public MyMainEmployee(String myName){
        id = 2;
        name = myName;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setId(int i){
        this.id = i;
    }
    public int getId(){
        return id;
    }
}

public class Constructors {

	public static void main(String[] args) {
		 //MyMainEmployee emp = new MyMainEmployee("ProgrammingWithNaman", 12);
        MyMainEmployee emp = new MyMainEmployee();
        //harry.setName("CodeWithHarry");
        //harry.setId(34);
        System.out.println(emp.getId());
        System.out.println(emp.getName());

	}

}
