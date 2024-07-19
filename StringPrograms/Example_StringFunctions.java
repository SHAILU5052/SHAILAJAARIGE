package StringPrograms;

public class Example_StringFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="JavaSelenium";
		int size=str.length();
		System.out.println("Size:"+size);
		char c=str.charAt(4);
		System.out.println(c);
		System.out.println(str.charAt(8));
		
		int index=str.indexOf('e');
		System.out.println(index);
		System.out.println(str.indexOf('a'));
		System.out.println(str.lastIndexOf('a'));
		System.out.println(str.indexOf('a',2));
		
		System.out.println("******************************");
		for (int i=str.length()-1;i>=0;i--) {
			System.out.println(str.charAt(i));
		}
		System.out.println();
		boolean r=str.contains("java");
		System.out.println(r);
		
		r=str.equals("Javaselenium");
		System.out.println(r);
		System.out.println(str.equalsIgnoreCase("javaSeLEmIum"));
		
		String str1="";
		System.out.println(str.isEmpty());
		System.out.println(str1.isEmpty());
		
		String str2=" ";
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		System.out.println(str2.isEmpty());
		System.out.println(str2.isBlank());
		String str3="Shailaja";
		System.out.println(str.toUpperCase());
		System.out.println(str3);
		String str4="JAVASELENIUMClasses";
		String s=str4.toLowerCase();
		System.out.println(s);
		System.out.println(str4);
		 
		String str5="Q u a l i t yThought ";
		System.out.println(str5.trim());
		
		System.out.println();

	}

}
