package ncs.test6;

import java.util.Scanner;

public class ExceptionTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		Calculator c = new Calculator();
		if(num<=1 || num>=5) {
			try {
				throw new InvalidException("입력값에 오류가 있습니다.");
			} catch (InvalidException e) {
				System.out.println(e);
			}
		}else
		System.out.println(c.getSum(num));
	}

}
