package statePattern;

public class NoCard implements ATMState {
	ATMMachine atmMachine ;
	public NoCard(ATMMachine newATMMachine) {
		atmMachine = newATMMachine ;
	}
	@Override
	public void insertCard() {
		// TODO Auto-generated method stub
		System.out.println("Please Enter a PIN") ;
		atmMachine.setATMState(atmMachine.getYesCardState());
	}

	@Override
	public void ejectCard() {
		// TODO Auto-generated method stub
		System.out.println("Enter a card first") ;
	}

	@Override
	public void insertPin(int pinEntered) {
		// TODO Auto-generated method stub
		System.out.println("Enter a card first") ;
	}

	@Override
	public void requestCash(int cashToWithdraw) {
		// TODO Auto-generated method stub
		System.out.println("Enter a card first") ;
	}

}
