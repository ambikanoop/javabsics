package javabasics;

public class triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double area;
 int perimeter;
 //find semi perimeter then calculate area of the triangle//
int a=4;
int b=5;
int c=3;
int s;
  perimeter=a+b+c;
    s=(a+b+c)/2;
 area= Math.sqrt(s*(s-a)*(s=b)*(s-c));
 
 System.out.println("area of the traingle is:" +area);
 System.out.println("perimeter of the triangle:" +perimeter);
}

	}

	



	


