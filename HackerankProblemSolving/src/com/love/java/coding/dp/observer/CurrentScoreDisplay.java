package com.love.java.coding.dp.observer;

public class CurrentScoreDisplay implements Observer {

	private int runs, wickets;
	private float overs;

	@Override
	public void updateData(int runs, float overs, int wickets) {
		this.runs = runs;
		this.wickets = wickets;
		this.overs = overs;
		display();
	}

	public void display() {
		System.out
				.println("\nCurrent Score Display:\n" + "Runs: " + runs + "\nWickets:" + wickets + "\nOvers: " + overs);
	}

}
