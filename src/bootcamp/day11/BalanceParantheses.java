package bootcamp.day11;

public class BalanceParantheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printBalanceParantheses(4, 0, 0, "");

	}
	
	public static void printBalanceParantheses(int n, int obc, int cbc, String ans) {
		if(obc == n && cbc == n) {
			System.out.println(ans);
			return;
		}
		if(obc < n) {
			printBalanceParantheses(n, obc+1, cbc, ans + '(');
		}
		if(obc > cbc) {
			printBalanceParantheses(n, obc, cbc+1, ans + ')');
		}
	}
}
