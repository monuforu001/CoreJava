package exception;

class MyException extends Exception{
	int detail;
	MyException(int a){
		detail = a;
	}
	
	@Override
	public String toString(){
		return "My Exception[" + detail + "]";
	}
	
}
