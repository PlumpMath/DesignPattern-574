package statePattern;

public class NoCash implements ATMState {
	ATMMachine atmMachine ;
	public NoCash(ATMMachine newATMMachine) {
		atmMachine = newATMMachine ;
	}
	@Override
	public void insertCard() {
		// TODO Auto-generated method stub
		System.out.println("We don't have money") ;
	}

	@Override
	public void ejectCard() {
		// TODO Auto-generated method stub
		System.out.println("We don't have money, You didn't enter a card") ;
	}

	@Override
	public void insertPin(int pinEntered) {
		// TODO Auto-generated method stub
		System.out.println("We don't have money") ;
	}

	@Override
	public void requestCash(int cashToWithdraw) {
		// TODO Auto-generated method stub
		System.out.println("We don't have money") ;
	}

}
