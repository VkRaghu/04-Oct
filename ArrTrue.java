package test;

public class ArrTrue {
	public static void main(String[] args) {
		int []ar = {1,2,3,1};
		int k = 3;
		boolean flag = false;
		for(int i = 0; i<ar.length; i++) {
			for(int j = i+1; j<ar.length; j++) {
				if((ar[i]==ar[j]) && Math.abs(i-j)<=k) {
					flag = true;
				}
			}
			
		}
		if(flag==true) {
			System.out.println("True");
		}
		else System.out.println("False");
	}

}
