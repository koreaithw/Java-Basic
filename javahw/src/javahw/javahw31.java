package javahw;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class javahw31 {
	
	public static List<Integer> ZigzagIterator(List<Integer> v1, List<Integer> v2) {
		List<Integer> al = new ArrayList<Integer>(); //두 리스트를 하나의 리스트로 합치기 위해 생성

		Iterator<Integer> iterv1 = v1.iterator(); //1,2
		Iterator<Integer> iterv2 = v2.iterator(); //3,4,5,6
		
 		if(iterv1.hasNext()) { //v1에 값이 존재하면
 			while(iterv1.hasNext()) { //v1에 값이 없을때까지 반복
 				al.add(iterv1.next()); //값을 제거하며  al에 삽입
 				if(iterv2.hasNext())   //v2에 값이 있으면 
 				al.add(iterv2.next()); // 값을 제거하며  al 에 삽입
 			}
		}
 		if(!iterv1.hasNext()) {   // v1 에 값이 존재하지않으면
 			while(iterv2.hasNext()) { //v2 의 값이 없을때까지 반복
 				al.add(iterv2.next()); // 값을 제거하며 al에 삽입.
 			}
 		}
 		return al; //al 리턴
 		
 		
	}
	public static void main(String[] args) {
		List<Integer> v1 = new ArrayList<>();
		List<Integer> v2 = new ArrayList<>();
		v1.add(1);
		v1.add(2);
		v2.add(3);
		v2.add(4);
		v2.add(5);
		v2.add(6);
		System.out.println(ZigzagIterator(v1,v2));
			
		} 
	}



