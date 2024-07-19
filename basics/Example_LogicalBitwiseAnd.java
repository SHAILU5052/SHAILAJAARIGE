package basics;

public class Example_LogicalBitwiseAnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 100;
		int b = 20;
		
		if((a<b) && (++a>10)) {
			System.out.println("Welcome");
		} else {
			System.out.println("Good bye...");
		}
		System.out.println(a);
		
		int x = 20;
		int y =30;
		
		if((x<y) || (++x>10)){
			System.out.println("Ramesh");
		}else {
			System.out.println("Suresh");
		}
		System.out.println(x);


	}

}
