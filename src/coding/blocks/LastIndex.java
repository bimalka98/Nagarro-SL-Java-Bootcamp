package coding.blocks;

import java.util.Scanner;

public class LastIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int[] array = new int[N];
		for(int i =0; i < N; i++) array[i] = scn.nextInt();
		int M = scn.nextInt();
		System.out.println(findIndex(array, array.length -1,M));
		
	}
	// target is to find the last occurrence.
	// search starting from the end.
	// game closed.
	public static int findIndex(int[] array, int currentIndex, int key) {
		if(currentIndex== -1) return -1;
		if(key == array[currentIndex]) return currentIndex;
		else {
			return findIndex(array, currentIndex -1, key);
		}
	}

}
