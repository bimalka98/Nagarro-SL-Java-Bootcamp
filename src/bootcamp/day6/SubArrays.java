package bootcamp.day6;

public class SubArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3};
		printSubArrays(arr);

	}

	public static void printSubArrays(int[] array) {
		for(int start = 0; start < array.length; start++) {
			for(int end = start; end < array.length; end++) {
				int sum = 0;
				System.out.print("[ ");
				for(int i = start; i<= end; i++) {
					System.out.print(array[i]+ " ");
					sum += array[i];
				}
				System.out.print("] Sum of subarray : " + sum);
				System.out.println();
			}
		}
	}
}
