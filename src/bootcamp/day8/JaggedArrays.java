
	package bootcamp.day8;

public class JaggedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] jaggedArray = {
				{1,2,3},
				{4,5,6,7},
				{8,9},
				{10,11,12,13,14}
		};
		for(int row =0; row < jaggedArray.length; row++) {
			for(int column =0; column < jaggedArray[row].length; column++) {
				System.out.print(jaggedArray[row][column]+ " ");
			}
			System.out.println();
		}

	}

}
