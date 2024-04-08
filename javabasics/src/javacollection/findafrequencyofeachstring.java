package javacollection;

import java.util.HashMap;
import java.util.Map;

public class findafrequencyofeachstring {

	//public static void main(String[] args) {
	static void charectorCount(String name) {
		
		// Creating a HashMap containing char as a key and occurrences as  a value
		HashMap<Character, Integer> hs=new HashMap<Character,Integer>();
		 // Converting given string to char array
		char[] strArray= name.toCharArray();
		System.out.println(strArray);
		 // checking each char of strArray
		for(char c:strArray) {
			if(!String.valueOf(c).isBlank()) {
			if(hs.containsKey(c)) {
				// If char is present in hs
                // incrementing it's count by 1
				
				hs.put(c, hs.get(c)+1);
				}else {
					// If char is not present in hs,
	                // putting this char to hs with 1 as it's value
					hs.put(c, 1);
			}}
		} 
		System.out.println(name+"   "+hs);
		
		//Printing the hs
		//for(Map.Entry entry:hs.entrySet()) {
			//System.out.println(entry.getKey()+"   "+entry.getValue());
		}

	
	public static void  main(String[] args) {	
	
	charectorCount("test");
	charectorCount("test java");
	charectorCount("  ");

	}}
	


