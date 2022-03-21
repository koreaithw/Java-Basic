package javahw;

import java.util.Random;
import java.util.Scanner;

public class javahw8 {
	//7-3
	public static int med(int a,int b, int c) {
		int res;
		if((a>=b && a<=c)||(a<=b && a>=c)) {
			res = a;
		}else if((b>=a && b<=c)||(b<=a && b>=c)) {
			res = b;
		}else {
			res = c;
		}
		return res;
	}
	//7-4
	public static int sumUp(int x) {
		int sum=0;
		for(int i=0;i<=x;i++) {
			sum+=i;
		}
		return sum;
	}
	
	//7-6
	public static void printSeason(int m) {
			if(m==3 || m==4 || m==5) {
				System.out.println("해당 월의 계절은 봄입니다.");
			}else if(m==6 || m==7 || m==8) {
				System.out.println("해당 월의 계절은 여름입니다.");
			}else if(m==9 || m==10 || m==11) {
				System.out.println("해당 월의 계절은 가을입니다.");
			}else if(m==12 || m==1 || m==2) {
				System.out.println("해당 월의 계절은 겨울입니다.");
			}
		}
	
	//7-7
	public static void putChar(char c,int n) {
		 for(int i=0;i<n;i++) {
			 System.out.print(c);
		 }
	}
	public static void putStart(int n) {
		putChar('*',n);
	}
	
	//7-8
	public static int random(int a,int b) {
		Random rd = new Random();
		int r = a+rd.nextInt(b);
		System.out.print("하한값 :"+a);
		System.out.print("상한값 :"+b);
		if(b<=a) {
			r=a;
		}
		return r;
	}
	public static void main(String[] args) {
		//7-3
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 a : ");
		int a = sc.nextInt();
		System.out.print("정수 b : ");
		int b = sc.nextInt();
		System.out.print("정수 c : ");
		int c = sc.nextInt();
		System.out.println(med(a,b,c));
		
		//7-4
		System.out.println("1부터 x까지의 합을 구하자.");
		System.out.print("x의 값:");
		int x = sc.nextInt();
		System.out.println("1부터"+x+"까지의 합은 "+sumUp(x)+"입니다.");
		
		//7-6
		System.out.print("몇 월입니까(1~12)?:");
		int m=sc.nextInt();
		printSeason(m);
		
		//7-7
		System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 표시합니다.");
		System.out.print("단수는 :");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			putStart(i);
			System.out.println();
		}
		
		//7-8
		System.out.println("난수를 생성합니다.");
		random(10,99);
		System.out.println("생성된 난수는 "+random(10,99)+"입니다");
		
		
	}
}

