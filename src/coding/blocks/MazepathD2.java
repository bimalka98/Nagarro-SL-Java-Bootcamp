package coding.blocks;

import java.util.Scanner;

public class MazepathD2 {

	static int count = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		long N = scn.nextInt();
		travelMaze(0, 0, N, "");
		System.out.println();
		System.out.println(count);
        count =0;

	}
	
	public static void travelMaze(long currentRow, long currentColumn, long N, String path) {
		if(currentRow == N -1 && currentColumn == N -1) {
            //reached the bottom: stop recursion and print the path
			System.out.print(path + " ");
            // incrementing the public static variable
            // number of possible ways
			count ++;
            return;
		}else {
            // vertical travel
			if(currentRow +1 < N) {
				travelMaze(currentRow +1, currentColumn, N, path + 'V');
			}
            // horizontal travel
			if(currentColumn +1 < N) {
				travelMaze(currentRow, currentColumn +1, N, path + 'H');
			}
			// diagonal travel: if traveler is on the diagonal
			if((currentColumn +1 < N && currentRow +1 < N) && ((currentColumn == currentRow)|| (currentColumn == N-1 - currentRow)) ) {
				travelMaze(currentRow + 1, currentColumn +1, N, path + 'D');
			}
		}
	}

}
