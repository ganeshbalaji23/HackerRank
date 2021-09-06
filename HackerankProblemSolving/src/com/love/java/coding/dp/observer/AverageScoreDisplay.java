package com.love.java.coding.dp.observer;

public class AverageScoreDisplay implements Observer {

	private float runRate;
    private int predictedScore;
  
	@Override
	public void updateData(int runs, float overs, int wickets) {
		this.runRate =(float)runs/overs;
        this.predictedScore = (int)(this.runRate * 50);
        display();
    }
  
    public void display()
    {
        System.out.println("\nAverage Score Display: \n"
                           + "Run Rate: " + runRate +
                           "\nPredictedScore: " +
                           predictedScore);
    }

}
