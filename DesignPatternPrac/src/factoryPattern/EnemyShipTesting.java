package factoryPattern;

import java.util.Scanner;

public class EnemyShipTesting {
	public static void main(String[] args) {
		
		EnemyShip theEnemy = null ;
		EnemyShipFactory factory = new EnemyShipFactory() ;
		Scanner userInput = new Scanner(System.in) ;
		
		String enemyShipOption = "" ;
		
		if(userInput.hasNextLine()) {
			enemyShipOption = userInput.nextLine() ;
			theEnemy =factory.makeEnemyShip(enemyShipOption) ;
		}
		
		doStuffEnemy(theEnemy) ;
		
	}
	public static void doStuffEnemy(EnemyShip anEnemyShip) {
		anEnemyShip.displayEnemyShip();
		anEnemyShip.followHeroShip();
		anEnemyShip.enemyShipShoots();
	}
}
