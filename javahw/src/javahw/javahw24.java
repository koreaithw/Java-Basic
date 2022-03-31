package javahw;


import java.util.*;

public class javahw24 {
	static int n, m;
	static int[][]  icefeild = new int[100][100];
	public static boolean checking(int x,int y) {
		if(x<0 || x>=n || y<0 || y>=m) { //범위를 벗어나면 false반환
			return false;
		}
		//0이면 체크->1로 바꾸면서 지역을 없앰
		if(icefeild[x][y]==0) {        //값이 0일때만 동작
			icefeild[x][y]=1;
			//하면 모두 체크하면서 없앰.
			checking(x-1,y);
			checking(x+1,y);
			checking(x,y-1);
			checking(x,y+1);
			return true;
		}
		return false;                  //값이 1이면 false반환
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("행 갯수입력 : ");
		n=sc.nextInt();
		System.out.print("열 갯수입력 : ");
		m=sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < n; i++) {
			System.out.print("틀입력 : ");
			String r = sc.nextLine(); //입력받아서  필드에 값저장
			for (int j = 0; j < m; j++) {
				icefeild[i][j] = r.charAt(j)-'0';  //숫자로 변경
			}
		}
		
		int count=0;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if(checking(i,j)) { //함수 호출해서 0이면 계속 주변 체크하고 없을때까지 하고 +1 하고 반환
					count++;
				}
			}
		}
		System.out.println(count); //갯수 출력
	}

	
}
