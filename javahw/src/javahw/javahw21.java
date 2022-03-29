package javahw;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class javahw21 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("N,K의 값 : ");
		String[] a = sc.nextLine().split(" ");
		map.put(a[0], a[1]);  //dictionary 형태로 저장
		int n=0;
		for(String key : map.keySet()) {
			n=Integer.valueOf(key);              //key값
		}
		int k = Integer.valueOf(map.get(a[0]));  //value값
		int count=0;
		while(n!=1) {
			if(n%k==0) {
				n = n/k;
				count++;
			}else {
				n -= 1;
				count++;
			}
		}
		System.out.println("최소 횟수 :"+count);
	
		
	}
}

