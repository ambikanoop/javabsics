package day12;

import java.lang.reflect.Array;
import java.util.Arrays;

public class largestnumberinarray {

	public static void main(String[] args) {
		
	int a[]= {2,4,6,7,9,8};
	int largest=a[0];
	int smallest=a[0];
	for(int i=1;i<a.length;i++) {
	if( a[i]>largest) {
		largest=a[i];
	}
	else if(a[i]<smallest) {
		smallest=a[i];
	}
	}
		
	System.out.println(Arrays.toString(a));
	System.out.println("largest num:"+largest);
	System.out.println(("smallestnum:"+smallest));

	}

}
