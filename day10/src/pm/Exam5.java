package pm;

public class Exam5 {
	public static void main(String[] args) {
//		final method 와 final calss
/*
 *  final 변수는 변수가 저장된 값이 최종값의 의미를 가진 것처럼 final메서드와 final 클래스도 
 *  각각 최종 메서드 최종 클래스의 의미를 갖는다.
 *  최종 메서드의 의미는 ... 상속할 때 부모의 메서드를 오버라이딩하면 자식클래스에서는 
 *  메서드의 기능이 변경된다. final 메서드는 메서드의 기능을 변경 할 수 없는 메서드
 *  즉, 메서드를 final 선언하면 자식 클래스에서 해당 메서드를 오버라이딩 할 수 없다.
 *  
*/
//		final method 경우-------------
//		class A{
//			void abc() {}
//			final void bcd() {}
//		}
//		class B extends A{
//			void abc() {}    ---->부모의 abc()메서드를 오버라이딩
//			void bcd() {}    ---->에러발생 불가능. 오버라이딩 할 부모의 메서드에 final 이 걸려있다.
//		}
//		----------------------------
//		final class 경우-------------
//		final class AA{}
//		class BB extends AA{}  -----> final 선언 클래스는 상속불가능
//		
//		총정리 
//		final 변수는 값 변경 불가
//		final 메서드는 오버라이딩 불가
//		final 클래스는 상속불가
	}
}
