package basics;

public class Example_SwapTwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=20;
		int b=30;
		int c=b;
		b=a;
		a=c;
		System.out.println(a);
		System.out.println(b);
		System.out.println("***************************************************");
		
		a=50;
		b=60;
		a=a+b;//50+60=110
		b=a-b;//110-60=50
		a=a-b;//110-50=60
		
		System.out.println(a);
		System.out.println(b);
	
	}

}
