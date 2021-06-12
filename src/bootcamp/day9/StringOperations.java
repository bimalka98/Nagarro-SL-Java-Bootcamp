package bootcamp.day9;

import java.util.Scanner;

public class StringOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "hello";
		System.out.println(str);
		
		//print char at a given index
		System.out.println(str.charAt(0));
		
		
		//print char at last index
		System.out.println(str.charAt(str.length() -1));
		
		// substring of a string
		for(int i =0; i < str.length(); i++) {
			for(int j =i; j < str.length(); j++) {
				//System.out.println(str.substring(i, j+1));
			}
		}
		
		System.out.println(str.substring(2));
		
		str = "elephant";
		// print the index of the first occurrence
		System.out.println(str.indexOf('e'));
		
		// print the index of the last occurrence
		System.out.println(str.lastIndexOf('e'));
		
		// check starting char
		System.out.println("Is string starts with el: "+ str.startsWith("el"));
		System.out.println("Is string starts with El: "+str.startsWith("El")); // case sensitive
		
		//
		System.out.println("Is string ends with nt: "+str.endsWith("nt"));
		System.out.println(str);
		
		System.out.println("===============================================");
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		// making strings inside the intern pool
		String s1 = "Yo!"; // in the intern pool
		String s2 = "Yo!"; // in the intern pool: points to the previously made string
		String s3 = scn.next(); // in the normal heap memory: at a new address
		
		System.out.println("Is s1 and s2 equals: ");
		System.out.println(s1==s2); // return true since the location is the same
		System.out.println("Is s1 and s3 equals: Memory address comparison");
		System.out.println(s1==s3); // two addresses
		System.out.println("Is s1 and s3 equals: Value comparison");
		System.out.println(s1.equals(s3));
		
		// Making a new string hard coded: without checking the string intern pool
		String s4 = new String("Yo!"); // forced to create a new string at new address
		System.out.println(s1 == s4);
		
		
		
				
		
	}

}

