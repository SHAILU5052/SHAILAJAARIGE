package basics;

public class Example_Operators {

	public static void main(String[] args) {
		
		int x = 10+20*(3*20/2-10)+200-100;
				//30*(20)+100=700 //BODMAS
		System.out.println(x);
		
		int a =10;
		int b= 20;
		
		int c = ++a + a + a++ + b++ + ++b +b +a + ++a + --b;
			// 11 + 11+11(12)+20(21)+22+22+12+13+21	
		System.out.println(c); // 143
		System.out.println(a); // 13
		System.out.println(b); //21


	}

}
