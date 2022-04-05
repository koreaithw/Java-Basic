package javahw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class test6 {
	public static void main(String[] args) {
		int[] a1 = {7,-5,3,8,-4,11,-19,21};
		int[] a2 = {6,13,-7,0,11,-4,3,-5};
		hset h = new hset();
		System.out.println(Arrays.toString(h.sorting(a1, a2)));
	}
}

class hset{
	HashSet<Integer> hs = new HashSet<Integer>(); //중복을 없에기 위해 해쉬셋 만듬
	
	public void sort(int[] x) {    //오름차순 정렬 함수
		for (int i = 0; i < x.length; i++) {
			for (int j = i+1; j < x.length; j++) {
				if(x[i]>=x[j]) {
					int temp=x[i];
					x[i]=x[j];
					x[j]=temp;
				}
			}
		}
	}
	
	public int[] sorting(int[] a1,int[] a2) { 
		ArrayList<Integer> a3 = new ArrayList<>(); //두 어레이 합치기 위해 arraylist만듬
		for (int i = 0; i < a1.length; i++) {
			a3.add(a1[i]);  //각각 한곳에 몰아넣어줌
		}
		for (int i = 0; i < a2.length; i++) {
			a3.add(a2[i]);  //한곳에 몰아넣어줌
		}
		hs.addAll(a3); // 중복된 값 제거
		a3.clear();    // a3 요소를 전부 제거후
		a3.addAll(hs); // 중복된값 제거된 것을 삽입
		int[] aa = new int[a3.size()];  // 만들어진 어레이리스트 리스트에 삽입
		for (int i = 0; i < a3.size(); i++) {
			aa[i]=a3.get(i);
		}
		sort(aa);  //오름차순 정렬
		
	
		return aa;
	}
}