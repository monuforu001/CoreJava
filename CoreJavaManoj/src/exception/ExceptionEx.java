package exception;

public class ExceptionEx {

	public static void main(String[] args) {
		int a = 2;
		int b = 1;
		int[] c = { 10, 20, 30, 40, 50 };

		ExceptionEx expObj = new ExceptionEx();
		expObj = null;

		try {
			System.out.println("Sum:" + (a + b));
			System.out.println("Div:" + (a / b));
			System.out.println("array:" + c[1]);
			String str = null;
			str.toLowerCase();
		} catch (ArithmeticException | NullPointerException exp) {
			// exp.printStackTrace();
			System.out.println("divide by Zero exception");
		} catch (ArrayIndexOutOfBoundsException exp2) {
			// exp2.printStackTrace();
			System.out.println("stack over flow ");
		} finally {
			System.out.println("inside finally");
		}

		System.out.println("mul:" + (a * b));
	}
}
