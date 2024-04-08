package inheritance;

public class class2child extends class1parent {
	
	public static void main(String[] args) {
		
		
		class2child obj=new class2child();
		
		obj.add(6, 8);
		System.out.println();
	}


public void sub(int i, int j ) {

	int diff=i-j;
	System.out.println(diff);
	
}
public void add(int i,int j,int k) {
	int sum=k+i+j;
	System.out.println(sum);
	
}
public void add(int i,int j) {
	int sum=i+j+20;
	System.out.println(sum);


}}
