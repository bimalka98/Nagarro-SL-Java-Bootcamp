package coding.blocks;

import java.util.Scanner;

public class ShoppingContest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		int testcases = scn.nextInt();
		for(int i =0; i < testcases; i++) {
			int M = scn.nextInt();
			int N = scn.nextInt();
			String winner = whoWins(M, N);
			System.out.println(winner);
		}
		

	}
	public static String whoWins(int M, int N) {
		String winner = "Aayush";
		int numPhones = 1;
		int count = 1;
		while(M >=0 && N >=0) {
			if(count%2!=0) {
				M -= numPhones;
				winner = "Harshit";
			}else {
				N -= numPhones;
				winner = "Aayush";
			}
			numPhones++;
			count++;
		}
		return winner;
	}

}
