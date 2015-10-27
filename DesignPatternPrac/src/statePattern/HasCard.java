package statePattern;

public class HasCard implements ATMState {

	ATMMachine atmMachine ;
	public HasCard(ATMMachine newATMMachine) {
		atmMachine = newATMMachine ;
	}
	@Override
	public void insertCard() {
		// TODO Auto-generated method stub
		System.out.println("You can't enter more than one card") ;
	}

	@Override
	public void ejectCard() {
		// TODO Auto-generated method stub
		System.out.println("Card Ejected") ;
		atmMachine.setATMState(atmMachine.getNoCardState());
	}

	@Override
	public void insertPin(int pinEntered) {
		// TODO Auto-generated method stub
		if(pinEntered == 1234) {
			System.out.println("Corrent Pin") ;
			atmMachine.correctPinEntered = true ;
			atmMachine.setATMState(atmMachine.getHasPin());
		} else {
			System.out.println("Wrong Pin") ;
			atmMachine.correctPinEntered = false ;
			System.out.println("Corrent Pin") ;
			atmMachine.setATMState(atmMachine.getNoCardState());
		}
	}

	@Override
	public void requestCash(int cashToWithdraw) {
		// TODO Auto-generated method stub
		System.out.println("Enter PIN First") ;
	}

}
