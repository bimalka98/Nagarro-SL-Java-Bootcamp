package coding.blocks;

import java.util.Scanner;

public class WavePrintRowwise {

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
			
			for(int row = 0; row < rows; row++) {
				if(row%2 == 0) {
					// from up down
					for(int col = 0; col < cols; col++) {
						System.out.print(matrix[row][col]+ ", ");
					}
				}else {
					// from down to up
					for(int col = cols -1; col >-1 ; col--) {
						System.out.print(matrix[row][col]+ ", ");
					}
				}
			}
			System.out.print("END");
		}

}
