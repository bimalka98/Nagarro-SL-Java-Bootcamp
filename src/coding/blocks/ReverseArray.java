package coding.blocks;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		int nums = scn.nextInt();
		int[] numbers = new int[nums];
		for(int i =0; i < nums; i++) numbers[i] = scn.nextInt();
		reverseArray(numbers);
		for(int x: numbers) System.out.print(x + " ");
		
		

	}
	
//	public static void printArr
//	
//	public static void reverseRecursively(int[] array) {
//		if (array.length ==1) System.out.println();
//		
//	}
	public static void reverseArray(int[] array) {
		int leftIndex = 0;
		int rightIndex = array.length -1 ;
		while(leftIndex < rightIndex) {
			int temp = array[leftIndex];
			array[leftIndex] = array[rightIndex];
			array[rightIndex] = temp;
			
			leftIndex++;
			rightIndex--;
		}
	}

}
