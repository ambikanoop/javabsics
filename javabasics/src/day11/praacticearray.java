package day11;

public class praacticearray {

	public static void main(String[] args) {
	/*for(int i=1;i<100;i++) {
		if (i%10==0){
			System.out.println(i);
		}
	}*/
     int []num= {0,1};
     change(num);
     printarray(num);
     
}

	private static void printarray(int[] num) {
		for (int i=0;i<num.length;i++){
			System.out.print(num[i]+" ");
		}
		
	}

	private static void change(int[] num) {
		num[0]=1;
		num[1]=0;
	}
	
}


	
