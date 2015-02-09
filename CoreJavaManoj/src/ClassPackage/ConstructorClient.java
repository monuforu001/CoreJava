package ClassPackage;

public class ConstructorClient {

	public static void main(String[] args) {
		ConstructorEx ce = new ConstructorEx();
		ConstructorEx ce2 = new ConstructorEx(2,3);
		ConstructorEx ce3 = new ConstructorEx(2,3,4);
		
		System.out.println("Sum" + ce.addVal() );
		System.out.println("Sum" + ce2.addVal() );
		System.out.println("Sum" + ce3.addVal() );
	}

}
