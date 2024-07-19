package basics;

import java.util.Scanner;

public class Example_ReverseOfNumber_palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int x=sc.nextInt();
		int value = x;
		int rev=0;
		while(x>0) {
			int rem = x%10;
			rev = rev*10+rem;
			x=x/10;
		}
		
		System.out.println("Reverse: "+rev);
		if(value==rev) {
			System.out.println("Given number is Palindrome..."+value);
		} else {
			System.out.println("Given number is not a Palindromme..."+value);
		}


	}

}
