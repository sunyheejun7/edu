package please;

import java.util.Scanner;
import java.util.Stack;

public class haha {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] memberArr = new String[] {"ȫ�浿", "�輺��", "������", "������", "���ü�"};
		
		System.out.println("�̻��� ȸ�� �̸��� �Է� : ");
		String searchName = sc.next();
		
		boolean result = false;
		for(int i=0; i<memberArr.length; i++) {
			if(searchName== memberArr[i])  {
				result = true;
				break;
			}
		}
	
		if(result) {
			System.out.println("ȸ������");
		}
		else {
			System.out.println("ȸ�� ������");
		}
	}
}
