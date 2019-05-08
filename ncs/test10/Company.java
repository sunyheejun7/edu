package ncs.test10;

public class Company {
	public static void main(String[] args) {
		Employee[] employees = new Employee[2];
		employees[0] = new Secretary("Hilery", 1, "secretary", 800);
		employees[1] = new Sales("Clinten", 2, "sales  ", 1200);

		System.out.println("name \t department\tsalary");
		System.out.println("--------------------------------------");
		for(Employee e:employees) 
			System.out.println(e.getName() +"\t"+ e.getDepartment() +"\t\t"+ e.getSalary());
	
		Secretary st = (Secretary)employees[0];
		st.incentive(100);
		employees[0].setSalary(st.getSalary());
		Sales sl = (Sales)employees[1];
		sl.incentive(100);
		employees[1].setSalary(sl.getSalary());
		
		System.out.println("인센티브 100 지급");
		System.out.println("name \t department\tsalary\ttax");
		System.out.println("------------------------------------------------");		
		for(Employee e:employees) 
			System.out.println(e.getName() +"\t"+ e.getDepartment() +"\t\t"+ e.getSalary()+"\t\t"+e.tax());
	
	}
}
