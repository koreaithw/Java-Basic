package javahw;

import java.util.Scanner;

public class javahw32 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("부품의 종류 개수 N개:");
		int n = sc.nextInt();
		sc.nextLine();                         //버퍼 지우기
		String[] _n = sc.nextLine().split(" "); //공백을 기준으로 배열형태로 넣음
		
		System.out.print("손님 문의 종류 개수 M개:");
		int m = sc.nextInt();
		sc.nextLine();

		String[] _m = sc.nextLine().split(" "); //공백을 기준으로 배열형태로 넣음
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if(_m[i].equals(_n[j])) {  //일련번호가 있으면 yes
					System.out.print("yes ");
					break;
				}else {                    //모든 부품을 다 돌아도 없으면 no
					if(j==n-1)             
					System.out.print("no ");
				}
			}
		}
	}
}
