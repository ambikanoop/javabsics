package day11;

public class reversestring {

	public static void main(String[] args) {
		String s="java";
		String rev="";
		
		
	for(int i=s.length()-1;i>=0;i--) {//3
		rev=rev+s.charAt(i);          //rev=d(3)
	}
	System.out.println(rev);
	}

}
