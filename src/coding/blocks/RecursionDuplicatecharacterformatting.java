package coding.blocks;

import java.util.Scanner;

public class RecursionDuplicatecharacterformatting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		removeDuplicate(str, "");
	}
	
	public static void removeDuplicate(String input, String ans) {
		if(input.length()==0) {
			System.out.println(ans);
			return;
		}else if(input.length()==1) {
			System.out.println(ans+ input);
			return;
		}else {
			if(input.charAt(0) == input.charAt(1)) {
				removeDuplicate(input.substring(2), ans + input.charAt(0) + '*' + input.charAt(1));
			}else {
				removeDuplicate(input.substring(1), ans + input.charAt(0));
			}
		}
	}

}
