package StringPrograms;

public class Ex_CountRepeatedNumbers {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="thisisjavaseleniumtclasst";
		
		int max=0;
		char x=0;
		for(int i=0;i<str.length();i++) {
			int count=1;
			char c=str.charAt(i);
			if(c!='#') {
				for(int j=i+1;j<str.length();j++) {
					char p=str.charAt(j);
					if(c==p) {
					count=count+1;	
				}	
			}
		}
		System.out.println(c+"-->"+count);
		if(max<=count) {
		//int	a=a+1;
		}
			max=count;
			x=str.charAt(i);
		}
	}
	}	

