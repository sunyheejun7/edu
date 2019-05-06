package edu.part03;

public class Part extends Employee{
	final int day= 20;
	final int pday = 10000;
	
	
	public Part(String name, String dept, String type) {
		super(name, dept, type);
	}
	
	public int Pay() {
		return day*pday;
	}
	
	public String toString() {
		return super.name + " 총 급여 " + Pay();
	}
}
