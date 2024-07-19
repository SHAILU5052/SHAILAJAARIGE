package basics;

import java.util.Scanner;
public class Example_Grades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total marks");
		int tot=sc.nextInt();
		
		if(tot>=700) {
			System.out.println("Grade A");
		}else if(tot>=600 && tot<700) {
			System.out.println("Grade B");
		}else if(tot>=500 && tot<600) {
			System.out.println("Grade C");
		}else if(tot<500) {
			System.out.println("grade D Fail");
		}
		
	}

}
