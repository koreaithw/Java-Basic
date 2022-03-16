package javahw;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class javahw6 {
	public static void main(String[] args) {

		// 6-8
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
//		System.out.print("요소 수:");
//		int e = sc.nextInt();
//		int[] a = new int[e];
//		int n;
//		for(int i=0;i<e;i++) {
//			System.out.print("a["+i+"] = ");
//			n = sc.nextInt();
//			a[i] = n;
//		}
//		System.out.println("찾을 숫자:");
//		int fn = sc.nextInt();
//		for(int i=0;i<e;i++) {
//			if(a[i]==fn) {
//				System.out.println("그 값은 a["+i+"]에 있습니다.");
//				break;
//			}
//			else {
//				System.out.println("찾는 숫자가 없습니다. 프로그램을 종료합니다.");
//			}
//		}

		// 6-11
//		System.out.print("요소 수:");
//		int en = sc.nextInt();
//		int[] a1 = new int[en];
//		for(int i=0;i<en;i++) {
//			if(i==0) {
//				int r = 1+rd.nextInt(10);  //1~10까지 정수
//				a1[i]=r;                   //배열에 대입
//				System.out.println("a1["+i+"] ="+a1[i]);				
//			}
//			else{   				//a1[1] 부터
//				int r=rd.nextInt(10)+1;
//				while(a1[i-1]==r) {
//					r=rd.nextInt(10)+1;
//				}
//				a1[i]=r;
//				System.out.println("a1["+i+"] ="+a1[i]);
//			}
//		}

		//6-12
//		System.out.print("요소 수:");
//		int element = sc.nextInt();
//		int[] li= new int[element];
//		for(int i=0;i<li.length;i++) {
//			if(i==0) {
//				int rand = rd.nextInt(10)+1;
//				li[i]=rand;				
//			}
//			if(i>0) {	//i=2
//				int rand = rd.nextInt(10)+1;
//				for(int j=0;j<i;j++) {
//					
//				}
//			}
//		}
	int[] a = new int[3];
	int r;
	for(int i=0;i<a.length;i++) {
		r= rd.nextInt(3);
		a[i]=r;
		
	}
	System.out.println(Arrays.toString(a));
		
		
		
		
		
	}
}
