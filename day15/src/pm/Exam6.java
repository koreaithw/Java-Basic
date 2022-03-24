package pm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Exam6 {
	public static void main(String[] args) {
//		LinkedList 연결리스트
//		List<E>의 모든 공통 특징을 다 가지고 있다.
//		(동질자료, 동적할당, 추가/변경/삭제 동일한 메서드 사용)
//		
//		1. LinkedList<E> 는 객체를 생성할 때 저장 용량을 지정할 수 없다.
//		2. 내부적으로 데이터는 저장하는 방식이 좀 다르다. 모든 데이터가 서로 연결된 형태로 관리된다는 점이다.
		List<Integer> linkedlist1 = new LinkedList<Integer>();
		// 1. add() - 끝에 계속 추가
				linkedlist1.add(3);
				linkedlist1.add(4);
				linkedlist1.add(5);
				System.out.println(linkedlist1.toString());// 컬렉션이기 때문에 메모리의 주소가 나올수도 있어서 배열의 형태로 나타내기 위해 toString()을 기본적으로 사용하자
				// 2. add() - 위치지정삽입
				linkedlist1.add(1, 6);
				System.out.println(linkedlist1.toString());
				// 3. addAll() - 또 다른 리스트를 통째로 넣기
				List<Integer> linkedlist2 = new LinkedList<Integer>();
				linkedlist2.add(100);
				linkedlist2.add(200);
				linkedlist2.addAll(linkedlist1);
				System.out.println(linkedlist2.toString());
				// 4. 3. addAll() - 또 다른 리스트를 위치를 지정하여 통째로 넣기
				List<Integer> linkedlist3 = new LinkedList<Integer>();
				linkedlist3.add(111111);
				linkedlist3.add(222222);
				linkedlist3.addAll(1, linkedlist2);
				System.out.println(linkedlist3.toString());
				// 5. set - 리스트의 지정된 위치의 값을 바꿈.
				linkedlist3.set(1, 5);
				System.out.println(linkedlist3.toString());
				// 6. remove - 리스트의  index 값을 삭제.
				linkedlist3.remove(1);
				System.out.println(linkedlist3.toString());
				// 7. remove - 처음 등장하는 값을 삭제
				linkedlist3.remove(new Integer(222222));
				System.out.println(linkedlist3.toString());
				// 8. removeAll() -원하는 리스트 삭제.
				linkedlist3.removeAll(linkedlist2);
				System.out.println(linkedlist3.toString());
				// 9. clear() -모든 값삭제.
				linkedlist3.clear();
				System.out.println(linkedlist3.toString());
				// 10. isEmpty() - 리스트가 비어있는지 확인
				System.out.println(linkedlist3.isEmpty());
				// 11. size() - 리스트의 배열의 갯수 확인.
				System.out.println(linkedlist3.size());
				// 12. get() - index로 가져오기
				System.out.println(linkedlist2.get(0));
				System.out.println(linkedlist2.get(1));
				System.out.println(linkedlist2.get(2));
				
				for(int i=0;i<linkedlist2.size();i++) {
					System.out.println(i+"번째 :"+linkedlist2.get(i));
				}
	}
}
//만약 7개의 데이터를 가진 ArrayList  에서 2번 인덱스에 데이터를 추가하고자 한다면
//기존 2번 이후의 모든 데이터가 한 칸씩 뒤로 밀려나게 된다. 그러면 밀려나는 모든 데이터의 위치 정보가 모두 수정되어야 
//한다는 것을 의미한다. 만약 데이터가 1000개이고 0번 인덱스에 데이터를 추가하면 1000개의 데이터 위치 정보가
//모두 수정이 되어야한다.
//그러나 LinkedList는 각 원소의 앞뒤정보를 저장하고 있으므로 어딘가에 값이 추가되면 값이 추가된 위치의
//앞뒤 데이터 정보만 수정하면 된다,. 따라서 중간에 데이터를 추가 할 때 속도 차이가 날 것이라는 것을 예상할 수 있다.
//그렇다면 장점만 있을까? LinkedList 는 각 원소가 자신의 인덱스 정보를 갖고 있지는 않다.
//특정 인덱스 위치의 값을 가져오기 위해서는
//앞에서부터 차례로 번호를 세어가면서 인덱스의 위치를 찾아야한다. 반면에 ArrayList는 데이터 자체에 인덱스 번호를
//가지고 있으므로 특정 인덱스 위치ㅌ의 데이터를 빠르게 찾을 수 있다.
//데이터를 추가 또는 삭제 할 때는 LinkedList 가 빠르고 , 데이터를 찾을 때는 ArrayList가 빠르다
//
//				ArrayList			LinkedList
//추가/삭제		느림					빠름
//검색			빠름					느림
//
//0 1 2 3 4 5 6             0 1 2 3 4 5 6 7
//가나다라마바 사                  가나 아다라마 바사
