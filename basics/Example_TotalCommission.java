package basics;
import java.util.Scanner; 

public class Example_TotalCommission {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter priciple Amount");
		double p= sc.nextDouble();
		System.out.println("Enter tiome in months");
		int t=sc.nextInt();
		double c=0;
		if(t>=12) {
			c=p*0.1;
		}else if(t>=6 && t<12) {
			c=p*0.5;
		}else if(t<6 && p<=50000) {
			c=300;
		}
		double tc=c*t;
		System.out.println("total Commission: "+tc);
	}

}
