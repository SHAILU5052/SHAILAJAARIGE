package StringPrograms;

public class Ex_EachWordPalidrome {
	
	public static void main(String[] args) {
		String s2="Principal madam and mom are good friends";
		String[] str=s2.split(" ");
		
		for (int i=0;i<str.length;i++) {
			String temp="";
			for(int j=str[i].length()-1;j>=0;j--) {
				temp=temp+str[i].charAt(j);
			}
			if(str[i].equals(temp)) {
				System.out.println(str[i]+"  is palindrome");
			}
		}
	
		
	}

}
