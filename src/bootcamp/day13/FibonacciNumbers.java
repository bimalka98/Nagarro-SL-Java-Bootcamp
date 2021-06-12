package bootcamp.day13;

import java.util.Arrays;
import java.util.Scanner;

public class FibonacciNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		int place = scn.nextInt();
		long[] array = new long[place +1];
		Arrays.fill(array, -1);
		System.out.println(fibonacciNumberAt(place, array));

	}
	
	public static long fibonacciNumberAt(int place, long[] memo) {
		long num1, num2, output;
		if(place == 0 || place == 1) return place;
		if(memo[place] != -1) return memo[place];
		num1 = fibonacciNumberAt(place -1, memo);
		num2 = fibonacciNumberAt(place -2, memo);
		output = num1 + num2;
		// memorization for overlapping subproblems
		memo[place] = output;
		return output;
	}
}
