package coding.blocks;

import java.util.Scanner;

public class GenerateParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		printBalanceParantheses(n, 0, 0, "");
	}
	public static void printBalanceParantheses(int n, int obc, int cbc, String ans) {
		if(obc == n && cbc == n) {
			System.out.println(ans);
			return;
		}
		// swap the conditional statements to print in the reverse order
		if(obc > cbc) {
			printBalanceParantheses(n, obc, cbc+1, ans + ')');
		}
		if(obc < n) {
			printBalanceParantheses(n, obc+1, cbc, ans + '(');
		}		
	}

}
