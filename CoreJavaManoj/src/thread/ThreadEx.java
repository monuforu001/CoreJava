package thread;

public class ThreadEx {

	public static void main(String[] args) {
		//System.out.println("Start of main thread");
		
		PlayFootball Harry = new PlayFootball("Harry");
		PlayFootball Tommmy = new PlayFootball("Tommmy");
		
	//	System.out.println("Beginning State Harry " + Harry.getState());
	//	System.out.println("Beginning State Tommmy " + Tommmy.getState());	
		Harry.start();
		Tommmy.start();
		
		/*try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	//	System.out.println("End State Harry " + Harry.getState());
	//	System.out.println("End State Tommmy " + Tommmy.getState());	
		System.out.println("End of main thread");
		/*PlayFootball play = new PlayFootball();
		play.play();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		play.play();*/
	}

	/*public void callMe() {
		System.out
				.println("Call me thread:" + Thread.currentThread().getName());
	}*/
}