package thread.sync;

public class AtmCard implements Runnable {
	private Account acct = new Account();
	
	public synchronized void run(){
		
		for(int i=0;i<5;i++){
			makeWithdrawl(10);
			
			if (acct.getBalence() <0){
				System.out.println("over withdrawn");
		}
		
		}
	}
	
	private void makeWithdrawl(int amt){
		System.out.println(Thread.currentThread().getName() + " is going to withdraw:" + amt);
		if (acct.getBalence() < amt) {
			System.out.println(Thread.currentThread().getName() + " doesn't have sufficient balence to withdraw, balence" + acct.getBalence());
		}else{
		acct.withdrawAmt(amt);
		System.out.println(Thread.currentThread().getName() + " had withdrawn:" + amt);
		}
	}
}
