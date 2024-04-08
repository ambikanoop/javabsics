package Assignmenthackthon;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class uniquewordinstring {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter thr string");
         String s=sc.nextLine();
         HashMap<String,Integer> m1=new HashMap<String,Integer>();
         String[]w=s.split(" ");
         for(String w1:w) {
        	 if(m1.containsKey(w1)) {
        		m1.put(w1, m1.get(w1)+1); 
        	 }
        	 else  
        		 m1.put(w1, 1);
        	 }
         for(Entry<String, Integer> entry: m1.entrySet()) {
        	 if(entry.getValue()==1)
        		 System.out.println(entry.getKey());
        	 
         }

         
         
}
}