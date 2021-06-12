package coding.blocks;

import java.util.Scanner;

public class RotateImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int[][] image = new int[N][N];
		for(int row =0; row < N; row++) {
			for(int col =0; col < N; col++) {
				image[row][col] = scn.nextInt();
			}
		}
		// declaring new 2D array to hold the rotated array 
		int[][] rotated = new int[N][N];
		
		for(int i = 0; i < N; i++) {
			for(int j=0;j <N; j++) {
				// swapping locations of the elements
				rotated[N -1 -j][i] = image[i][j];
			}
		}
		// print the array
		for(int[] row: rotated) {
			for(int x : row) {
				System.out.print(x + " ");
			}
			System.out.println();
		}
		

	}

}
