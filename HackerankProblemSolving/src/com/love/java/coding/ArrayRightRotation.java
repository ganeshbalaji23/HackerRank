package com.love.java.coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayRightRotation {

	public static void main(String[] args) {
		
		int arrSize = 5;
		int noOfRotations = 4;
		int[] array = new int[] {1, 2, 3, 4, 5};
		
		List<Integer> inputList = Arrays.stream(array).boxed().collect(Collectors.toList());
		
		int[] outputArr = rotateArrayRight(array, noOfRotations);
		List<Integer> outList = rotateListRight(inputList, noOfRotations);
		System.out.println(Arrays.stream(outputArr).boxed().map(Object::toString).collect(Collectors.joining(" ")));
		System.out.println(outList.stream().map(Object::toString).collect(Collectors.joining(" ")));
	}

	private static List<Integer> rotateListRight(List<Integer> inputList, int noOfRotations) {
		while(noOfRotations>0){
			int numToShift = inputList.get(0);
			inputList.remove(0);
			inputList.add(numToShift);
			noOfRotations--;
		}
		return inputList;
	}

	private static int[] rotateArrayRight(int[] array, int noOfRotations) {
		// TODO Auto-generated method stub
		
		int size = array.length;
		
		while(noOfRotations>0){
			int numToShift = array[size-1];
			for(int j=size-1; j>0; j--) {
				array[j] = array[j-1];
			}
			array[0] = numToShift;
			noOfRotations--;
		}
		
		return array;
	}
}
