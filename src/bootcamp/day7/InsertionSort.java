package bootcamp.day7;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub@SuppressWarnings("resource")
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for(int i=0; i< n; i++) arr[i] = scn.nextInt();
		sort(arr);
		for(int x: arr) System.out.print(x + " ");

	}
	
	public static void sort(int[] array) {
		for(int current = 1; current < array.length; current ++) {
			// get one card and compare it with the sorted array's elements 
			int currCard = array[current];
			int preInd = current -1;
			while(preInd >=0 && array[preInd] > currCard) {
				array[preInd +1] = array[preInd];
				preInd--;
			}
			array[preInd +1] = currCard;
		}
	}

}
