package bootcamp.day4;

import java.util.Scanner;

public class LowerUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		
		char character = scn.next().charAt(0);

		
		if(character >= 'A' && character <= 'Z') {
			System.out.println("U");
		}else if (character >= 'a' && character <= 'z'){
			System.out.println("L");
		}else {
			System.out.println("I");
		}
	}

	
}
