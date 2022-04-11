package javahw;

import java.util.Scanner;

public class test29 {
	
	 public static boolean isUglyNumber(int num) {
	      boolean x = true;  //어글리 넘버인지 맞으면 true
	      while (num != 1) { //2,3,5 만 약수가 나와야하므로
	         if (num % 5 == 0) { //몫을 5로 나눌수 있으면 계속 나눔
	            num /= 5;
	         }
	         else if (num % 3 == 0) { //몫을 3으로 나눌수 있으면 계속 나눔
	            num /= 3;
	         }
	         else if (num % 2 == 0) { //몫을 2로 나눌수 있으면 계속 나눔
	            num /= 2;
	         }
	         else {             //몫을 2,3,5 로 못나누면  어글리넘버아님.
	            x = false;      //false주고 
	            break;          // 반복문 아웃
	         }
	      }
	      return x;             //확인 결과 boolean 값 리턴
	   }
	 public static int nthUglyNumber(int n) { // 어글리넘버와 인덱스값 맞추기
	      int i = 1;						// 인덱스 0 이 1번째 이므로
	      int count = 1;                    // 어글리 넘버 카운팅
	      while (n > count) {				// 원하는 번째 까지 반복
	         i++;							// 1은 바로 출력 2부터 계산
	         if (isUglyNumber(i)) {         // 어글리 넘버인지 확인하는 메소드 생성
	            count++;                    // 맞으면 카운트
	         }
	      }
	      return i;                          
	   }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n값 입력:");
		int n=sc.nextInt();
		int no = nthUglyNumber(n);
	    System.out.println(no);
				
	}
}
