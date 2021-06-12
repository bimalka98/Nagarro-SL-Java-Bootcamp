package coding.blocks;

import java.util.Scanner;

public class SumOfEvenOddPlaced {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		long number = scn.nextInt();
		long revNumber = 0;
		while(number >0){
			long remainder = number%10;
			revNumber = revNumber*10 + remainder;
			number /=10;
		}
//		System.out.println(revNumber);
		int place = 1;
		int evenSum =0;
		int oddSum = 0;
		while(revNumber>0) {
			long remaider = revNumber%10;
			if(place%2 == 0) {
				evenSum+= remaider;
			}else {
				oddSum+= remaider;
			}
			revNumber /=10;
			place++;
		}
		System.out.println(evenSum);
		System.out.println(oddSum);

	}

}
