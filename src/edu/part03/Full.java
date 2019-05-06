package edu.part03;

public class Full extends Employee{
	
	final int salary = 450000;
	final int ext = 1000;

	
	public Full(String name, String dept, String type) {
		super(name, dept, type);
	}
	public int Pay() {
		return salary+ext;
	}
	public String toString() {
		return super.name + " 총 급여" + Pay();
	}
}
