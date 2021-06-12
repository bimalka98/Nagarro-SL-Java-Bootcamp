package coding.blocks;

import java.util.Scanner;

public class SimpleInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		int accSum = 0;
		while(true) {
			int simpleInput = scn.nextInt();
			accSum += simpleInput;
			if(accSum >=0) System.out.println(simpleInput);
			else break;
			
		} 
	}
}
