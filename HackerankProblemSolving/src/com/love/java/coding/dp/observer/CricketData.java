package com.love.java.coding.dp.observer;

import java.util.ArrayList;
import java.util.List;

public class CricketData implements Subject {

	private List<Observer> observers = new ArrayList<>();

	private int runs;
	private int wickets;
	private float overs;

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);

	}

	@Override
	public void unregisterObserver(Observer o) {
		observers.remove(o);

	}

	@Override
	public void notifyObservers() {

		for (Observer o : observers) {
			o.updateData(runs, overs, wickets);
		}

	}

	private int getLatestRuns() {
		// return 90 for simplicity
		return 90;
	}

	// get latest wickets from stadium
	private int getLatestWickets() {
		// return 2 for simplicity
		return 2;
	}

	// get latest overs from stadium
	private float getLatestOvers() {
		// return 90 for simplicity
		return (float) 10.2;
	}

	// This method is used update displays
	// when data changes
	public void dataChanged() {
		// get latest data
		runs = getLatestRuns();
		wickets = getLatestWickets();
		overs = getLatestOvers();

		notifyObservers();
	}

}
