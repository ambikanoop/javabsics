package day11;

public class numberofcharecters {

	public static void main(String[] args) {
		String s1="I Love Java Programming";
		String s2="o";
		String s3=s1.replace(" ","");
	
	
		int count=0;
		
		
		for(int i=0;i<s3.length();i++) {
			
			if(s3.charAt(i)=='o') 
				count++;
		}
			System.out.println("number of o's:"+count);
		}

	}

