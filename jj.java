package please;

import java.util.Scanner;

public class jj {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~100 ������ ������ �Է��ϼ��� : ");
		int num = sc.nextInt();
		if(num>=1 && num <=100) {
			if(num==1) {
				System.out.println("1�� �Ҽ��� �ƴ�");
				}//second if
			else if (num==2) {  // ******����********
				System.out.println(num+"�� �Ҽ��Դϴ�."); // ******����********
			}// ******����********
			else  {
				for(int i = 2; i<num; i++) {
					if(num%i==0) {
						System.out.println(num+"�� �Ҽ��� �ƴ�");
						break;// ******����********
					}//third if
					System.out.println(num+"�� �Ҽ��Դϴ�.");// ******����********
					break;// ******����********
				}//first for
				
			}//first else
		}//biggest if
		else {
			System.out.println("1���� 100���� ���� �Է�");
		}
	}//main
}//class