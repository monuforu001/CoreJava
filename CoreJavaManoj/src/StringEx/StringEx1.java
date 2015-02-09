package StringEx;

public class StringEx1 {

	public static void main(String[] args) {
		
			String iphone1 = "Iphone5";
			String iphone2 = "Iphone5";
			String iphone3 = new String("Iphone5");
			String iphone4 = new String("Iphone5");
			
			System.out.println("iphone1 == iphone2 " + (iphone1 == iphone2));
			System.out.println("iphone1 == iphone3 " + (iphone1 == iphone3));
			System.out.println("iphone1 == iphone3 " + (iphone1.equals(iphone3)));
			System.out.println("iphone3 == iphone4 " + (iphone3.equals(iphone4)));
			
			/*if(iphone1 == iphone2) {
				System.out.println("Both are same");
			}else {
				System.out.println("Both are Diff");
			}*/
		}

	}


