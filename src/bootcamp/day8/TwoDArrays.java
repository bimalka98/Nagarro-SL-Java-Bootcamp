package bootcamp.day8;

import java.util.Scanner;

public class TwoDArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// by default zeros are filled into the matrix
		Scanner scn = new Scanner(System.in);

		int[][] array2D = new int[4][3];
		//		System.out.println("Number of rows = " + array2D.length); // number of rows
		//		System.out.println("Number of columns = " + array2D[0].length);
		//		System.out.println(array2D[2][2]);
		//		
		//		
		//		System.out.println("Two square brackets indicates there is 2D array at address : " + array2D);
		//		System.out.println("Single square bracket indicates there is 1D array at address : " +array2D[0]);
		//		System.out.println("Single square bracket indicates there is 1D array at address : " +array2D[1]);


		int[] ar = {1,2,3};
		int[][] arT = {
				{1,2,3},
				{4,5,6},
				{7,8,9},
				{11,12,13}
		};

		//		System.out.println(arT[0] +" "+  arT[1] +" " + arT[2] +" "+arT[3]);


		//		int[][] arT = new int[4][3];
		//		
		//		for(int row = 0; row < arT.length; row++) {
		//			for(int column = 0; column < arT[0].length; column++) {
		//				arT[row][column] = scn.nextInt();
		//			}
		//		}
		System.out.println("===============Matrix===============");
		for(int row = 0; row < arT.length; row++) {
			for(int column = 0; column < arT[0].length; column++) {
				System.out.print(arT[row][column]+ " ");
			}
			System.out.println();
		}
		System.out.println("==========Matrix Transpose==========");
		for (int column = 0; column < arT[0].length; column++){
			for (int row = 0; row < arT.length; row++) {
				System.out.print(arT[row][column]+ " ");
			}
			System.out.println();
		}
		System.out.println("==========Enhanced for Loop==========");
		// at each row there is one dim array
		for(int[] row: arT) {
			// iterate through 1D array
			for(int element: row) {
				System.out.print(element+ " ");
			}
			System.out.println();
		}
		System.out.println("=========Print Wave Row wise========");
		// row will remain the same
		for(int row = 0; row < arT.length; row++) {
			// print order of each row will change
			if(row%2 == 0) {
				for(int column = 0; column < arT[0].length; column++) {
					System.out.print(arT[row][column]+ " ");
				}
			}else {
				for(int column = arT[0].length -1; column >-1 ; column--) {
					System.out.print(arT[row][column]+ " ");
				}
			}
			System.out.println();	
		}
		
		System.out.println("=========Print Wave Col wise========");
		for(int column = 0; column < arT[0].length; column++) {
			if(column%2 == 0) {
				// from up down
				for(int row = 0; row < arT.length; row++) {
					System.out.print(arT[row][column]+ " ");
				}
			}else {
				// from down to up
				for(int row = arT.length -1; row >-1 ; row--) {
					System.out.print(arT[row][column]+ " ");
				}
			}
			System.out.println();
		}
	}
}
