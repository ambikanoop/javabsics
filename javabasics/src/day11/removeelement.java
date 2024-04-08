package day11;

import java.util.Arrays;

public class removeelement {

	public static void main(String[] args) {
		
       int originalarray[]= {10,11,12,13,14,15};
       System.out.println(Arrays.toString(originalarray));
       
       int index=1;
       int[] newArray=new int[originalarray.length-1];
       for(int i=0,k=0;i<originalarray.length;i++) {
    	   if(i==index) {
    		   continue;
    	   }
    	  newArray[k++]=originalarray[i];
       }
      
	  System.out.println(Arrays.toString(newArray));
	}}
