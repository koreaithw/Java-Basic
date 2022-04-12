package javahw;

import java.util.Scanner;

public class javahw30 {
	
	public static void change(String[] str_a, String[] str_b) {
		//a배열에서 최소값 찾기
		int min=Integer.valueOf(str_a[0]); //편의상 제일 처음값을 최소값으로 초기화
		int minindex =0;                   //최소값의 인덱스 번호
		for (int i = 0; i < str_a.length; i++) {
			if(Integer.valueOf(str_a[i])<min) { 
				min = Integer.valueOf(str_a[i]); //최소값보다 작은수 있으면 그것을 최소값으로정함
				minindex=i;				// 그것의 인덱스 값도 함께 변경
			}
		}
		//b배열에서 최대값 찾기
		int max=Integer.valueOf(str_b[0]);  //편의상 제일 처음값을 최대값으로 초기화
		int maxindex =0;                     //최대값의 인덱스 번호
		for (int i = 0; i < str_b.length; i++) {
			if(Integer.valueOf(str_b[i])>max) {
				max = Integer.valueOf(str_b[i]); //최대값보다 큰수 있으면 그것을 최대값으로정함
				maxindex=i; 					// 그것의 인덱스 값도 함께 변경
			}
		}
		//두 배열의 값 교환.
		String temp=str_a[minindex];  
		str_a[minindex] = str_b[maxindex];
		str_b[maxindex] = temp;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("n, k의 값을 순서대로 입력하세요");
		String[] nk = sc.nextLine().split(" "); //공백을 기준으로 n과 k값 저장
		int n = Integer.valueOf(nk[0]);         //스트링으로 받았으므로 정수로 바꿔서 저장
		int k = Integer.valueOf(nk[1]);
		System.out.println("각 배열의 원소들을 n개씩 입력하세요:");
		System.out.print("배열 a: ");
		String[] str_a = sc.nextLine().split(" "); //각 배열의 원소들을 공백을 기준으로 저장.
		System.out.print("배열 b: ");
		String[] str_b = sc.nextLine().split(" ");
		for (int i = 0; i < k; i++) {
			change(str_a,str_b);					//k번 바꿔치기 연산
		}
		int sum=0;                             //원소들의 값을 더해주기 위해 변수생성 및 초기화
		for (int i = 0; i < str_a.length; i++) {
			sum+=Integer.valueOf(str_a[i]);    //String 값이므로 정수로 변환해서 더함
		}
		System.out.println(sum);  			 //출력
	}
}

