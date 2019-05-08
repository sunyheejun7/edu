package ncs.test5;

public class BookArrayTest {
	public static void main(String[] args) {
		Book bArray [] = new Book[3];
		
		bArray[0] = new Book("자바의정석","남궁성","도우출판",30000,0.1);
		bArray[1] = new Book("열혈강의 자바","구정은","프리렉",29000,0.1);
		bArray[2] = new Book("객체지향 JAVA8","금영욱","북스홈",30000,0.1);
	
		for(Book b:bArray) {
			System.out.printf("%s, %s, %s, %d원, %d%c할인\n",b.getTitle(),b.getAuthor(),b.getPublisher(),b.getPrice(),(int)(b.getDiscountRate()*100),'%');
			System.out.println("할인된 가격 : "+(int)((1-b.getDiscountRate())*b.getPrice())+"원");
		}
	}

}
