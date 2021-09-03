package com.love.java.coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.swing.event.MouseInputListener;

public class NewYearChaos {

	public static void main(String[] args) {

		int noOfTestCases = 2;
		
		int noOfPersonsOne = 8;
		
		int noOfPersonsTwo = 5;
		
		int[] finalArrOne = new int[] {5, 1, 2, 3, 7, 8, 6, 4};
		
		int[] finalArrTwo = new int[] {1, 2, 5, 3, 7, 8, 6, 4};
		
		List<List<Integer>> inputList = new ArrayList<>();
		
		List<Integer> inputListOne = Arrays.stream(finalArrOne).boxed().collect(Collectors.toList());
		
		List<Integer> inputListTwo = Arrays.stream(finalArrTwo).boxed().collect(Collectors.toList());
		
		inputList.add(inputListOne);
		inputList.add(inputListTwo);
		
		for(int i = 0; i<noOfTestCases; i++) {
			minimumBribes(inputList.get(i));
		}
		
		
		
		
		
	}

	private static void minimumBribes(List<Integer> inputList) {
		
		/*
		 * List<Integer> defaultList = new ArrayList<Integer>();
		 * 
		 * for (int x = 1; x <= inputList.size(); x++) { defaultList.add(x); }
		 */
		
		int totalBribing = 0;
		
		for (int i = 1; i <= inputList.size(); i++) {
			int previousIndex = i-1;//defaultList.indexOf(i);
			int currentIndex = inputList.indexOf(i);
			
			if(previousIndex > currentIndex) {
				int noOfBribes = previousIndex - currentIndex;
				if(noOfBribes > 2) {
					totalBribing = -1;
					break;
				} else {
					totalBribing += noOfBribes;
				}
			}
			
		}
		
		if (totalBribing == -1) {
			System.out.println("Too chaotic");
		} else {
			System.out.println(totalBribing);
		}
		
	}

}
