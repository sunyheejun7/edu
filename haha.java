package please;

import java.util.Scanner;
import java.util.Stack;

public class haha {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] memberArr = new String[] {"홍길동", "김성훈", "윤웅식", "윤성우", "남궁성"};
		
		System.out.println("겁색할 회원 이름을 입력 : ");
		String searchName = sc.next();
		
		boolean result = false;
		for(int i=0; i<memberArr.length; i++) {
			if(searchName== memberArr[i])  {
				result = true;
				break;
			}
		}
	
		if(result) {
			System.out.println("회원존재");
		}
		else {
			System.out.println("회원 비존재");
		}
	}
}
