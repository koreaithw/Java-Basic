package javahw;

import java.util.Scanner;

public class javahw {
	public static void main(String[] args) {
		// 4-22
		Scanner sc = new Scanner(System.in);
		System.out.print("왼쪽 아래가 직각인 이등변 삼각형을 표시합니다. \n단수는?:");
		int n = sc.nextInt();
		// 왼쪽 아래
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				String str = (j <= i) ? "*" : " ";
				System.out.print(str);
			}
			System.out.println();
		}
		// 왼쪽 위
		System.out.println("왼쪽 위가 직각인 이등변 삼각형을 표시합니다. \n단수는?:"+n);
		for (int i = 0; i < n; i++) {
			for (int j = n - 1; j >= i; j--) {
				String str = (j >= i) ? "*" : " ";
				System.out.print(str);
			}
			System.out.println();
		}
		// 오른쪽 아래
		System.out.println("오른쪽 아래가 직각인 이등변 삼각형을 표시합니다. \n단수는?:"+n);
		for (int i = n - 1; i >= 0; i--) {
			for (int j = 0; j < n; j++) {
				String str = (j >= i) ? "*" : " ";
				System.out.print(str);
			}
			System.out.println();
		}
		// 오른쪽 위
		System.out.println("오른쪽 위가 직각인 이등변 삼각형을 표시합니다. \n단수는?:"+n);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				String str = (j >= i) ? "*" : " ";
				System.out.print(str);
			}
			System.out.println();
		}

		// 4-25
		System.out.print("2이상의 정숫값 :");
		int n1 = sc.nextInt();
		for (int i = 2; i < n1; i++) {
			if (n1 % i == 0) {
				System.out.println("소수가 아닙니다");
				break;
			} else {
				System.out.println("소수입니다.");
				break;
			}
		}

		//4-26
		System.out.print("정수를 더합니다. \n몇 개를 더할까요?:");
		int hm = sc.nextInt();
		int j;
		int c=0;
		int hap=0;
		stop:
		for(int i=0; i<hm;i++) {
			System.out.println("정수(0으로 종료):");
			j=sc.nextInt();
			if(j==0) {
				break stop;
			}
			else {
				hap+=j;
				c++;
			}
		}
		System.out.println("합계는 "+hap+"입니다");
		System.out.println("평균은 "+(hap/c)+"입니다");
		
		//4-27
		System.out.print("정수를 더합니다. \n몇 개를 더할까요?:");
		int input= sc.nextInt();
		int s = 0;
		int integer;
		int count=0;
		out:
		for(int i=0;i<input;i++) {
			if(s<=1000) {
				System.out.print("정수 : ");
				integer = sc.nextInt();
				s+=integer;
				count++;
				if(s>1000) {
					s-=integer;
					count--;
					System.out.println("합계가 1,000을 넘었습니다.\n마지막 값은 무시합니다.");
					break out;
				}
				
			}
			else {
				System.out.println("합계가 1,000을 넘었습니다.\n마지막 값은 무시합니다.");
				break out;
			}
		}
		try {
			System.out.println("합계는"+s+"입니다");
			System.out.println("평균은"+(s/count)+"입니다");
		}catch(Exception e) {
			System.out.println("값이 존재하지 않습니다");
		}
		
		//4-28
		System.out.print("정수를 더합니다. \n몇 개를 더할까요?:");
		int num= sc.nextInt();
		int plus;
		int summation=0;
		int counter=0;
		for(int i=0;i<num;i++) {
			System.out.println("정수 : ");
			plus = sc.nextInt();
			if(plus<0) {
				System.out.println("음수는 더하지 않습니다");
			}
			else {
				summation+=plus;
				counter++;
			}
		}
		try {
			System.out.println("합계는 "+summation+"입니다");
		System.out.println("평균은 "+(summation/counter)+"입니다");
		}catch(Exception e) {
			System.out.println("잘못된 계산입니다.");
		}
		
		
	}
}
