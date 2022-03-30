package javahw;

import java.util.Scanner;

public class javahw23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이트의 위치를 입력하세요(열,행순)");
		String location = sc.nextLine();//나이트의 위치를 입력받음
		int x = location.charAt(1)-'0'; //열 행순이므로 열의 위치를 Integer형태로 바꿔줌
		int y = location.charAt(0)-'a'+1; //열 행순이므로 행의 위치를 Integer형태로 바꿔줌
		int[] dx = {-1, -2, -2, -1, 1, 2, 2, 1}; //나이트의 위치에서 갈수있는 방향 쌍으로 배열로 저장
		int[] dy = {-2, -1,  1,  2,-2,-1, 1, 2}; //(dx,dy)쌍으로 찾아야함으로 인덱스 맞춰주기 
		int count=0;                             //위치가 가능하면 count
		for (int i = 0; i < 8; i++) {            
			int row = x+dx[i];					//찾을 위치로 x값이동
			int column = y+dy[i];               //찾을 위치로 y값이동
			if((row>=1 && row<=8)&&(column>=1&&column<=8)) { //값이 8*8 안에 있으면 count
				count++;
			}
			
		}
		System.out.println(count);  //출력
	}
}
