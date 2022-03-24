package javahw;

import java.util.ArrayList;
import java.util.Scanner;

public class javahw11 {
	//7-23
	public static int[] arraySrchIdx(int[] x,int f) {
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		int count=0;
		for (int i = 0; i < x.length; i++) {
			if(x[i]==f) {
				arraylist.add(i);
				System.out.println(i);
				count++;
			}
		}
		int[] a = new int[count];
		for (int i = 0; i < count; i++) {
			a[i] = arraylist.get(i);
		}
		return a;
	}
	//7-24
	public static int[] arrayRmvOf(int[] a, int idx) {
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			arraylist.add(a[i]);
		}
		arraylist.remove(2);
		int[] y = new int[arraylist.size()];
		for (int i = 0; i < y.length; i++) {
			y[i] = arraylist.get(i);
			System.out.println("y["+i+"] = "+y[i]);
		}
		return y;
	}
	
	//7-25
	public static int[] arrayRmvOfN(int[] b,int start,int number) {
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		for (int i = 0; i < b.length; i++) {
			arraylist.add(b[i]);
		}
		
		for (int i = start; i < start+number; i++) {
			arraylist.remove(start);
		}
		int[] y = new int[arraylist.size()];
		for (int i = 0; i < y.length; i++) {
			y[i]=arraylist.get(i);
			System.out.println("y["+i+"] = "+y[i]);
		}
		return y;
	}
	
	//7-26
	public static int[] arrayInsOf(int[] c,int insert,int value) {
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		for (int i = 0; i < c.length; i++) {
			arraylist.add(c[i]);
		}
		arraylist.add(insert, value);
		int[] y = new int[arraylist.size()];
		for (int i = 0; i < y.length; i++) {
			y[i] = arraylist.get(i);
			System.out.println("y["+i+"] = " + y[i]);
		}
		return y;
	}
	
	//7-27
	public static boolean addMatrix(int[][] xx,int[][] yy,int[][] zz) {
		boolean bool;
		System.out.println("행렬 c");
		if((xx.length==yy.length && xx.length==zz.length) &&
				(xx[0].length==yy[0].length && xx[0].length==zz[0].length)) {
			for (int i = 0; i < xx.length; i++) {
				for (int j = 0; j < xx[i].length; j++) {
					zz[i][j]=xx[i][j]+yy[i][j];
					System.out.print(zz[i][j]+" ");
				}
				System.out.println();
			}
			bool=true;
		}else {
			bool = false;
		}
		return bool;
	}
	
	
	public static void main(String[] args) {
		//7-23
		Scanner sc = new Scanner(System.in);
		System.out.print("요소 수:");
		int en = sc.nextInt();
		int[] x = new int[en];
		for (int i = 0; i < x.length; i++) {
			System.out.print("x["+i+"]:");
			x[i] = sc.nextInt();
		}
		System.out.print("탐색할 값:");
		int f = sc.nextInt();
		System.out.println("일치하는 요소의 인덱스 :");
		arraySrchIdx(x,f);
		
		//7-24
		System.out.print("요소 수:");
		int en1 = sc.nextInt();
		int[] a = new int[en1];
		for (int i = 0; i < a.length; i++) {
			System.out.print("x["+i+"]:");
			a[i] = sc.nextInt();
		}
		System.out.print("삭제할 요소의 인덱스:");
		int idx = sc.nextInt();
		arrayRmvOf(a,idx);
		
		//7-25
		System.out.print("요소 수:");
		int en2 = sc.nextInt();
		int[] b = new int[en2];
		for (int i = 0; i < b.length; i++) {
			System.out.print("x["+i+"]:");
			b[i] = sc.nextInt();
		}
		System.out.print("삭제를 시작할 인덱스:");
		int start = sc.nextInt();
		System.out.print("삭제할 요소의 개수:");
		int number = sc.nextInt();
		arrayRmvOfN(b,start,number);
		
		//7-26
		System.out.print("요소 수:");
		int en3 = sc.nextInt();
		int[] c = new int[en3];
		for (int i = 0; i < c.length; i++) {
			System.out.print("x["+i+"]:");
			c[i] = sc.nextInt();
		}
		System.out.print("삽입할 인덱스:");
		int insert = sc.nextInt();
		System.out.print("삽입할 값:");
		int value = sc.nextInt();
		arrayInsOf(c,insert,value);
		
		//7-27
		System.out.println("행렬 a");
		int[][] xx = new int[2][3];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				xx[i][j] = sc.nextInt();
			}
		}
		System.out.println("행렬 b");
		int[][] yy = new int[2][3];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				yy[i][j] = sc.nextInt();
			}
		}
		int[][] zz = new int[2][3];
		addMatrix(xx,yy,zz);
		
		
		
	}
}
