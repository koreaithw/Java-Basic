package pm;

public class Exam5_1 {
	public static void main(String[] args) {
//		메서드 오버 라이딩 method overriding
//		부모 클래스에게 상속받은 메서드와 동일한 이름의 메서드를 재 정의 하는것.
//		1. 부모 클래스의 메서드와 타입과 갯수가 동일해야 한다.
//		2. 부모 클래스의 메서드 보다 접근 지정자의 범위가 같거나 넓어야한다.
		
//		class A{
//			void print() {
//				System.out.println("A클래스");
//			}
//		}
//		class B extends A{
//			void print() {
//				System.out.println("print overriding");
//			}
//		}
//		class C extends B{}
//		class D extends B{}
//		
//		오버라이딩을 덮어쓰기라고 표현은 했지만 사실 차이가 있다.
//		덮어쓰기는 이전 내용이 완전히 삭제되고 새로운 내용으로 바뀌는 개념이지만
//		오버라이딩은 이전 print() 메서드 위에 새로운 메서드가 올라타는 개념이다.
//		따라서 둘다 불러 올 수 있다.
		X x = new X();
		X y = new Y();
		X z = new Z();
		X t = new T();
		
//		모든 객체를 부모 타입 한가지로 선언하면 배열로 한번에 관리할 수 있는 장점이있다.
		X[] alpha = new X[] {x,y,z,t};
		for(X e: alpha) {
			e.print();
		}
		
	}
}


class X{
	void print() {
		System.out.println("X 클래스");
	}
}
class Y extends X{
	void print() {
		System.out.println("Y 클래스");
	}
}

class Z extends Y {
	void print() {
		System.out.println("Z 클래스");
	}
}
class T extends Y{
	void print() {
		System.out.println("T 클래스");
	}
}
