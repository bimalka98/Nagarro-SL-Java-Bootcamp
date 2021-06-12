package bootcamp.day14;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for(int i=0; i< n; i++) arr[i] = scn.nextInt();
		int value = scn.nextInt();
		System.out.println(binarySearch(0, n -1, value, arr));
	}
	public static int binarySearch(int left, int right, int value, int[] array ) {
		// not found condition
		if(left > right) return -1; 
		// finding algorithm
		int middle = (left + right) /2;
		// comparison
		if(array[middle] == value) {
			return middle;
		}else if (value < array[middle] ) {
			// discarding middle element
			return binarySearch(left, middle -1, value, array);
		}else {
			// discarding middle element
			return binarySearch(middle +1, right, value, array);
		}
	}

}
