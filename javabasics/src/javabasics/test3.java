package javabasics;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int array[][]= {{10,18,19},{12,13,14},{15,16,17}};


for (int i=0;i<=2;i++){
	int sum=0;
	for (int j=0;j<=2;j++) 
		sum+=array[i][j];
		System.out.println("sum of the row:"+(i+1)+" "+sum);
		
	
	
}

}

	}
