package com.love.java.coding.dp.observer;

public class ObserverMain {
	
	public static void main(String args[])
	{
		// create objects for testing
		Observer averageScoreDisplay = ScoreDispalyFactory.getDisplay("A");
		Observer currentScoreDisplay = ScoreDispalyFactory.getDisplay("C");

		// pass the displays to Cricket data
		CricketData cricketData = new CricketData();

		// register display elements
		cricketData.registerObserver(averageScoreDisplay);
		cricketData.registerObserver(currentScoreDisplay);

		// in real app you would have some logic to
		// call this function when data changes
		cricketData.dataChanged();

		// remove an observer
		cricketData.unregisterObserver(averageScoreDisplay);

		// now only currentScoreDisplay gets the
		// notification
		cricketData.dataChanged();
	}

}
