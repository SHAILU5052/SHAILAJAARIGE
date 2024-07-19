package StringPrograms;

public class Ex_StringFunction2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Java selenium for Automation";
		String s1=str.substring(5);
		System.out.println(s1);
		System.out.println(str.substring(5,16));
		
		String[] s= str.split(" ",3);
		System.out.println(s.length);
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}
		String str1="Shailu";
		String str2="Shailaja";
		System.out.println(str1.concat(str2));
		
		System.out.println("***************************************");
		str="Java selenium at for java Automation";
		int index = str.indexOf("selenium");
		 System.out.println(index);
		 System.out.println(str.indexOf('a',5));
		 System.out.println(str.indexOf("java"));
		 
		 System.out.println(str.indexOf("java",5));
		  
		 System.out.println(str.replace("a","@"));
		 System.out.println(str.replace("Java","Python"));
		 System.out.println(str.replaceFirst("Java","Python"));
		 System.out.println(str.replaceAll("Java","J@v@"));
		 
		 int x=9000;
		 String y="Selenium 9000";
		 boolean b=y.contains(String.valueOf(x));
		 System.out.println(b);
		 
		 double d1=90.876;
		 double d2=89.766;
		 
		 double d3=d1+d2;
		 System.out.println(d3);
		 
		 String p="value:";
		 String w=String.valueOf(d1)+String.valueOf(d2);
		 System.out.println(w);
		 
		 
		 
	}

}
