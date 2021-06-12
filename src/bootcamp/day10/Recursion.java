package bootcamp.day10;

import java.util.Scanner;

public class Recursion {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		int number = scn.nextInt();
		
		System.out.println(factorial(number));

	}
	
	public static int factorial(int number) {
		if(number ==0 || number == 1) return 1;
		return number*factorial(number -1);
	}
	

}
