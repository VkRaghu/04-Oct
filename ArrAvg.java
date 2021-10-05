package test;
import java.util.*;

public class ArrAvg {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		int n = sc.nextInt();
		int []ar = new int[n];
		System.out.println("Enter Array Element : ");
		for(int i = 0; i<ar.length;i++) {
			ar[i] = sc.nextInt();
		}
		sc.close();
		int avg = 0;
		for(int i = 0; i<n;i++) {
			avg = avg + ar[i];
		}
		System.out.println(avg/n);
	}

}
