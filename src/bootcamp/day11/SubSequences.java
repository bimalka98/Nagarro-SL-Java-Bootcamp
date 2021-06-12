package bootcamp.day11;

import java.util.Scanner;

public class SubSequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		String word = scn.next();
		printSubsequence(word, "");
	}

	public static void printSubsequence(String input, String answer) {
		//base case
		if(input == "") {
			System.out.println(answer);
			return;
		}
		
		char newChar = input.charAt(0);
		String restOfString = input.substring(1);
		
		// call of exclusion
		printSubsequence(restOfString, answer);
		// call of inclusion
		printSubsequence(restOfString, answer + newChar);
		
	}

}
