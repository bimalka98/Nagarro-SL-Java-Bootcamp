package coding.blocks;

import java.util.Scanner;

public class WavePrintColumnWise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		int rows = scn.nextInt();
		int cols = scn.nextInt();
		// defining an empty matrix
		int[][] matrix = new int[rows][cols];
		for(int i =0; i <rows; i++) {
			for(int j =0; j <cols; j++) {
				matrix[i][j] = scn.nextInt();
			}
		}
		
		for(int column = 0; column < cols; column++) {
			if(column%2 == 0) {
				// from up down
				for(int row = 0; row < rows; row++) {
					System.out.print(matrix[row][column]+ ", ");
				}
			}else {
				// from down to up
				for(int row = rows -1; row >-1 ; row--) {
					System.out.print(matrix[row][column]+ ", ");
				}
			}
		}
		System.out.print("END");
		

	}

}
