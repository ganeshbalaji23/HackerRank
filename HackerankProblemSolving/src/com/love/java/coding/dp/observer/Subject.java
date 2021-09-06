package com.love.java.coding.dp.observer;

public interface Subject {
	
	public void registerObserver(Observer o);
	
	public void unregisterObserver(Observer o);
	
	public void notifyObservers();

}
