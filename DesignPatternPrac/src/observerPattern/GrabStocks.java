package observerPattern;

public class GrabStocks {
	public static void main(String[] args) {
		StockGrabber stockGrabber = new StockGrabber() ;
		
		StockObserver observer1 = new StockObserver(stockGrabber) ;
		
		stockGrabber.setIBMPrice(197.00); 
		stockGrabber.setAAPLPrice(234.23) ;
		stockGrabber.setGoogPrice(210.23);
	}
}
