package day11;

public class countuppercaselowercase {

	public static void main(String[] args) {
		String s="Hello Java 8";
		int upper=0,lower=0,integer=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='A'&&ch<='Z') 
				upper++;
			else if(ch>='a'&&ch<='z')
				lower++;
			else if(ch>='0'&& ch<='9')
				integer++;
		}
		System.out.println("lowercase count:"+lower);		
System.out.println("uppercase count:"+upper);

System.out.println("number count:"+integer);
	}

}
