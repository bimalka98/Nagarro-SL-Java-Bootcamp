package bootcamp.day3;

import java.util.Scanner;

public class NumDigits {

	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		int number = scn.nextInt();
		int digit = scn.nextInt();
		int count = numDigits(number, digit);
		System.out.println(count);

    }

		public static int numDigits(int number, int digit) {
		int count = 0;
		while(number !=0) {
			int d = number%10;
			if(d==digit){
				count++;
			}
			number /=10;	
		}
		return count;
	}

}
