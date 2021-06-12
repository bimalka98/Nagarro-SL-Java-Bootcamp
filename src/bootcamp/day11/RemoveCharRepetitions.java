package bootcamp.day11;

import java.util.Scanner;
// only duplicates
public class RemoveCharRepetitions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		String word = scn.next();
		removeDuplicates(word, "");

	}
	
	public static void removeDuplicates(String input, String ans) {
		
		if(input.length()==0) {
			System.out.println(ans);
			return;
		}
		else if(input.length()==1) {
			System.out.println(ans+ input);
			return;
		}
		else {
			if(input.charAt(0) != input.charAt(1)) {
				removeDuplicates(input.substring(1), ans + input.charAt(0));
			}else {
				removeDuplicates(input.substring(2), ans + input.charAt(0));
			}
		}
	}

}
