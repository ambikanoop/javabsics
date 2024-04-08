package day11;

public class indexofanarray {

	
	public static int findIndex (int[]arr,int t) {
		if(arr==null) {
			return -1;
		}
		int len=arr.length;
		int i=0;
		while(i<len) {
			if(arr[i]==t) {
				return i;
				
			}else {
				i=i+1;
			}
		}
		return -1;
		
		}
	public static void main(String[] args) {
		int[] array= {3,4,5,6,7};
		System.out.println("to find the index of 4:"+findIndex(array,4));
	}
}
