package bootcamp.day7;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-5,-8,2,6,-4};
//		System.out.println(arr[findMin(arr,2 )]);		
		sort(arr);
		for(int x: arr) System.out.print(x+ " ");
		
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
