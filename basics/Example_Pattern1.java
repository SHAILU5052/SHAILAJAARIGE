package basics;

public class Example_Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 1;
		for (int i = 1; i <=5; i++) {			
			int j =5;
			if(count!=3) {
			while(j>=1) {
				System.out.print(j);
				j=j-count;
			}
			System.out.println();
			}
			count = count +1;
			
		}

	}

}
