package ClassPackage;

public class MethodClient {
	static int result1;
	static int result2;
	static int result3;
	public static void main(String[] args) {
		MethodEx me1 = new MethodEx();
		result1 = me1.mul(5);
		System.out.println("return1:" + result1);
		
		result2 = me1.mul(5,2);
		System.out.println("return2:" + result2);
		
		result3 = me1.mul(5,2,3);
		System.out.println("return3:" + result3);
	}

}
