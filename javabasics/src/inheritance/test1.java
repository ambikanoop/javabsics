package inheritance;


 class a{
	 
 
	 int a;
	 int b;
	 
		 public void display() {
			 System.out.println(a+b);
		 }
 }
 class b  extends a  {
	 int x;
	 int y;
	 public void show() {
		 System.out.println(x+y);
	 }
 }
		public class test1{
public static void main(String args[]) {
	/*a b1=new a();
	b1.a=60;
	b1.b=90;
	b1.display();*/
	b ob=new b();
	ob.x=2;
	ob.y=3;
	ob.show();
	ob.a=70;
	ob.b=8;
	ob.display();
	
	
	
	
}}