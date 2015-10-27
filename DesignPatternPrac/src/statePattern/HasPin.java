package statePattern;

public class HasPin implements ATMState {
	ATMMachine atmMachine ;
	public HasPin(ATMMachine newATMMachine) {
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
		System.out.println("Already Entered Pin") ;
	}

	@Override
	public void requestCash(int cashToWithdraw) {
		// TODO Auto-generated method stub
		if(cashToWithdraw > atmMachine.cashInMachine) {
			System.out.println("Don't have that Cash") ;
			System.out.println("Card Ejected") ;
			atmMachine.setATMState(atmMachine.getNoCardState());
		} else {
			System.out.println(cashToWithdraw + " is provided by the machine") ;
			atmMachine.setCashInMachine(atmMachine.cashInMachine - cashToWithdraw);
			System.out.println("Card Ejected") ;
			atmMachine.setATMState(atmMachine.getNoCardState());
			if(atmMachine.cashInMachine <= 0) {
				atmMachine.setATMState(atmMachine.getNoCashState());
			}
		}
	}

}
