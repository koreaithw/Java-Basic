package javahw;

import java.util.Random;
import java.util.Scanner;

public class javahw22 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);  //사용자 입력값 사용
		Random rd = new Random();             //공간의 크기가 랜덤이므로 사용
		
		int size = rd.nextInt(100)+1;         //1<=공간의 크기<=100
		System.out.println("공간의 크기는 : "+size+" * "+size+" 입니다");
		System.out.print("이동 횟수를 정하시오 : ");  
		int m = sc.nextInt();
		
		System.out.print("이동 횟수만큼 이동 계획을 쓰시오 : ");
		sc.nextLine();  //nextInt() or next()메서드를 사용한 후에 nextLine()메서드를 
						//사용할때 nextLine()메서드를 한번더 임의로 호출 해줘야 사용가능
		String[] move = sc.nextLine().split(" ");//공백을 기준으로 이동계획 받기
		if(move.length!=m) {	//이동할 횟수보다 적거나 많이 계획하면 다시 받음.
			while(move.length!=m) {
				System.out.println("이동 횟수만큼 이동 계획을 쓰세요!");
				move = sc.nextLine().split(" ");
			}
		}
		
		int x = 1; //시작점의 x좌표
		int y = 1; //시작점의 y좌표
		
		for (int i = 0; i < m; i++) {
			if (move[i].equals("R") && x != size) { //x값이 오른쪽으로 움직일때 공간의 크기를 벗어나지 않는 조건
				x += 1;
			} else if (move[i].equals("L") && x != 1) { //x값이 왼쪽으로 움직일때 공간의 크기를 벗어나지 않는 조건
				x -= 1;
			} else if (move[i].equals("U") && y != 1) { //y값이 위쪽으로 움직일때 공간의 크기를 벗어나지 않는 조건
				y -= 1;
			} else if (move[i].equals("D") && y != size) { //y값이 아래쪽으로 움직일때 공간의 크기를 벗어나지 않는 조건
				y += 1;
			}
		}
		System.out.println("x,y = ("+x+","+y+")"); //x와 y의 좌표값 출력
		
		
		
		
		
	}
}
