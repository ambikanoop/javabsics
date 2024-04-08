package day11;

import java.util.Arrays;

public class insertelement {

	public static void main(String[] args) {
		int[] array1= {11,18,17,16,15};
		int index_position=3;
		int new_value=89;
		System.out.println("original array"+ Arrays.toString(array1));
		for(int i=array1.length-1;i>index_position;i--) {
			array1[i]=array1[i-1];
		}
array1[index_position]=new_value;
System.out.println("new array:"+Arrays.toString(array1));
	}

}

