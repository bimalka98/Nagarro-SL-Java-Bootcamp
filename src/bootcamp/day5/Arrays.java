package bootcamp.day5;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int[] batch = {18,56,20};
		System.out.println(batch);
		
		for(int index = 0; index < batch.length ;index++) {
			System.out.print(batch[index]+ " ");
		}
		*/
		int[] ages = new int[4];
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		for(int index = 0; index < ages.length ;index++) {
			ages[index] = scn.nextInt();
		}
		for(int index = 0; index < ages.length ;index++) {
			System.out.print(ages[index]+ " ");
		}
		
		// Enhanced for loop
		for(int element : ages) System.out.println(element);
		
	}

}
