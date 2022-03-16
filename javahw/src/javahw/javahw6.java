package javahw;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class javahw6 {
	public static void main(String[] args) {

		//6-8 (가장 앞에 위치한 요소)
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		System.out.print("요소 수:");
		int e = sc.nextInt();
		int[] a = new int[e];
		int n;
		for(int i=0;i<e;i++) {
			System.out.print("a["+i+"] = ");
			n = sc.nextInt();
			a[i] = n;
		}
		System.out.println("찾을 숫자:");
		int fn = sc.nextInt();
		out:
		for(int i=0;i<e;i++) {
			if(a[i]==fn) {
				System.out.println("그 값은 a["+i+"]에 있습니다.");
				break out;
			}
			if(i==e-1) {
				System.out.println("찾는 값 없음");
			}
		}
		
		//6-8 (가장 뒤에 위치한 요소)
				System.out.print("요소 수:");
				int ee = sc.nextInt();
				int[] aa = new int[ee];
				int nn;
				for(int i=0;i<ee;i++) {
					System.out.print("a["+i+"] = ");
					nn = sc.nextInt();
					aa[i] = nn;
				}
				System.out.print("찾을 숫자:");
				int fnn = sc.nextInt();
				out:
				for(int i=ee-1;i>=0;i--) {
					if(aa[i]==fnn) {
						System.out.println("그 값은 a["+i+"]에 있습니다.");
						break out;
					}
					if(i==0) {
						System.out.println("찾는 숫자가 없습니다. 프로그램을 종료합니다.");						
					}
				}

		 //6-11
		System.out.print("요소 수:");
		int en = sc.nextInt();
		int[] a1 = new int[en];
		for(int i=0;i<en;i++) {
			if(i==0) {
				int r = 1+rd.nextInt(10);  //1~10까지 정수
				a1[i]=r;                   //배열에 대입
				System.out.println("a1["+i+"] ="+a1[i]);				
			}
			else{   				//a1[1] 부터
				int r=rd.nextInt(10)+1;
				while(a1[i-1]==r) {
					r=rd.nextInt(10)+1;
				}
				a1[i]=r;
				System.out.println("a1["+i+"] ="+a1[i]);
			}
		}

		//6-12
		System.out.print("요소 수:");
		int element = sc.nextInt();
		int[] li= new int[element];
		for(int i=0;i<li.length;i++) {
			int rand = rd.nextInt(10)+1;
			li[i]=rand;
			for(int j=0;j<i;j++) {
				if(li[i]==li[j]) {
					i--;
				}
			}
		}
		for(int i=0;i<element;i++) {
			System.out.println("a["+i+"] = "+li[i]);
		}
		
		//6-13
		System.out.print("요소 수:");
		int element_number = sc.nextInt();
		int[] lis= new int[element_number];
		for(int i=0;i<lis.length;i++) {
			int rand = rd.nextInt(10)+1;
			lis[i]=rand;
			for(int j=0;j<i;j++) {
				if(lis[i]==lis[j]) {
					i--;
				}
			}
		}
		for(int i=0;i<element_number;i++) {
			System.out.println("a["+i+"] = "+lis[i]);
		}
		System.out.println("요소를 섞었습니다.");
		for(int i=0;i<element_number;i++) {
			int rand = rd.nextInt(element_number);
			int temp = lis[i];
			lis[i] = lis[rand];
			lis[rand]=temp;
		}
		for(int i=0;i<element_number;i++) {
			System.out.println("a["+i+"] = "+lis[i]);
		}
		
		//6-14
		System.out.print("요소 수:");
		int ele_num = sc.nextInt();
		int[] array= new int[ele_num];
		int[] b = new int[ele_num];
		for(int i=0;i<array.length;i++) {
			int rand = rd.nextInt(10)+1;
			array[i]=rand;
			for(int j=0;j<i;j++) {
				if(array[i]==array[j]) {
					i--;
				}
			}
		}
		for(int i=0;i<ele_num;i++) {
			System.out.println("a["+i+"] = "+array[i]);
		}
		System.out.println("array의 모든 요소를 역순으로 복사했습니다.");
		for(int i=0;i<ele_num;i++) {
			b[ele_num-1-i]=array[i];
		}
		for(int i=0;i<ele_num;i++) {
			System.out.println("b["+i+"] = "+b[i]);
		}
		
				
		
		
		
		
		
	}
}
