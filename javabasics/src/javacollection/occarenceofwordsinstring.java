package javacollection;

public class occarenceofwordsinstring {

	public static void main(String[] args) {
		String str="IamLerningJava";
int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='A'&& str.charAt(i)<='Z') {
				count++;
			}
		}
		System.out.println(count);
	}

}
