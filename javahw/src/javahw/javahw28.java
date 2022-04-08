package javahw;

import java.util.Scanner;

public class javahw28 {
	public static int PaintingFance(int n, int k) {
		if(n==0) {
			return 0;
		}
		if(n==1) {
			return k;
		}
		int same = k;
		int diff = k*(k-1);
		if(n>=2) {
			int temp=diff;
			same=temp;
			diff=(same+diff)*(k-1);
		}
		return same+diff;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("기둥의 갯수(N):");
		int n = sc.nextInt();
		System.out.print("기둥의 갯수(M):");
		int m = sc.nextInt();
		System.out.println(PaintingFance(n, m));
		
		
	}
}
