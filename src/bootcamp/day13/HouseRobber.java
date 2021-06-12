package bootcamp.day13;

import java.util.Arrays;

public class HouseRobber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] house = {2,7,9, 3, 1,5,8,9,6,5,4,1,2,3,5,8,1,6,6};
		int[] memo = new int[house.length +1];
		Arrays.fill(memo, -1);
		System.out.println(robHouse(house, 0, memo));

	}
	public static int robHouse(int[] houses, int position, int[] memo) {
		// base case no more houses
		if(position >= houses.length) return 0;		
		if(memo[position] != -1) return memo[position];
		// rob the house 
		int c1 = houses[position] + robHouse(houses, position +2, memo);	
		// leave the house
		int c2 = 0 + robHouse(houses, position +1, memo);
		// need to rob maximum amount of money
		return Math.max(c1, c2);
	}

}
