package test;

public class ArrMerge {
	public static void main(String[] args) {
		int []arr1 = {4,5,6,7,8};
		int []arr2 = {1,2,3,4};
		int n = arr1.length+arr2.length;
		int []sort = new int[n];
		for(int i = 0; i<arr2.length; i++) {
			sort[i]=arr2[i];
		}
		for(int i = 0; i<arr1.length; i++) {
			sort[arr2.length+i]=arr1[i];
		}
		for(int i:sort) {
			System.out.print(" "+i);
		}
	}

}
