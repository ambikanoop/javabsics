package javacollection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class hashMap1 {

	public static void main(String[] args) {
		//HashMap m=new HashMap();
		HashMap<Integer,String> m=new HashMap<Integer,String>();
		m.put(100, "ambika");
		m.put(200,"akshadha" );
		m.put(300, "anushka");
		m.put(400, "anoop");
		//m.put(300, "x");
		System.out.println(m);
		m.get(100);
		System.out.println(m.get(100));
		System.out.println(m.remove(400));
		System.out.println(m);
		System.out.println(m.containsValue("anoop"));
		System.out.println(m.containsKey(300));
System.out.println(m.isEmpty());
System.out.println(m.keySet());//all the keys
for(Object i:m.keySet()) {
	System.out.println(i);
}
System.out.println(m.values());//returns all values
for(Object r:m.values()) {
	System.out.println(r);
}
for(Object y:m.keySet()) {
	System.out.println(y+"   "+m.get(y));
}
//entry interface method
for(Map.Entry entry:m.entrySet()) {
	System.out.println(entry.getKey()+"   "+entry.getValue());
}
//iterator()
Set s=m.entrySet();

Iterator itr=s.iterator();
while(itr.hasNext()) {
	Map.Entry entry=(Entry)itr.next();
	System.out.println(entry.getKey()+"   "+entry.getValue());
}
//System.out.println(m.entrySet());//returns all the entries as set object

	}

}
