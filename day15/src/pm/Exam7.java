package pm;

import java.util.ArrayList;
import java.util.LinkedList;

public class Exam7 {
	public static void main(String[] args) {
//		ArrayList 와 LinkedList 성능 비고(추가/삭제/검색)
		ArrayList aList = new ArrayList();
		LinkedList linkedList = new LinkedList();

		long startTime = 0;
		long endTime = 0;
		//추가
		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			aList.add(0,i);
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 추가시간 ="+(endTime-startTime)/10000+"ns");
		
		
		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			linkedList.add(0,i);
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 추가시간 ="+(endTime-startTime)/10000+"ns");
		
		//검색
		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			aList.get(i);
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 검색시간 ="+(endTime-startTime)/10000+"ns");
		
		
		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			linkedList.get(i);
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 검색시간 ="+(endTime-startTime)/10000+"ns");
		
		//삭제
		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			aList.remove(0);
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 삭제시간 ="+(endTime-startTime)/10000+"ns");
		
		
		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			linkedList.remove(0);
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 삭제시간 ="+(endTime-startTime)/10000+"ns");
	}
}
