package javahw;

import java.util.Random;
import java.util.Scanner;

public class javahw5 {
	public static void main(String[] args) {

		//4-30
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 맞추기 게임 시작! \n0부터 99사이의 숫자를 맞추세요.");
		int rn = rd.nextInt(100);
		int left = 6;
		int count = 1;
		int n;
		out:
		do {
			System.out.print("남은 횟수"+ left+"회, 어떤숫자일까 :");
			n=sc.nextInt();
			if(rn>n) {
				System.out.println("더 큰 숫자입니다");
				count++;
			}
			else if(rn<n) {
				System.out.println("더 작은 숫자 입니다.");
				count++;
			}
			else {
				System.out.println(count+"회만에 맞추었습니다.");
				break out;
			}
			left--;
		}while(left!=0 || rn==n);
		if(left==0)
		System.out.println("더 이상 남은 횟수가 없습니다.");
		System.out.println("정답은 "+rn+"입니다");
		
		//6-1
		double[] d = new double[5];
		for(int i=0;i<d.length;i++) {
			System.out.println("d["+i+"] = "+ d[i]);
		}
		
		//6-2
		int[] a = new int[5];
		for(int i=0;i<a.length;i++) {
			a[i]=a.length-i;
			System.out.println("a["+i+"] = "+a[i]);
		}
		
		//6-3
		double[] dd = new double[5];
		for(int i=0; i<dd.length;i++) {
			dd[i]=Double.valueOf((i+1)+"."+(i+1));
			System.out.println(dd[i]);
		}
		
		//6-6
		System.out.print("요소 수:");
		int en = sc.nextInt();
		int[] e = new int[en];
		for(int i=0;i<en;i++) {
			System.out.print("e["+i+"] = ");
			e[i] = sc.nextInt();
		}
		System.out.print("e = {");
		for(int i=0;i<en;i++) {
			if(i==en-1) {
				System.out.print(e[i]);
			}
			else {
				System.out.print(e[i]+", ");
			}
		}
		System.out.print("}");
		
		
	}
}
