package basics;

public class Example_Break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 1;

		while(x<=10) {
			System.out.println(x);
			while(x>=5) {
				System.out.println("Welcome");
				if(x>=8) {
					System.out.println("Good bye...");
					break;
				}
				x++;
			}
			x++;
		}


	}

}
