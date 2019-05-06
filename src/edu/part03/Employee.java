package edu.part03;

public class Employee {
	String name;
	String dept;
	String type;
	
	public Employee() {
		super();
	}
	
	public Employee(String name, String dept, String type) {
		super();
		this.name=name;
		this.dept=dept;
		this.type=type;
	}
	
	public void total() {
		if(type=="영업부") {
			Employee ee = new Full(name, dept, type);
			Employee ee2 = new Part(name, dept, type);
			System.out.println(ee.toString());
		}
		else {
			Employee ee2 = new Part(name, dept, type);
			System.out.println(ee2.toString());
		}
	}
	
	public String toString() {
		return "";
	}
	
	public int pay() {
		return 0;
	}
}
