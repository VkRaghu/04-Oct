package test;

public class ArrDelet {
	public static void main(String[] args) {
		int []arr = {1,2,4,5,7};
		int k = 5;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==k) {
				for(int j = i; j<arr.length-1; j++) {
					arr[j]=arr[j+1];
				}
			}
		}
		for(int i = 0; i<arr.length-1;i++) {
			System.out.print(" "+arr[i]);
		}
	}

}
