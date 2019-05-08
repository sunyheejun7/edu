package ncs.test7;

public class Student extends Human{

	int number;
	String major;
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int age, int height, int weight,int number, String major) {
		super(name, age, height, weight);
		this.number = number;
		this.major = major;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"\t"+number+"\t"+major;
	}







}
