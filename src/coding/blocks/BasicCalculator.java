package coding.blocks;

import java.util.Scanner;

public class BasicCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")		
		Scanner scn = new Scanner(System.in);
		int a,b;
		while(true) {
			char character = scn.next().charAt(0);
			
			if(character== 'x' || character == 'X') break;
			
			else if (character == '+') {
				a = scn.nextInt();
				b = scn.nextInt();
				System.out.println(a+b);				
			}else if (character == '+') {
				a = scn.nextInt();
				b = scn.nextInt();
				System.out.println(a+b);				
			}else if (character == '-') {
				a = scn.nextInt();
				b = scn.nextInt();
				System.out.println(a-b);				
			}else if (character == '*') {
				a = scn.nextInt();
				b = scn.nextInt();
				System.out.println(a*b);				
			}else if (character == '/') {
				a = scn.nextInt();
				b = scn.nextInt();
				System.out.println(a/b);				
			}else if (character == '%') {
				a = scn.nextInt();
				b = scn.nextInt();
				System.out.println(a%b);				
			}else {
				System.out.println("Invalid operation. Try again.");
			}
		}		
	}
}
