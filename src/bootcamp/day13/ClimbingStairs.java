package bootcamp.day13;

import java.util.Arrays;
import java.util.Scanner;

public class ClimbingStairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		long[] ways = new long[n +1];
		Arrays.fill(ways, -1);
		System.out.println(climbStairs(0, n, ways));
	}
	
	public static long climbStairs(int pos, int n,  long[] ways) {
		if(n <=0) return -1; // invalid input stairs
		if(pos == n) return 1; //reached top: we have got a legal way.
		if(pos > n) return 0; // taken a legal step: there's no way
		// using the previous experience
		if(ways[pos] != -1) return ways[pos];
		// never seen conditions
		long w1 = climbStairs(pos +1, n, ways); // choice one
		long w2 = climbStairs(pos +2, n, ways); // choice two
		// total ways is the sum of two choices
		long totalways = w1 + w2;
		ways[pos] = totalways;
		return ways[pos];	
	} 
}
