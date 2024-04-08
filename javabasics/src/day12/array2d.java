package day12;

public class array2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[][][]= {{{2,5,6},{7,8,9},{8,9,10}},{{3,4,5},{9,8,9},{6,7,5}}};
           
/*System.out.println(a[0][1]);
System.out.println("number of rows:"+a.length);
System.out.println("number of colomns:"+a[0].length);*/

for(int i=0;i<a.length;i++) {
	
	for(int j=0;j<a[i].length;j++) {
for(int k=0;k<3;k++)

{
	
	
	System.out.print(a[i][j][k]+" ");
	
	}
System.out.println();
	}

	System.out.println();
	}}}
	
	
	
	
	

/*for(int r[]:a) {
	for(int i:r) {
		System.out.print(i+" ");
		
	}
	System.out.println();*/

