package basics;

import java.util.Scanner;

public class Ex_EvenOddPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		int x = sc.nextInt();
		if(x%2==0)
		{
			System.out.println("even");
		}
		else
		{
			System.out.println("odd");
		}
		int count = 0;
		for(int i = 2;i<x;i++)
		{
			if(x%i==0)
			{
				count++;
			}
		}
		if(count==0)
		{
		System.out.println("prime:");
		}

	}

}
