package com.love.java.coding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArraysLeftRotation {

	public static void main(String[] args) {
		
		int arrSize = 5;
		int noOfRotations = 4;
		int[] array = new int[] {1, 2, 3, 4, 5};
		
		List<Integer> inputList = Arrays.stream(array).boxed().collect(Collectors.toList());
		
		int[] outputArr = rotateArrayLeft(array, noOfRotations);
		List<Integer> outList = rotateListLeft(inputList, noOfRotations);
		System.out.println(Arrays.stream(outputArr).boxed().map(Object::toString).collect(Collectors.joining(" ")));
		

	}

	private static List<Integer> rotateListLeft(List<Integer> inputList, int noOfRotations) {
		
		while (noOfRotations>0) {
			Integer temp = inputList.get(0);
			inputList.remove(0);
			inputList.add(temp);
			noOfRotations--;
		}
		
		return inputList;
	}

	private static int[] rotateArrayLeft(int[] array, int noOfRotations) {

		while(noOfRotations>0) {
			//Store the value in temp
			int temp = array[0];
			//Shift the values
			for(int j = 0; j<array.length-1; j++) {
				array[j] = array[j+1];
			}
			array[array.length-1] = temp;
			noOfRotations--;
		}
		
		return array;
	}

}
