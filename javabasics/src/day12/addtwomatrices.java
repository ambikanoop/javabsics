package day12;

public class addtwomatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[][]= {{1,2,3},{3,4,5,}};
	int b[][]={{3,4,5},{6,7,8}};
int c [][]=new int[2][3];

for(int i=0;i<=a.length;i++) {
	for(int j=0;j<=b.length;j++) {
	c[i][j]=a[i][j]+b[i][j];
	System.out.print(c[i][j]+" "+"\t");
	
	}
	System.out.println();
}


System.out.println();
	}
 

}




