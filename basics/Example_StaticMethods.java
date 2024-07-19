package basics;

public class Example_StaticMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		add(300, 400);
//		combine("Raja", "Ram");
		evenOrOdd(77);
		evenOrOdd(98);
	}
	
	
	public static void add(int a, int b) {		
		int z = a+b;
		System.out.println("Value is: "+z);
	}
	
	public static void combine(String str1, String str2) {
		String str = str1+" "+str2;
		System.out.println(str);
	}
	
	public static void evenOrOdd(int x) {
		if(x%2==0) {
			System.out.println("Even Number");
		} else {
			System.out.println("odd Number");


	}

	}
}
