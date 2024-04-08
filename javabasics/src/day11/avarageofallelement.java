package day11;

public class avarageofallelement {

	public static void main(String[] args) {
	int a[]= {10,6,8,9,11};
	int length=a.length;
   double avarage;
   int sum=0;
   for(int i=0;i<a.length;i++){
	   sum+=a[i];}
   
	   avarage=sum/length;
	   System.out.println("avarage of an array:"+avarage);
   }

}
