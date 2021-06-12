package coding.blocks;

import java.util.Scanner;

public class reverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        // Your Code Here
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		int number = scn.nextInt();
		int revNumber = 0;
		while(number !=0){
			int remainder = number%10;
			revNumber = revNumber*10 + remainder;
			number /=10;
		}
		System.out.println(revNumber);

	}

}
