package Assignmenthackthon;

import java.util.ArrayList;
import java.util.Iterator;

public class iterator {

	public static void main(String[] args) {
		ArrayList names = new ArrayList();
	    names.add("a");
	    names.add("b");
	    names.add("c");
	 
	    Iterator it = names.iterator();
	 
	    while(it.hasNext()) {
	      String obj = (String)it.next();
	      System.out.println(obj);
	    }
	  }
	 
	
	}


