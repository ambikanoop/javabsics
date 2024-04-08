package Assignmenthackthon;

public class reverseastring {

	public static void main(String[] args) {
		String s="Java Code";
		//String l=s.replaceAll(" ", "");
		
		String rev="";
			for(int i=s.length()-1;i>=0;i--) {
				rev=rev+s.charAt(i);
				
			}
System.out.println("reverse string is:"+rev);

}
}