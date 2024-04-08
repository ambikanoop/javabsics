package javacollection;

import java.util.HashMap;
import java.util.Map;

public class student {

	public static void main(String[] args) {
		HashMap<Integer,String> hs=new HashMap<Integer,String>();
		hs.put(100,"ambika");
		hs.put(102, "Asha");
		hs.put(103, "abc");
		hs.put(104, "aaa");
		hs.put(105, "bbb");
		System.out.println(hs);
		
	for(Map.Entry entry:hs.entrySet()) {
		System.out.println(entry.getKey()+"    "+entry.getValue());
		
		}
		

	}

}
