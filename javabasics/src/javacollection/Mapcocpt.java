package javacollection;

import java.util.HashMap;
import java.util.Map;

public class Mapcocpt {

	public static void main(String[] args) {
		HashMap<Integer,String> m=new HashMap<Integer,String>();
		m.put(100, "anushka");
		m.put(200, "Akshadha");   //map contains key and value 
		m.put(300, "Anoop");
		m.put(500, "Ambika");  //keys can not duplicate, values can be  duplicated
		m.put(400, "anushka1");
		m.put(null , "aa");
		
		//keys can have one null
		m.get(100);
		System.out.println(m.get(100));
       // for(Object v: m.values()) {
        //	System.out.println(v);
        	
      //  }
        //for(Object r:m.keySet()) {
        //	System.out.println(r);
      //  }
        for(Map.Entry disply:m.entrySet()) {
        	System.out.println(disply.getKey()+"   "+disply.getValue());
        }
        
	}  

}
