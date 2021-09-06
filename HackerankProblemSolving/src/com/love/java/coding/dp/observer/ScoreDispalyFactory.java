package com.love.java.coding.dp.observer;

public class ScoreDispalyFactory {
	
	public static Observer getDisplay(String name) {
		
		
		switch(name) {
		
		case "A": return new AverageScoreDisplay();
		
		case "C": return new CurrentScoreDisplay();
		
		default: return null;
		
		}
		
	}

}
