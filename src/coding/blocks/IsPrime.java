package coding.blocks;

import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		int number = scn.nextInt();
		
		boolean isprime = true;
		for(int i =2; i < number; i++) {
			if(number%i ==0) {
				isprime = false;
				break;
			}
		}
		if(isprime) {
			System.out.println("Prime");
		}else {
			System.out.println("Not Prime");
		}

	}

}
