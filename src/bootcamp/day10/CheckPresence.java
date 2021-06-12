package bootcamp.day10;

public class CheckPresence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int[] ar = {};
//		System.out.println(ar.length);
		int[] array = {4,10,5,4,20,4};
		System.out.println(firstOccurence(array, 0, 11));

	}
	
	public static int firstOccurence(int[] array, int CurrentIndex, int value) {
		// base case 1: value is not found within array.
		// to avid "Index i out of bounds for length i" error
		if(CurrentIndex == array.length) return -1;
		// base case 2 : value is found. 
		if(array[CurrentIndex] == value) return CurrentIndex;
		// move to the next CurrentIndex: reducing the size of the array 
		return firstOccurence(array, CurrentIndex +1, value);
	}
	
}
