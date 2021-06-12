package bootcamp.day5;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] registered = new boolean[3];
		for(boolean x: registered)System.out.println(x);
		
		int[] arr1 = {1,2,3};
		int[] arr2 = {4,5,6};
		print(arr1);
		print(arr2);
		for(int i=0; i < arr1.length; i++)swap2Arrays(arr1, arr2, i, i);
		System.out.println("--------------------------");
		print(arr1);
		print(arr2);
		
		
	}
	public static void swapArrays(int[] arr1clone,int[] arr2Clone) {
		int[] temp = arr1clone;
		arr1clone = arr2Clone;
		arr2Clone = temp;
	}
	
	public static void print(int[] array) {
		for(int element: array)System.out.print(element+ " ");
		System.out.println();
	}
	public static void swap2Arrays(int[] arr1clone,int[] arr2Clone, int i, int j) {
		int temp = arr1clone[i];
		arr1clone[i] = arr2Clone[j];
		arr2Clone[j] = temp;
	}
	
	

}
