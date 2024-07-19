package StringPrograms;

public class Ex_CountVowelsConsonanats {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="principal madam and mom are good friends forever";
		char[] vowels= {'a','e','i','o','u','A','E','I','O','U'};
		int vowelsCount=0;
		int consonantsCount=0;
		int flag=1;
		for(int i=0;i<s.length();i++) {
			
			char c=s.charAt(i);
			for(int j=0;j<vowels.length;j++) {
				if(c==vowels[j]) {
					vowelsCount=vowelsCount+1;
					flag=-1;
					break;
				}
			}
			if(flag!=-1) {
				consonantsCount=consonantsCount+1;
			}
		}
		System.out.println("Vowels Count : "+vowelsCount);
		System.out.println("Consonants Count : "+consonantsCount);
	}
}
