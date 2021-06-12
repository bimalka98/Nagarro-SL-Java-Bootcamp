package bootcamp.day6;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,5,6,-8,45};
		
		for(int x:arr) System.out.print(x + " ");
		System.out.println("\n--------------------");
		
		// algorithm one
		for(int i = 0; i < arr.length/2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length-1 -i];
			arr[arr.length-1 -i] = temp;
		}
		
		for(int x:arr) System.out.print(x + " ");
		System.out.println("\n--------------------");
		
		// reverse array using the user defined function 
		reverseArray(arr);
		for(int x:arr) System.out.print(x + " ");
	}
	
	// function two
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
