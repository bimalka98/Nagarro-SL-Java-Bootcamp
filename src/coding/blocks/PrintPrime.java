package coding.blocks;

import java.util.Scanner;

public class PrintPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		if(N >=2) {
			for(int i=2; i <= N; i++) {
				boolean isprime = true;
				for(int j =2; j < i; j++) {
					if(i%j ==0) {
						isprime = false;
						break;
					}
				}
				if(isprime) System.out.println(i);
			}
		}
		

	}

}
