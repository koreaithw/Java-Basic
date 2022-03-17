package javahw;

import java.util.Random;
import java.util.Scanner;

public class javahw7 {
	public static void main(String[] args) {

//		6-15
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		System.out.println("해당 월의 영어 단어를 입력하시오.");
		System.out.println("첫 글자는 대문자, 나머지는 소문자로 입력하세요.");
		int month;
		String s1="";
		String answer="";
		String[] mon = {"January","February","March","April","May","June","July",
						"August","September","October","November","December"};
		int yes=1;
		do {
			month = rd.nextInt(12);
			while(answer==mon[month]) {
				month = rd.nextInt(12);
			}
			answer = mon[month];				
			System.out.print((month+1)+"월 : ");
			s1=sc.next();
			if(s1.equals(answer)) {
				System.out.print("정답입니다. 다시한번? 1...yes/0...no : ");
				yes = sc.nextInt();
			}else {
				while(!s1.equals(answer)) {
					System.out.println("틀렸습니다.");
					System.out.print((month+1)+"월 : ");
					s1=sc.next();
				}
				System.out.print("정답입니다. 다시한번? 1...yes/0...no : ");
				yes=sc.nextInt();
			}
		}while(yes==1);

//		6-16
		System.out.println("요일명을 영어 소문자로 입력하시오.");
		int weeks;
		String s2="";
		String answers="";
		String[] day = {"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
		String[] kday = {"일요일","월요일","화요일","수요일","목요일","금요일","토요일"};
		int yess=1;
		do {
			weeks = rd.nextInt(7);
			while(answers==day[weeks]) {
				weeks = rd.nextInt(7);
			}
			answers = day[weeks];				
			System.out.print(kday[weeks]+":");
			s2=sc.next();
			if(s2.equals(answers)) {
				System.out.print("정답입니다. 다시한번? 1...yes/0...no : ");
				yess = sc.nextInt();
			}else {
				while(!s2.equals(answers)) {
					System.out.println("틀렸습니다.");
					System.out.print(kday[weeks]+":");
					s2=sc.next();
				}
				System.out.print("정답입니다. 다시한번? 1...yes/0...no : ");
				yess=sc.nextInt();
			}
		}while(yess==1);

//		6-18
		int[][] a = new int[4][3];
		int[][] b = new int[3][4];
		int[][] ab = new int[4][4];
		System.out.println("행렬 a의 요소를 입력하세요.");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print("a[" + i + "][" + j + "] : ");
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("행렬 b의 요소를 입력하세요.");
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				System.out.print("b[" + i + "][" + j + "] : ");
				b[i][j] = sc.nextInt();
			}
		}
		System.out.println("행렬 a와 b의 곱");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				int sum = 0;
				for (int k = 0; k < b.length; k++) {
					sum += a[i][k] * b[k][j];
				}
				ab[i][j]=sum;
				System.out.print(ab[i][j]+"  ");
			}
			System.out.println();
		}
		
//		7-1
		System.out.print("정수 x:");
		int x = sc.nextInt();
		System.out.println("signOf(x)는 "+signOf(x)+"입니다");
		
//		7-2
		System.out.print("정수 aa:");
		int aa = sc.nextInt();
		System.out.print("정수 bb:");
		int bb = sc.nextInt();
		System.out.print("정수 cc:");
		int cc = sc.nextInt();
		int m = min(aa,bb,cc);
		System.out.println("최솟값은 "+m+"입니다.");

	}
	//7-1
	public static int signOf(int x) {
		int res;
		if(x>0) {
			res=1;
		}
		else if(x<0) {
			res=-1;
		}
		else {
			res=0;
		}
		return res;
	}
	//7-2
	public static int min(int a,int b,int c) {
		int min;
		if(a<b && a<c){
			min=a;
		}else if(b<c){
			min=b;
		}else {
			min=c;
		}
		return min;
	}
	
}
