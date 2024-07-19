package basics;

import java.util.Scanner; 


public class Example_ReverseOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number series : ");
		int x=sc.nextInt();
		
		int rev=0;
		while(x>0) {
			int rem=x%10;
			rev=rev*10+rem;
			x=x/10;
		}
		System.out.println("reverse of number series :\n" +rev);
	}

}
