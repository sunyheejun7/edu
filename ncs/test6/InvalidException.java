package ncs.test6;

public class InvalidException extends Exception{
	String aa;
	public InvalidException(String s) {
		// TODO Auto-generated constructor stub		
		super(s);
		aa=s;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return aa;
	}
}
