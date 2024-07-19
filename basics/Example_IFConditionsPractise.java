package basics;

import java.util.Scanner;

public class Example_IFConditionsPractise {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value:");

		int a = sc.nextInt();
		if(a<=100) {
			System.out.println("Suresh");
			if(a<=300) {
				System.out.println("Ramesh");
				if(a<=450) {
					System.out.println("Kamal");
				} else {
					System.out.println("Bond");
				}
				if(a>=200) {
					System.out.println("Rajesh");
					if(a<=300) {
						System.out.println("varun");
					}
				} 
			}else {
				System.out.println("Karan");
				if(a>=200) {
					System.out.println("Arjun");
				}
			}
			System.out.println("Prasad");
		}

	}

}
