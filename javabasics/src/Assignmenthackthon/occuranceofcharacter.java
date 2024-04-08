package Assignmenthackthon;

import java.util.HashMap;
import java.util.Scanner;

public class occuranceofcharacter {
	
	public static void getcharcount(String name) {
		
		HashMap<Character, Integer> hs=new HashMap<Character,Integer>();
		char strArray[]=name.toCharArray();
		for(char c:strArray) {
			if(!String.valueOf(c).isBlank())
			if(hs.containsKey(c)) {
				hs.put(c, hs.get(c)+1);
				}else {
					hs.put(c, 1);
				}}
		System.out.println(name+":"+hs);
	}
	
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("entet the string");
		String str=sc.nextLine();
	
		getcharcount(str);
		
	}

}
