package StringPrograms;

public class Ex_ConversionCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String str="ThISisJaVaProGrAm";
			String s1=" ";
			for(int i=0;i<str.length();i++) {
				char c=str.charAt(i);
				if(Character.isUpperCase(c)) {
					s1=s1+str.substring(i,i+1).toLowerCase();
				}else if(Character.isLowerCase(c)) {
					s1=s1+str.substring(i,i+1).toUpperCase();
				}
			}
			System.out.println(s1);
	}

}
