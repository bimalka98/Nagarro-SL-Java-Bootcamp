package coding.blocks;

import java.util.Scanner;

public class IsSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int[] array = new int[N];
		for(int i=0; i < N;i++) array[i] = scn.nextInt();
		System.out.println(isSorted(array,0));
	}
	public static boolean isSorted(int[] array, int index) {
		// if the array is sorted last index will be an argument to the function
		if(index == array.length -1) {
			return true;
		}
		// if first two elements are sorted. move to the next two elements
		if(array[index] <= array[index +1]) {
			return isSorted(array, index +1);
		}else {
			// just return false if found at least one mis-order 
			return false;
		}
	}

}
