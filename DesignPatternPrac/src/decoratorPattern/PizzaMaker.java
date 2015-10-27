package decoratorPattern;

public class PizzaMaker {
	public static void main(String[] args) {
		Pizza basicPizza = new TomatoSauce(new Mozzarella(new PlainPizza())) ;
		
		System.out.println("Ingredients: " + basicPizza.getDescription()) ;
		System.out.println("Total Cose: " + basicPizza.getCost()) ;
		
	}
}
