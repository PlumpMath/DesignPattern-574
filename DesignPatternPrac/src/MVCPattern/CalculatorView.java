package MVCPattern;

import java.awt.event.ActionListener;
import javax.swing.* ;

public class CalculatorView extends JFrame {
	private JTextField firstNumber = new JTextField(10) ;
	private JLabel additionalLabel = new JLabel("+") ;
	private JTextField secondNumber = new JTextField(20);
	private JButton calculationButton = new JButton("Calculate") ;
	private JTextField calcSolution = new JTextField(10) ;
	
	CalculatorView() {
		JPanel calcPanel = new JPanel() ;
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 200);
		

		calcPanel.add(firstNumber) ;
		calcPanel.add(additionalLabel) ;
		calcPanel.add(secondNumber) ;
		calcPanel.add(calculationButton) ;
		calcPanel.add(calcSolution) ;
		
		this.add(calcPanel) ;
	}
	public int getFirstNumber() {
		return Integer.parseInt(firstNumber.getText()) ;
	}
	public int getSecondNumber() {
		return Integer.parseInt(secondNumber.getText()) ;
	}
	public int getCalcSolution() {
		return Integer.parseInt(calcSolution.getText()) ;
	}
	public void setCalcSolution(int solution) {
		calcSolution.setText(Integer.toString(solution));
	}
	void addCalculationListener(ActionListener listenForCalcButton) {
		calculationButton.addActionListener(listenForCalcButton);
	}
	void displayErrorMessage(String errorMessage) {
		JOptionPane.showMessageDialog(this, errorMessage);
	}
}
