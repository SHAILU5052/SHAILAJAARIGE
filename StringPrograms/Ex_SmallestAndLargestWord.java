package StringPrograms;

public class Ex_SmallestAndLargestWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s2="Principal madam and mom are good friendsforever";
		int max=0;
		
		 String[] s = s2.split(" ");
		 int min=s[0].length();
		 for(int i=0;i<s.length;i++) {
			 if(max<s[i].length()) {
				 max=s[i].length();
			 }
			 if(min>s[i].length()) {
				 min=s[i].length();
			 }
		 }
		System.out.println("Max : "+max);
		System.out.println("Min : "+min);
	}

}
