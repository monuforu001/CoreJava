package thread.sync;

public class AccountClient {

	public static void main(String[] args) {
		Runnable atm = new AtmCard();
		Thread hero = new Thread(atm, "Hero");
		hero.start();
		
		Thread heroine = new Thread(atm, "heroine");
		heroine.start();

	}

}
