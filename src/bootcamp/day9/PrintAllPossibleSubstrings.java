package bootcamp.day9;

import java.util.Scanner;

public class PrintAllPossibleSubstrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
//		Scanner scn = new Scanner(System.in);
//		String word = scn.next();
		String word = "hi bro";
		
		for(int i=0; i < word.length(); i++) {
			for(int j =i; j < word.length(); j++) {
				System.out.println(word.substring(i, j+1));
			}
			System.out.println("-------------------------");
		}
		
		
//		System.out.println("=====another method=====");
//		for(int i=0; i <= word.length() -1; i++) {
//			for(int j =i+1; j <= word.length(); j++) {
//				System.out.println(word.substring(i, j));
//			}
//			System.out.println("-------------------------");
//		}

		
		for(int i=0; i < word.length(); i++) {
			for(int j =i; j < word.length(); j++) {
				String substring = word.substring(i, j+1);
				if(isPalindrome(substring)) System.out.println(substring + " is  a Palindrome");
				else System.err.println(substring + " is not a Palindrome");

			}
			System.out.println("-------------------------");
		}

	}

	public static boolean isPalindrome(String str) {
		int startPointer =0;
		int endPointer = str.length() -1;
		while(startPointer < endPointer) {
			if(str.charAt(startPointer) != str.charAt(endPointer)) {
				return false;
			}
			startPointer++;
			endPointer--;
		}
		return true;
	}
}
