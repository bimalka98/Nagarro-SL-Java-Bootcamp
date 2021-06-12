package coding.blocks;

import java.util.Scanner;

public class FindRootsQuadratic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")		
		Scanner scn = new Scanner(System.in);
		int a, b, c;
		a = scn.nextInt();
		b = scn.nextInt();
		c = scn.nextInt();
		
		int delta = b*b - 4*a*c;
		
		
		if(delta >0) {
			System.out.println("Real and Distinct");
			int r1 = (int) ((-b - Math.sqrt(delta))/(2*a));
			int r2 = (int) ((-b + Math.sqrt(delta))/(2*a));
			System.out.println(r1 + " "+ r2);
			
		}else if(delta ==0) {
			System.out.println("Real and Equal");
			int r = -b/(2*a);
			System.out.println(r + " " + r);
					
		}else System.out.println("Imaginary");

	}

}
