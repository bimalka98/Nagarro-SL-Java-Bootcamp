package coding.blocks;

import java.util.Scanner;

public class MaxOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		int nums = scn.nextInt();
		int[] numbers = new int[nums];
		for(int i =0; i < nums; i++) numbers[i] = scn.nextInt();
		int max = numbers[0];
		for(int i = 1; i< numbers.length; i++) {
			if( numbers[i] > max) {
				max = numbers[i];
			}
		}
		System.out.println(max);

	}
	

}
