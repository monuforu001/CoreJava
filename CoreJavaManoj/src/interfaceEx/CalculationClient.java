package interfaceEx;

public class CalculationClient {

	public static void main(String[] args) {
		
		Calculation cal1 = new Addition(){
			@Override
			public int calc(int a, int b){
				return a +b +1;
			}
		};
		System.out.println("Addition is:" + cal1.calc(2, 3));
		
		Calculation cal2 = new Subtraction();
		System.out.println("Subtraction is:" + cal2.calc(2, 3));
		
		Calculation cal3 = new Multiply();
		System.out.println("Multiply is:" + cal3.calc(2, 3));
		
		/* lambda expression */
//		   Division
		
		Calculation cal4 = (a,b) -> a/b;
		System.out.println("Division is:" + cal4.calc(10, 5));
	}

}
