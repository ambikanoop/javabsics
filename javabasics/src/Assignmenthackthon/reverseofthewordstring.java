package Assignmenthackthon;

public class reverseofthewordstring {

	public static void main(String[] args) {
		String s="java Code";
String array[]=s.split(" ");
for(int i=array.length-1;i>=0;i--) {
	System.out.print(array[i]+" ");
}
	}

}
