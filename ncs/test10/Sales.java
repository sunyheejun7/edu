package ncs.test10;

public class Sales extends Employee implements Bonus{
	@Override
	public void incentive(int pay) {
		// TODO Auto-generated method stub
		super.setSalary((int)(super.getSalary()+pay*1.2));
	}
	
	public Sales() {
		// TODO Auto-generated constructor stub
	}

	public Sales(String name, int number, String department, int salary) {
		super(name, number, department, salary);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double tax() {
		// TODO Auto-generated method stub
		return super.getSalary()*0.13;
	}

}
