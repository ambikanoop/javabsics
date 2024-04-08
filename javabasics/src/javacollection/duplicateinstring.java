package javacollection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class duplicateinstring {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the string");
	String str	=sc.nextLine();
	//System.out.println();
		characterCount(str);
		//characterCount("j");
		//characterCount("");

	}


 public static void characterCount(String str) {
	 if(str==null) {
		 System.out.println("null string");
		 return;
		 }
	 if(str.isEmpty()) {
		 System.out.println("string is empty");
		 return;
		  }
	 if(str.length()==1) {
		 System.out.println("length is 1");
		 return;
		 }
	char c[]    =   str.toCharArray();
	HashMap <Character, Integer> hs=new HashMap<Character, Integer>();
	for(Character ch:c) {
		if(hs.containsKey(ch)) {
			hs.put(ch, hs.get(ch)+1);
		}  
		else 
		{
			hs.put(ch, 1);
			
		}
		
	}
	
	Set<Map.Entry<Character,Integer>> entryset=   hs.entrySet();
	for(Map.Entry<Character, Integer> entry:entryset){
		if(entry.getValue()>1 ){
		System.out.println(entry.getKey()+"  "+entry.getValue());	
		}
	}
 }
}