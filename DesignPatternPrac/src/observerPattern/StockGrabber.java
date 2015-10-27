package observerPattern;
import java.util.ArrayList;

public class StockGrabber implements Subject {
	private ArrayList<Observer> observers ;
	private double ibmPrice ;
	private double aaplPrice ;
	private double googPrice ;
	public StockGrabber() {
		observers = new ArrayList<Observer>() ;
	}
	@Override
	public void register(Observer newObserver) {
		// TODO Auto-generated method stub
		observers.add(newObserver) ;
	}

	@Override
	public void unregister(Observer deleteObserver) {
		// TODO Auto-generated method stub
		int deleteIndex = observers.indexOf(deleteObserver) ;
		System.out.println("Observer " + (deleteIndex + 1) + "deleted") ;
		observers.remove(deleteIndex) ;
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		for(Observer observer : observers) {
			observer.update(ibmPrice, aaplPrice, googPrice);
		}
	}
	public void setIBMPrice(double newIBMPrice) {
		this.ibmPrice = newIBMPrice ;
		notifyObserver();
	}
	public void setAAPLPrice(double newAAPLPrice) {
		this.aaplPrice = newAAPLPrice ;
		notifyObserver();
	}
	public void setGoogPrice(double newGoogPrice) {
		this.googPrice = newGoogPrice ;
		notifyObserver();
	}
}
