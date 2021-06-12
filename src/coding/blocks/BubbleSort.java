package coding.blocks;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int[] array = new int[N];
		for(int i=0; i < N;i++) array[i] = scn.nextInt() ;
		bubbleSort(array);
		for(int x: array) System.out.println(x);

	}
	public static void bubbleSort(int[] array) {
		boolean swapped;
		do {	
			swapped = false; // termination condition
			for(int index = 1; index < array.length; index++) {
				// if swap needed program enters to this conditional statement
				if(array[index] < array[index -1]) {
					int temp = array[index];
					array[index] = array[index -1];
					array[index -1] = temp;
					// indicate a swap happened
					swapped = true;
				}
			}
		}
		while(swapped);
	}

}
