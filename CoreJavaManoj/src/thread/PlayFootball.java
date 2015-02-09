package thread;

public class PlayFootball extends Thread {
	
	public PlayFootball(String name){
		setName(name);
	}
	public synchronized void run() {
		
	//	synchronized(this){
	 	try {
			for (int i = 0; i < 5; i++) {
				System.out.println(Thread.currentThread().getName() + ": " + i);
		//		System.out.println("State" + Thread.currentThread().getState());
	   			Thread.sleep(1);
			}
	 	} catch (InterruptedException e) {
			// TODO Auto-generated catch block
	 		e.printStackTrace();
	 	}
	//	}
	}
}
