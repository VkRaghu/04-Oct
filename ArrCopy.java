package test;

public class ArrCopy {
	public static void main(String[] args) {
		int []arr = {1,2,3,9,7,6,5};
		int []arrcopy = new int[arr.length];
		for(int i = 0; i<arr.length;i++) {
			arrcopy[i]=arr[i];
		}
		for(int i : arrcopy) {
			System.out.print(" "+i);
		}
	}

}
