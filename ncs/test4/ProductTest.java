package ncs.test4;

import java.util.Scanner;

public class ProductTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		int price,quantity,sum;
		
		System.out.println("제품명을 입력하세요");
		name=sc.nextLine();
		System.out.println("가격을 입력하세요");
		price=sc.nextInt();
		System.out.println("수량을 입력하세요");
		quantity=sc.nextInt();
		
		Product pd = new Product(name,price,quantity);
		sum = pd.getPrice()*pd.getQuantity();
		
		System.out.println(pd.information());
		System.out.println("총 구매 가격 :"+sum);
				
				
	}
	
}
