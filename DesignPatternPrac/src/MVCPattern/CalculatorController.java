package MVCPattern;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {
	private CalculatorView theView ;
	private CalculatorModel theModel ;
	
	public CalculatorController(CalculatorView theView, CalculatorModel theModel) {
		this.theView = theView ;
		this.theModel = theModel ;
		
		this.theView.addCalculationListener(new CalculateListener());
	}
	
	public class CalculateListener implements ActionListener {
	
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
			int firstNumber = 0, secondNumber = 0 ;
			try {
				firstNumber = theView.getFirstNumber() ;
				secondNumber = theView.getSecondNumber() ;
				theModel.addTwoNumbers(firstNumber, secondNumber);
				theView.setCalcSolution(theModel.getCalculationValue());
			} catch(NumberFormatException ex) {
				theView.displayErrorMessage("You Need to Enter 2 Integers");
			}
		}
	
	}

}
