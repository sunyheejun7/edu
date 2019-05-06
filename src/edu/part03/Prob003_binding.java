package edu.part03;
/*
 * [데이타]
 * 이름       부서     구분              급여             수당         근무일         일당
 * 홍길동    영업부   정직원        450000      1000
 * 갑동이    기획부   계약직                                               20     10000
 * 
 * [출력결과]
 * 홍길동  총급여  451000
 * 갑동이  총급여  200000
 * 
 * 위의 [데이타]를 참조하여 [출력결과]가 나오도록 프로그램을 구현하세요.
 */



public class Prob003_binding {

	public static void main(String[] args) {
		Employee ee = new Employee("홍길동", "영업부", "정직원");
		
		Employee ee2 = new Employee("갑동이", "기획부", "계약직");
		ee.total();
		ee2.total();
		
		
	}//end main()

}//end class

