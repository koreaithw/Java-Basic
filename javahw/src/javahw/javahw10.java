package javahw;

import java.util.Arrays;
import java.util.Scanner;

public class javahw10 {
	//7-18
	public static void aryRmv(int[] a,int idx) {
		for(int i=idx;i<a.length;i++) {
			if(i==a.length-1) a[i]=a[i]; else a[i]=a[i+1];
		}
		System.out.println(Arrays.toString(a));
	}
	//7-19
	public static void aryRmv(int[] arrE,int idx2 , int n2) {
		for(int i=idx2;i<idx2+n2;i++) {
			if(i+n2<arrE.length) {
				arrE[i] = arrE[i+n2];				
			}
		}
		System.out.println(Arrays.toString(arrE));
	}
	
	//7-20
	public static void aryIns(int[] b,int idx1,int x) {
		for(int i=b.length-1;i>=idx1;i--) {
			if(i==idx1) b[i]=x; else b[i]=b[i-1];
		}
		System.out.println(Arrays.toString(b));
	}
	
	//7-21
	public static void aryExchange(int[] aa,int[] bb) {
		int c;
		if(aa.length>bb.length) c=bb.length; else c=aa.length;
		for(int i=0;i<c;i++) {
			int temp=aa[i];
			aa[i]=bb[i];
			bb[i]=temp;
		}
	}
	
	
	//7-22
	public static int[] arrayClone(int[] xarray) {
		System.out.println("배열 x를 복사해서 배열 y를 생성했습니다.");
		int[] y = xarray.clone();
		return y;
	}
	
	public static void main(String[] args) {
		//7-18
		Scanner sc = new Scanner(System.in);
		System.out.print("요소 수:");
		int en = sc.nextInt();
		int[] a = new int[en];
		for(int i=0; i<en;i++) {
			System.out.print("a["+i+"]:");
			a[i] = sc.nextInt();
		}
		System.out.print("삭제할 요소의 인덱스:");
		int idx = sc.nextInt();
		aryRmv(a,idx);
		
		//7-19
		System.out.print("요소 수:");
		int ele = sc.nextInt();
		int[] arrE = new int[ele];
		for(int i=0;i<ele;i++) {
			System.out.print("a["+i+"]:");
			arrE[i] = sc.nextInt();
		}
		System.out.print("삭제를 시작할 인덱스:");
		int idx2 = sc.nextInt();
		System.out.print("삭제할 요소의 갯수:");
		int n2 = sc.nextInt();
		System.out.println("aryRmv(arrE"+","+idx2+","+n2+")");
		aryRmv(arrE,idx2,n2);
		
		//7-20
		System.out.print("요소 수:");
		int en1 = sc.nextInt();
		int[] b = new int[en1];
		for(int i=0; i<en1;i++) {
			System.out.print("b["+i+"]:");
			b[i] = sc.nextInt();
		}
		System.out.print("삽입할 요소의 인덱스:");
		int idx1 = sc.nextInt();
		System.out.print("삽입할 값:");
		int x = sc.nextInt();
		aryIns(b,idx1,x);
		
		//7-21
		System.out.print("배열 aa의 요소수 :");
		int aan = sc.nextInt();
		int[] aa = new int[aan];
		for(int i=0;i<aan;i++) {
			System.out.print("a["+i+"]:");
			aa[i]=sc.nextInt();
		}
		System.out.print("배열 bb의 요소수 :");
		int bbn = sc.nextInt();
		int[] bb = new int[bbn];
		for(int i=0;i<bbn;i++) {
			System.out.print("b["+i+"]:");
			bb[i]=sc.nextInt();
		}
		aryExchange(aa,bb);
		System.out.println("배열 a과 b의 전체 요소를 교환했습니다.");
		System.out.println(Arrays.toString(aa));
		System.out.println(Arrays.toString(bb));
		
		//7-22
		System.out.print("요소 수:");
		int xn = sc.nextInt();
		int[] xarray = new int[xn];
		for(int i=0; i<xn;i++) {
			System.out.print("x["+i+"]:");
			xarray[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(arrayClone(xarray)));
	
	
		
	
		
	}
}

