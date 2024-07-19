package basics;

public class ThirdTest {
	static int s=900;
	int i=90;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to java world");
		//display();
		add();
		multiple();
		System.out.println(s);
		ThirdTest t1=new ThirdTest();
		System.out.println(t1.i);
		
		boolean b=false;
		System.out.println(b);
		char c='B';
		System.out.println(c);
		byte v=124;
		short h=32767;
		
		
		
		//name();
	}
	
	public  static void add() {
	int x=100, y=200; //z=x+y;
	System.out.println("sum = " +(x+y));
	System.out.println(s);
	//display();
	}
	
	public static void multiple() {
		int x=10, y=20, p=x*y*s;
		System.out.println(p);}
	
	/*public static void display() {
		System.out.println("Display ");
	}
	
	public static void name() {
		System.out.println("swetha");
		System.out.println("shailaja");
		System.out.println("sankeerthana");
	}*/
	
	

}
