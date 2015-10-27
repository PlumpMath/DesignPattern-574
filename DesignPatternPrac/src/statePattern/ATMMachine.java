package statePattern;

public class ATMMachine {
	ATMState hasCard ;
	ATMState noCard ;
	ATMState hasCorrentPin ;
	ATMState atmOutOfMoney ;
	
	ATMState atmState ;
	
	int cashInMachine = 2000 ;
	public boolean correctPinEntered = false ;
	
	public ATMMachine() {
		hasCard = new HasCard(this) ;
		noCard = new NoCard(this) ;
		hasCorrentPin = new HasPin(this) ;
		atmOutOfMoney = new NoCash(this) ;
		
		atmState = noCard ;
		if(cashInMachine < 0) {
			atmState = atmOutOfMoney ;
		}
	}
	
	void setATMState(ATMState newATMState) {
		atmState = newATMState ;
	}
	
	public void setCashInMachine(int newCashInMachine) {
		cashInMachine = newCashInMachine ;
	}
	
	public void insertCard() {
		atmState.insertCard(); 
	}
	public void ejectCard() {
		atmState.ejectCard(); 
	}
	public void requestCash(int cashToWithdraw) {
		atmState.requestCash(cashToWithdraw);
	}
	public void insertPin(int pinEntered) {
		atmState.insertPin(pinEntered);
	}
	
	public ATMState getYesCardState() { return hasCard ; }
	public ATMState getNoCardState() { return noCard ; }
	public ATMState getHasPin() { return hasCorrentPin ; }
	public ATMState getNoCashState() { return atmOutOfMoney ; }
	
}
