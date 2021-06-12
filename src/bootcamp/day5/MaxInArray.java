package bootcamp.day5;

public class MaxInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,5,6,-8};
		int maximum = maxInArray(arr);
		System.out.println(maximum);
		int maxindex = maxIndex(arr);
		System.out.println(maxindex);

	}
	public static int maxInArray(int[] array) {
		int max = Integer.MIN_VALUE;
		for(int x: array) {
			if(max < x) max = x;
		}
		return max;		
	}
	
	public static int maxIndex(int[] array) {
		int max = Integer.MIN_VALUE;
		int max_index = 0;
		for(int i=0; i <array.length; i++) {
			if(max < array[i]) {
				max = array[i];
				max_index = i;
			}
		}
		return max_index;
				
		
	}

}
