package ncs.test6;

public class Calculator {

	public double getSum(int data) {
		int sum=0;


		for(int i=1;i<=data;i++)
			sum+=i;			
		return sum;
	}

}
