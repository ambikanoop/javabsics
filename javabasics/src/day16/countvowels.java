package day16;
import java.util.Scanner;
public class countvowels {

	
	
		
		void find()
		{
			int count=0;
			String str1="welcome";
			
			for(int i=0;i<str1.length();i++) {
				char c =str1.charAt(i);
				if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
					count++;
				
				}
			} 
			System.out.println(str1);
		System.out.println("nu of vowels:"+count);
			
		}
		
		public static void main(String[] args) {
			countvowels obj=new countvowels();
	obj.find();
		
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}}