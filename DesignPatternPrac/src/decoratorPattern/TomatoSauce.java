package decoratorPattern;

public class TomatoSauce extends ToppingDecorator {

	public TomatoSauce(Pizza newPizza) {
		super(newPizza);
		System.out.println("Adding Sauce") ;
	}
	

	public String getDescription() {
		// TODO Auto-generated method stub
		return tempPizza.getDescription() + ", Tomato Sauce";
	}

	public double getCost() {
		// TODO Auto-generated method stub
		return tempPizza.getCost() + .35;
	}
}
