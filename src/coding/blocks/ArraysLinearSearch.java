package coding.blocks;
import java.util.Scanner;


public class ArraysLinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		
		Scanner scn = new Scanner(System.in);
		// taking inputs
		int nums = scn.nextInt();
		int[] numbers = new int[nums];
		for(int i =0; i < nums; i++) numbers[i] = scn.nextInt();
		// taking number to be found
		int find = scn.nextInt();
		
		boolean found = false;
		for(int i = 0; i < numbers.length; i++) {
			if( numbers[i] == find) {
				System.out.println(i);
				found = true;
				break;
			}
		}
		if(! found) System.out.println(-1);
		

	}

}
