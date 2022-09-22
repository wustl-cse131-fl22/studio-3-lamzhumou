package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("What is the highest number you want to consider?");
		int n = in.nextInt ();

		int[] numbers = new int[n];	
		
		for (int i = 0; i < n; i++)
		{
			numbers[i] = i+1;
			
		System.out.println(numbers[i]);
		}
		


	}

}
