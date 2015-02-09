package exception;

public class ExceptionClient {

	public static void main(String[] args) {
		try {
			compute(1);
	  		compute(10);
		} catch (MyException e) {
			System.out.println("Caught My Exception");
		}
	}
	
	public static void compute(int i) throws MyException{
		System.out.println("inside Compute");
		if (i>6) {
			throw new MyException(i);
			}
		System.out.println("Normal Exit");
		
	}
}
