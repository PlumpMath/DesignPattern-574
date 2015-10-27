package decoratorPattern;

public class Mozzarella extends ToppingDecorator {

	public Mozzarella(Pizza newPizza) {
		super(newPizza);
		System.out.println("Adding Dough") ;
		System.out.println("Adding Mozzarella") ;
	}
	

	public String getDescription() {
		// TODO Auto-generated method stub
		return tempPizza.getDescription() + ", Mozzarella";
	}

	public double getCost() {
		// TODO Auto-generated method stub
		return tempPizza.getCost() + .50;
	}
}
