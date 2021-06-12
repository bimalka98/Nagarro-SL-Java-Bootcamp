package coding.blocks;

import java.util.Scanner;

public class StringCompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		String word = scn.next();
		
		// compression
		char prevChar = word.charAt(0);
		int charCount = 1;
		for(int i=1; i < word.length(); i++) {
			if(word.charAt(i) == prevChar) {
				charCount++;
			}
			else {
				System.out.print(prevChar);
				if(charCount==1) System.out.print("");
				else System.out.print(charCount);
				prevChar = word.charAt(i);
				charCount =1;
			}
		}
		System.out.print(prevChar);
		if(charCount==1) System.out.print("");
		else System.out.print(charCount);
		

	}

}
