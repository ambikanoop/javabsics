package day12;

public class string {

	public static final string Empty = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="welcome";
String s2="to class";
System.out.println(s.length());
System.out.println(s.concat(s2));
s="      welcome    ";
System.out.println(s);
System.out.println(s.trim());
System.out.println(s2.charAt(4));
System.out.println(s2.contains("To"));
System.out.println(s2.contains("to"));
System.out.println(s2.equals("to class"));
System.out.println(s2.equals("To class"));
s="welcome";
System.out.println(s.replace('o', 'i'));
System.out.println(s.replace("welcome", "not welcome"));
System.out.println(s.substring(1, 4));
System.out.println(s.toUpperCase());
	}

}
