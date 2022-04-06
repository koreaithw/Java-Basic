package javahw;

import java.util.Arrays;
import java.util.Scanner;

public class javahw27 {
	
	public static void reverseSort(int[] a) {
		for (int i = 0; i < a.length-1; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]<a[j]) {
					int temp = a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		javahw27 j = new javahw27();
		Scanner sc = new Scanner(System.in);
		System.out.print("수열의 갯수:");
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		reverseSort(a);
		for(int e:a) {
			System.out.print(e+" ");
		}
	}
}
