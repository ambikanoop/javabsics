package javacollection;

import java.util.HashSet;

public class HashSet3 {

	public static void main(String[] args) {
		//union intersection difference
		HashSet<Integer> set1=new HashSet<Integer>();
		set1.add(1);
		set1.add(2);
		set1.add(5);
		set1.add(4);
		System.out.println(set1);
		HashSet<Integer> set2=new HashSet<Integer>();
		set2.add(3);
		set2.add(4);
		set2.add(5);
		System.out.println(set2);
		//union.....unique element from both set
		//set1.addAll(set2);
		//System.out.println("union"+set1);
		//set1.retainAll(set2);
		//System.out.println("intersection"+set1);
		//difference
		//set1.removeAll(set2);
		//System.out.println("difference"+set1);
		//subset
		System.out.println(set1.containsAll(set2));//boolean value
		//System.out.println("subset of set1"+set1);
	
		
		
		

		
	}

}
