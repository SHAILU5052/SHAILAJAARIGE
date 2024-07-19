package basics;

public class Example_DuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x= {12,39,30,23,12,40,23,39,44};
		
		for(int i=0;i<x.length;i++) {
			
			int count =1;	
		for(int j=i+1;j<x.length;j++) {
			if(x[i]==x[j]) {
				count=count+1;
			}
			}
		if(count>1) {
			System.out.println(x[i]);
		}
		}
	}

}
