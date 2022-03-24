package pm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Exam5 {
	public static void main(String[] args) {
//		객체 생성방법
//		정적 컬렉션
//		1. Arrays.asList()  메서드를 사용한 정적 컬렉션 객체 생성
//		List<Integer> aList1 = Arrays.asList(1,2,3,4);  
//		aList1.set(1, 7);
//		aList1.add(5);    // 오류
//		aList1.remove(0); // 오류
//		System.out.println(aList1);
//		
//		동적컬렉션
//		List<Integer> aList1 = new ArrayList<>();
//		List<Integer> aList2 = new ArrayList<Integer>(30);  //(기본크기) 해도되고 안해도되고
//		List<Integer> aList3 = new Vector<>();
//		List<Integer> aList4 = new Vector<Integer>(30);
//		List<Integer> aList5 = new LinkedList<>();
//		List<Integer> aList6 = new LinkedList<>(30); //저장용량 지정 불가.
		
		//ArrayList<E> 클래스의 주요 메서드 활용방법.
		List<Integer> aList1 = new ArrayList<>();
		// 1. add() - 끝에 계속 추가
		aList1.add(3);
		aList1.add(4);
		aList1.add(5);
		System.out.println(aList1.toString());// 컬렉션이기 때문에 메모리의 주소가 나올수도 있어서 배열의 형태로 나타내기 위해 toString()을 기본적으로 사용하자
		// 2. add() - 위치지정삽입
		aList1.add(1, 6);
		System.out.println(aList1.toString());
		// 3. addAll() - 또 다른 리스트를 통째로 넣기
		List<Integer> aList2 = new ArrayList<Integer>();
		aList2.add(100);
		aList2.add(200);
		aList2.addAll(aList1);
		System.out.println(aList2.toString());
		// 4. 3. addAll() - 또 다른 리스트를 위치를 지정하여 통째로 넣기
		List<Integer> aList3 = new ArrayList<Integer>();
		aList3.add(111111);
		aList3.add(222222);
		aList3.addAll(1, aList2);
		System.out.println(aList3.toString());
		// 5. set - 리스트의 지정된 위치의 값을 바꿈.
		aList3.set(1, 5);
		System.out.println(aList3.toString());
		// 6. remove - 리스트의  index 값을 삭제.
		aList3.remove(1);
		System.out.println(aList3.toString());
		// 7. remove - 처음 등장하는 값을 삭제
		aList3.remove(new Integer(222222));
		System.out.println(aList3.toString());
		// 8. removeAll() -원하는 리스트 삭제.
		aList3.removeAll(aList2);
		System.out.println(aList3.toString());
		// 9. clear() -모든 값삭제.
		aList3.clear();
		System.out.println(aList3.toString());
		// 10. isEmpty() - 리스트가 비어있는지 확인
		System.out.println(aList3.isEmpty());
		// 11. size() - 리스트의 배열의 갯수 확인.
		System.out.println(aList3.size());
		// 12. get() - index로 가져오기
		System.out.println(aList2.get(0));
		System.out.println(aList2.get(1));
		System.out.println(aList2.get(2));
		
		for(int i=0;i<aList2.size();i++) {
			System.out.println(i+"번째 :"+aList2.get(i));
		}
	}
}
//  객체 생성방법
//	Arrays.asList() 메서드를 사용한 정적 컬렉션 객체 생성은 내부적으로는 배열을 먼저 생성하고 
//	이것을  List<E>로 래핑wrapping 즉 포장만 해 놓는다.
//	따라서 내부 구조는 배열과 동일하므로 컬렉션 객체 인데도 크기 변경이 불가능 하다.
//	구현클래스로 객체를 생성했을때와 달리 데이터의 추가 삭제가 불가능 해진다.
//	단 크기를 변경하지 않는 데이터의 변경은 가능하다. 따라서 고정된 개수의 데이터를 저장하거나 활용할때 사용된다.
