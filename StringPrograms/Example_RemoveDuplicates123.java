package StringPrograms;

public class Example_RemoveDuplicates123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "ihubjavahub";
		String s2 = "qualitythought";


		for (int i = 0; i < s1.length(); i++) {
			int count=1;
			if(s1.charAt(i)!='#') {
				for (int j = i+1; j < s1.length(); j++) {
					if(s1.charAt(i)==s1.charAt(j)) {
						count =count+1;
					}
				}
				if(count>=2) {
					s2 = s2.replace(s1.charAt(i), ' ');
					s2= s2.replaceAll(" ", "");
				}
				s1.replace(s1.charAt(i), '#');	
			}
			
		}
		
		System.out.println(s2);
		
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&");
		String str = "8876";
		int x = 1000+Integer.parseInt(str);
		System.out.println(x);


	}

}
