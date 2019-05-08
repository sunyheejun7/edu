package please;

import java.util.Scanner;

public class jj {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~100 사이의 정수를 입력하세요 : ");
		int num = sc.nextInt();
		if(num>=1 && num <=100) {
			if(num==1) {
				System.out.println("1은 소수가 아님");
				}//second if
			else if (num==2) {  // ******수정********
				System.out.println(num+"은 소수입니다."); // ******수정********
			}// ******수정********
			else  {
				for(int i = 2; i<num; i++) {
					if(num%i==0) {
						System.out.println(num+"은 소수가 아님");
						break;// ******수정********
					}//third if
					System.out.println(num+"은 소수입니다.");// ******수정********
					break;// ******수정********
				}//first for
				
			}//first else
		}//biggest if
		else {
			System.out.println("1부터 100까지 정수 입력");
		}
	}//main
}//class