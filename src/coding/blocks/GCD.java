package coding.blocks;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		int N1 = scn.nextInt();
		int N2 = scn.nextInt();
		
		int max = N1;
		if(N2 > N1) max = N2;
		int[] primes = new int[max];
		
		for(int i=2; i <= max; i++) {
			boolean isprime = true;
			for(int j =2; j < i; j++) {
				if(i%j ==0) {
					isprime = false;
					break;
				}
			}
			if(isprime) primes[i] = i;
		}
		
		
		int[] N1factors = primeFacorize(N1, primes, max);
		int[] N2factors = primeFacorize(N2, primes, max);
		
		int gcd = 1;
		for(int i =0; i < max; i++) {
			int min = N1factors[i];
			if(N2factors[i] < min) min = N2factors[i];
			gcd *= Math.pow(i,min);
		}
		
		System.out.println(gcd);
		
		
//		for(int x: N1factors) System.out.print(x + " ");
//		int num = 1;
//		for(int i = 0; i < N1factors.length; i++) {
//			num *= Math.pow(i, N1factors[i]);
//		}
//		System.out.println(num);
	
	}
	
	public static int[] primeFacorize(int number, int[] primes, int max) {
		int[] factors = new int[max];
		for(int i= 0; i < primes.length; i++) {
			if(primes[i] != 0) {
				int factor = primes[i];
				while(number%factor == 0) {
					factors[factor]++;
					number /= factor;
				}
			}
		}
		return factors;
	}

}
