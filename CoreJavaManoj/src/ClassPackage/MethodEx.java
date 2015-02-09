package ClassPackage;

public class MethodEx {
	int a;
	int b;
	int c;
	
	public int mul(int a){
		return a;
	}
	
	public int mul(int a, int b){
		return a*b;
	}
	
	public int mul(int a, int b, int c){
		return a*b*c;
	}
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("finelize");
	}
}
