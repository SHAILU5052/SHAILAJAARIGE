package StringPrograms;

public class Ex_CountOfUpperLowerNumericSpecial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ThiSiSJavaSeleNium@34progr@m234@tQuality123ThouGhT";
		int upperCount=0;
		int lowerCount=0;
		int numericsCount=0;
		int specialCount=0;
		
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(Character.isUpperCase(c)) {
				upperCount=upperCount+1;
			}else if(Character.isLowerCase(c)) {
				lowerCount=lowerCount+1;
			}else if(Character.isDigit(c)) {
				numericsCount=numericsCount+1;
			}else {
				specialCount=specialCount+1;
			}
		}
		System.out.println("Uppercase Count: " +upperCount);
		System.out.println("Lowercase Count: " +lowerCount);
		System.out.println("Numerics Count: " +numericsCount);
		System.out.println("Special Character Count: " +specialCount);

	}

}
