package singletonPattern;

import java.util.Arrays ;
import java.util.Collections ;
import java.util.LinkedList;

public class Singleton {
	private static Singleton firstInstance = null ;
	
	String[] scrabbleLetters = {"a" , "a" ,"a" ,"a" ,"a" ,"a" , "b", "c", "d"} ;
	private LinkedList<String> letterList = 
			new LinkedList<String>(Arrays.asList(scrabbleLetters)) ;
	static boolean firstThread = true ;
	private Singleton() { 	}
	public static Singleton getInstance() { // synchronized keyword - very slow
		if(firstInstance == null) {
			if(firstThread) {
				firstThread = false ;
				Thread.currentThread() ;
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			synchronized(Singleton.class)  {
				if(firstInstance == null) {
					firstInstance = new Singleton() ;
					Collections.shuffle(firstInstance.letterList);
				}
			}
		}
		return firstInstance ;
	}
	
	public LinkedList<String> getLetterList() {
		return firstInstance.letterList ;
	}
	public LinkedList<String> getTiles(int howManyTiles) {
		LinkedList<String> tilesToSend = new LinkedList<String>() ;
		for(int i = 0; i < howManyTiles; i++) {
			tilesToSend.add(firstInstance.letterList.remove(0)) ;
		}
		return tilesToSend ;
	}
}
