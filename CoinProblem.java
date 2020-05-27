/* We have input values of N and an array Coins 
that holds all of the coins. We use data type 
of long because we want to be able to test 
large values 
without integer overflow*/

import java.io.*;
class CoinProblem { 

	static long getNumberOfWays(long N, long[] Coins) 
	{ 
		// Create the ways array to 1 plus the amount 
		// to stop overflow 
		long[] ways = new long[(int)N + 1]; 

		// Set the first way to 1 because its 0 and 
		// there is 1 way to make 0 with 0 coins 
		ways[0] = 1; 

		// Go through all of the coins 
		for (int i = 0; i < Coins.length; i++) { 

			// Make a comparison to each index value 
			// of ways with the coin value. 
			for (int j = 0; j < ways.length; j++) { 
				if (Coins[i] <= j) { 
	
					// Update the ways array 
					ways[j] += ways[(int)(j - Coins[i])]; 
				} 
			} 
		} 

		// return the value at the Nth position 
		// of the ways array.	 
		return ways[(int)N]; 
	} 

	static void printArray(long[] coins) 
	{ 
		for (long i : coins) 
			System.out.println(i); 
	} 

	public static void main(String args[]) 
	{ 
		BufferedReader br=new BufferedReader(new BufferedReader(System.in));
		long size=Long.parseLong(br.readLine());
		long Coins[] = new long[size]; 
		for(int i=0;i<size;i++)
		{
			Coins[i]=Long.parseLong(br.readLine);
		}

		System.out.println("The Coins Array:"); 
		printArray(Coins); 

		System.out.println("Solution:"); 
		System.out.println(getNumberOfWays(12, Coins)); 
	} 
} 
