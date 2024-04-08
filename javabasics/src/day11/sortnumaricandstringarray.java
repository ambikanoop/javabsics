package day11;

import java.util.Arrays;

public class sortnumaricandstringarray {

	public static void main(String[] args) {
		int array1[]= {3,4,1,7,8,9};
		String array2[]= {"blue","orange","yellow","red"};
		System.out.println("original array1"+Arrays.toString(array1));
		Arrays.sort(array1);
		System.out.println("after sorting"+Arrays.toString(array1));
		System.out.println("original String:"+Arrays.toString(array2));
		Arrays.sort(array2);
		System.out.println("after sorting"+Arrays.toString(array2));
	}

}
