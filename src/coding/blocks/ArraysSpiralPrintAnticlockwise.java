package coding.blocks;

import java.util.Scanner;

public class ArraysSpiralPrintAnticlockwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		int rows = scn.nextInt();
		int cols = scn.nextInt();
		int[][] image = new int[rows][cols];
		for(int row =0; row < rows; row++) {
			for(int col =0; col < cols; col++) {
				image[row][col] = scn.nextInt();
			}
		}
		
		
	}

}
