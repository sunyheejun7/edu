package ncs.test1;

public class ArrayTest {
	public static void main(String[] args) {
		int [][] array = {{12, 41, 36, 56, 21}, {82, 10, 12, 61, 45}, {14, 16, 18, 78, 65}, {45, 26, 72, 23, 34}};
		double sum=0,avg=0;
		for(int[] ar : array) {
			for(int arr : ar) {
				sum+=arr;
			}
		}
		avg=sum/(array.length*array[0].length);
		System.out.printf("%.2f\n",sum);
		System.out.printf("%.2f",avg);
		
			
	}

}
