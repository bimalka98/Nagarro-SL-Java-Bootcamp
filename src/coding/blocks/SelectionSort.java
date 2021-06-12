package coding.blocks;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		// taking inputs
		int nums = scn.nextInt();
		int[] numbers = new int[nums];	
		for(int i =0; i< nums;i++) numbers[i] = scn.nextInt();
		sort(numbers);
		for(int x: numbers) System.out.println(x);
		
	}
	
	public static void sort(int[] array) {
		int pointer = 0;
		//last element is already sorted
		while(pointer < array.length -1) {
			int minIndex = findMin(array, pointer);
			//Swapping the minimum and the first element of the 
			// unsorted array.
			int temp = array[pointer];
			array[pointer] = array[minIndex];
			array[minIndex] = temp;
			pointer++;
		}
	}
	
	public static int findMin(int[] array2, int start) {
		// finding minimum of the part of the array
		int minimum = array2[start];
		int minIndex = start;
		for(int i= start+1; i < array2.length; i++) {
			if(array2[i] < minimum) {
				minimum = array2[i];
				minIndex = i;
			}
		}
		return minIndex; 
	}

}
