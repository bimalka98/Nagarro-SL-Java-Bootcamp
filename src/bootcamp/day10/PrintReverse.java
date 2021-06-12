package bootcamp.day10;

public class PrintReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printDecreasing(5);
		System.out.println("===========");
		printInreasing(5);
	}
	
	public static void printDecreasing(int num) {
		if(num == 0) return;
		// own work first
		System.out.println(num);
		// recursion next
		printDecreasing(num -1);
	}
	public static void printInreasing(int num) {
		if(num == 0) return;
		// recursion first
		printInreasing(num -1);
		// own work next
		System.out.println(num);	
	}
	
	
	

}
