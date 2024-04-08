package day11;

public class arrayspecificvalue {

	public static void main(String[] args) {
		int a[]= {2,4,5,6,7,8};
		int search_ele=9;
		boolean flag=false;
		
		for(int i=0;i<a.length;i++) {
  //System.out.println(a[i]);
			
		if(search_ele==a[i]) {
			System.out.println("element found");
			flag=true;
			break;
		}
		}
		if(flag==false) {
			System.out.println("element not found");
		}
		}}


