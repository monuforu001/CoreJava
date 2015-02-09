package thread.sync;

public class Account {
int balence = 50;

public int getBalence(){
	return balence;
} 

public void withdrawAmt(int amt){
	balence = balence - amt;
}
	
}
