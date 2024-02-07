package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("What would you like the largerst number of your array to be? (Enter an integer)");
		int n = in.nextInt();
		boolean [] sieve= new boolean [n+1];

		for (int i = 2; i < sieve.length ; i++ )
		{
			if (sieve[i] == false)
			{
				for (int j = 2*i; j < sieve.length; j += i)
					//j is looking for the 2, 4, 6 (false values)
				{
					sieve [j]= true;
				}
			}
			
		}
		for (int i=2; i<sieve.length; i++) {
			if (sieve[i]== false) {
				System.out.println( i + " is a" + " prime number");

			}

		}
	}
}