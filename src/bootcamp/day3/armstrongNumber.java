package bootcamp.day3;

import java.util.Scanner;

/*
 * number equals to the sum of the digits raised to the power 
 * equals to the number of digits in the number
 * */

public class armstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		int number = scn.nextInt();
		boolean output = isArmstrong(number);
		System.out.println(output);
		
	}
	
	public static int numDigits(int number) {
		int n = 0;
		while(number !=0) {
			number /=10;
			n++;
		}
		return n;
	}
	
	public static boolean isArmstrong(int number) {

		int n = numDigits(number);
		
		int sum = 0;
		int num1 = number;
		while(num1 != 0) {
			int temp = num1 % 10;
			sum += (int) Math.pow(temp, n);
			num1 /= 10;
		}
		return sum==number;
	}

}
