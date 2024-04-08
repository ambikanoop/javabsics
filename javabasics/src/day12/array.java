package day12;

public class array {
public static void main(String[] args) {
	  int a[]= {100,200,300,400};
	 /* for(int i=0;i<a.length;i++) {//classic for loop//
	  }*/
	for(int i:a) {   //enhanced for loop to read an array//
		System.out.println(i);
	}
}
}
