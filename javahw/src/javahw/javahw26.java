package javahw;

import java.util.Scanner;

public class javahw26 {
	static int n,m;
	static int[][] maze;
	static int count=0;
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.print("N : ");
		n = sc.nextInt();
		System.out.print("M : ");
		m = sc.nextInt();
		sc.nextLine();
		
		maze = new int[n][m];
		for (int i = 0; i < n; i++) {
			String str = sc.nextLine();
			for (int j = 0; j < m; j++) {
				maze[i][j] = str.charAt(j)-'0';
			}
		}
		road(0,0);
		System.out.println(count);
	}
	
	public static boolean road(int x, int y) {
		System.out.println("(x,y)="+x+","+y);
		
		if((x<0 || x>=m) || (y<0 || y>=n)) { //공간을 벗어난경우 무시.
			System.out.println("벗어난값입니다");
			return false;
		}
		if(maze[y][x]==1) { //공간에 1이있는 경우 상하좌우 순으로 움직임.
			count++;
			maze[y][x]=2;

			System.out.println("상실행");
			road(x,y-1); //상
			System.out.println("하 실행");
			road(x,y+1); //하
			System.out.println("좌 실행");
			road(x-1,y); //좌
			System.out.println("우 실행");
			road(x+1,y); //우


			return true;

		}else if(y==n-1 && x==m-1){
			count++;
			return true;
		}
		return false;
		
	}
}

