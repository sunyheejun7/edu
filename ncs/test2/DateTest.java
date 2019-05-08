package ncs.test2;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class DateTest {
	public static void main(String[] args) {
		GregorianCalendar gcBirth = new GregorianCalendar();
		GregorianCalendar gcNow = new GregorianCalendar();
		SimpleDateFormat birth = new SimpleDateFormat("y년 M월 d일 E요일"); 
		SimpleDateFormat now = new SimpleDateFormat("y년 M월 d일 "); 
		gcBirth.set(1987, 4, 27);
		int age = gcNow.get(GregorianCalendar.YEAR)-gcBirth.get(GregorianCalendar.YEAR);

		System.out.println("생일:"+birth.format(gcBirth.getTime()));
		System.out.println("현재:"+now.format(gcNow.getTime()));
		System.out.println("나이:"+age + "세");
	}
}