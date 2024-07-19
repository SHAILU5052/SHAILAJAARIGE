package StringPrograms;

public class Example_RetainSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "This is Java Program";
		//  		  marg or Pava JsisihT
		
		String s1 = "";
		String rev="";
		for (int i = str.length()-1; i>=0; i--) {
			rev=rev+str.charAt(i);
		}
		
		System.out.println(rev);
		rev=rev.replace(" ", "");
		System.out.println(rev);
		
		int revSize=rev.length();
		int strSize=str.length();
		int j=0;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)==' ') {
				s1 =s1+" ";
				
			}else {
				s1=s1+rev.charAt(j);
				j++;
			}
		}
		System.out.println(s1);


	}

}
