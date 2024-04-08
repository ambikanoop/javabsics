package Assignmenthackthon;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
public class duplicatestring {
public static void main(String[] args) {
		duplicatechar("str");
	}
public static void duplicatechar(String str)	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the String");
	str=sc.nextLine();
	if(str==null) {
		System.out.println("string is null");
		return;
		}
	if(str.isEmpty())	{
		System.out.println("string is empty");
		return;
	}
	if(str.length()==1) {
		System.out.println("string lenghth is 1");
		return;
		}
	char[] ch=str.toCharArray();
	HashMap<Character,Integer> hs=new HashMap<Character,Integer>();
	for(Character ch1:ch) {
		if(hs.containsKey(ch1)) {
			hs.put(ch1, hs.get(ch1)+1);
		}else {
			hs.put(ch1, 1);
		}
	}
	Set<Map.Entry<Character,Integer>> entryset=   hs.entrySet();
	for(Map.Entry<Character, Integer> entry:entryset){
		if(entry.getValue()>1 ){
		System.out.println(entry.getKey()+" : "+entry.getValue());	
		}
	}
 }

}
	
	
	

