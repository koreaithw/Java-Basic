package javahw;

import java.util.Scanner;

public class javahw27 {
	
	public static void reverseSort(int[] a) {  // 내림차순 함수 정의
		for (int i = 0; i < a.length-1; i++) {  // 기준점
			for (int j = i+1; j < a.length; j++) { // 비교대상
				if(a[i]<a[j]) {  // 비교 대상이 크면
					int temp = a[j]; // 앞으로 보냄
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("수열의 갯수:");
		int n = sc.nextInt();
		int[] a = new int[n];                  //수열갯수 만큼 배열 생성
		for (int i = 0; i < a.length; i++) {  // 입력값 수열에 넣음
			a[i] = sc.nextInt();
		}
		reverseSort(a);                  // 내림차순 함수 호출
		for(int e:a) {                    // 결과 공백으로 구분 출력
			System.out.print(e+" ");
		}
	}
}
