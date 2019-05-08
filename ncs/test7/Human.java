package ncs.test7;

public class Human {
	private String name;
	private int age,height,weight;
	
	public Human() {
		// TODO Auto-generated constructor stub
	}

	public Human(String name, int age, int height, int weight) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name +"\t"+ age +"\t"+ height +"\t"+ weight;
	}
}
