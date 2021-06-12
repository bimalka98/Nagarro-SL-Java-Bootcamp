package coding.blocks;

import java.util.Arrays;
import java.util.Scanner;

public class HouseRobber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
        int testCases = scn.nextInt();
        while(testCases >0){
            int numHouses = scn.nextInt();
		    int[] houses = new int[numHouses];
            int[] memo = new int[numHouses +1];
		    Arrays.fill(memo, -1);
		    for(int i =0; i < numHouses; i++) houses[i] = scn.nextInt();
		    System.out.println(robHouse(houses, 0,memo));
            testCases--;
        }
		
	}
	public static int robHouse(int[] houses, int position, int[] memo) {
		// base case no more houses
		if(position >= houses.length) return 0;	
        // if memory available use previous experience
        if(memo[position] != -1) return memo[position];	
		// rob the house and move the next possible house
		int c1 = houses[position] + robHouse(houses, position +2, memo);	
		// leave the house and rob the next house
		int c2 = 0 + robHouse(houses, position +1, memo);
		// need to rob maximum amount of money
        memo[position] = Math.max(c1, c2);
		return memo[position];
	}

}
