package coding.blocks;

import java.util.Scanner;

public class MazepathD {
	static int count = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		long N1 = scn.nextInt();
		long N2 = scn.nextInt();
		travelMaze(0, 0, N1, N2, "");
		System.out.println();
		System.out.println(count);
        count =0;

	}
	
	public static void travelMaze(long currentRow, long currentColumn, long N1, long N2, String path) {
		if(currentRow == N1 -1 && currentColumn == N2 -1) {
			System.out.print(path + " ");
			count ++;
            return;
		}else {
			if(currentRow +1 < N1) {
				travelMaze(currentRow +1, currentColumn, N1, N2, path + 'V');
			}
			if(currentColumn +1 < N2) {
				travelMaze(currentRow, currentColumn +1, N1, N2, path + 'H');
			}
			if(currentColumn +1 < N2 && currentRow +1 < N1) {
				travelMaze(currentRow + 1, currentColumn +1, N1, N2, path + 'D');
			}
		}
	}
	

}
