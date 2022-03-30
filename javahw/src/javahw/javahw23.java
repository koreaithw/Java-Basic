package javahw;

import java.util.Scanner;

public class javahw23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이트의 위치를 입력하세요(열,행순)");
		String location = sc.nextLine();
		int x = location.charAt(1)-'0';
		int y = location.charAt(0)-'a'+1;
		int[] dx = {-1, -2, -2, -1, 1, 2, 2, 1};
		int[] dy = {-2, -1,  1,  2,-2,-1, 1, 2};
		int count=0;
		for (int i = 0; i < 8; i++) {
			int row = x+dx[i];
			int column = y+dy[i];
			if((row>=1 && row<=8)&&(column>=1&&column<=8)) {
				count++;
			}
			
		}
		System.out.println(count);
	}
}
