package ClassPackage;

public class ConstructorEx {
	int a;
	int b;
	int c;
	String name;
	
	public ConstructorEx(){
		System.out.println("default constructor");
	}
	
	public ConstructorEx(int a, int b){
		this.a = a;
		this.b = b;
		System.out.println("constructor overloading 1");;
	}
	
	public int addVal(){
		return a+b+c;
	}
	public ConstructorEx(int a, int b, int c){
		this.a = a;
		this.b = b;
		this.c = c;
		System.out.println("constructor overloading 2");;
	}

}
