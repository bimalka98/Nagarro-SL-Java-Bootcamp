package bootcamp.day7;



public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {-5,-8,2,6,-4};
		sort(arr, 5);
		for(int x: arr) System.out.println(x);
	}
	
	public static void sort(int[] array, int n) {
		for(int pass = 1; pass <= n -1; pass++) {
			for(int curr =0; curr < n -pass; curr++) {
				if(array[curr] > array[curr +1]) {
					int temp = array[curr];
					array[curr] = array[curr +1];
					array[curr +1] = temp;
				}
			}
		}
	}

}
