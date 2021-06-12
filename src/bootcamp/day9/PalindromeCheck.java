package bootcamp.day9;

import java.util.Scanner;

public class PalindromeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		String word = scn.next();
		boolean output = isPalindrome(word);
		if(output) System.out.println(word + " is a Palindrome");
		else System.err.println(word + " is not a Palindrome");
		
		

	}
	
	public static boolean isPalindrome(String str) {
		int startPointer =0;
		int endPointer = str.length() -1;
		//boolean palindrome = true;
		while(startPointer < endPointer) {
			if(str.charAt(startPointer) != str.charAt(endPointer)) {
//				palindrome =false;
//				break;
				return false;
			}
			startPointer++;
			endPointer--;
		}
//		return palindrome;
		return true;
	}
	

}
