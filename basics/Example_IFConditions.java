package basics;

import java.util.Scanner;

public class Example_IFConditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value:");
		int x = sc.nextInt();
		if(x<100) {
			System.out.println("Value is less than 100");
		} else if(x>100) {
			System.out.println("Valued is greater than 100");
		} else {
			System.out.println("value is equals to 100");
		}
		


	}

}
