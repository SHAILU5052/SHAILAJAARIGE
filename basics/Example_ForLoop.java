package basics;

import java.util.Scanner;

public class Example_ForLoop {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=5;i++) {
			for(int j=5;j<=i;j--) {
			//System.out.print(j);
			//System.out.print(i +" "+j);
			System.out.print(j +" ");
		
			}
			//System.out.print("\n");
		}
	}

}
