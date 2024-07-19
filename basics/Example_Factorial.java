package basics;

import java.util.Scanner;

public class Example_Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter a number");
		int n=sc.nextInt();
		//int x=sc.nextInt();
		
		int fact=1;
				while(n>0) {
					fact=fact*n;
					n=n-1;
				}
				System.out.println("Factorial number:"
				+fact);
				n++;
	}

}
