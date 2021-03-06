package pm;

public class Exam6 {
	public static void main(String[] args) {
//		abstract 추상-구체적이지 않다.
//		abstract method abstract class -
//		중괄호가 없는 메서드, 메서드의 기능이 정의되지 않는다. 그냥; 끝난다.
//		abstract 리턴타입 메서드명();
//		
//		class Animal{
//			void cry() {
//				// 기능 구현안함  --> 추상메서드로 정의하는 것이 효율적이다.
//					         	   추상메서드를 포함하는 클래스는 반드시 추상 클래스로 정의해햐한다
//								   추상클래스도 클래스 이므로 상속도 할 수 있다.
//								   하지만 실제 클래스는 아니기 때문에 객체는 생성 할 수 없다.
//			}		
//		}
//		class Cat extends Animal{
//			void cry() {
//				System.out.println("애옹");
//			}
//		}
//		class Dog extends Animal{
//			void cry() {
//				System.out.println("멍멍");
//			}
//		}
//		Animal animal1 = new Cat();
//		animal1.cry();  애옹
//		Animal animal2 = new Dog();
//		animal2.cry();  멍멍
//		
//	 	다형적 표현을 사용할 때도 cry()메서드를 호출한다.
		
//		추상 메서드 사용의 장점
//		
//		일반 클래스 정의 했을때와 추상 클래스로 정의 했을때.
//		자식클래스에서 cry() 메서드를 오버라이딩 하는 과정에서 만약에 메서드 명에
//		오타가 발생됐다고 가정 했을때.  ex) cRy()
//		이때 일반 클래스를 상속한 자식 클래스에서는 오버라이딩이 아니라 추가로 새로운 메서드를 정의한 결과가 된다.
//		따라서 cry() cRy() 두 개의 메서드가 존재하게 된다. 이런 경우는 객체를 생성하고
//		cry()메서드를 호출해도 아무것도 출력되지 않는다. 부모의 cry()메서드에는 아무것도 정의되지 않았기 때문이다.
//		
//		추상 클래스를 생각해보면... 
//		자식 클래스가 오버라이딩 하려고 하는 과정에서 오타가 발생하면 문법 오류가 발생한다.
//		그 이유는 추상 클래스를 상속하면 추상 메서드도 상속받는다. 즉, 추상 클래스를 상속받는 cat클래스 내부에는
//		추상 메서드가 한 개라도 있으면 해당 클래스는 추상클래스를 일반 메서드로 오버라이딩 하거나 자신을 추상클래스로
//		정의해야한다. 그런데 cat클래스는 오버라이딩 하지 않고 자신을 추상 클래스로 정의하지도 않았으므로 오류가 발생한다.
//		추상클래스를 상속받으면 추상클래스에 정의해 놓은 추상메서드들을 구체화한 클래스를 만들어야만 한다.
//		메서드 오버라이딩을 강제하는 방식으로 생각하자.
//		
//		겨우 오타찾는 정도의 장점이라고 가볍게 볼 수도 있지만 여러사람들이나 여러 회사들이 협업을 하게 되는 경우
//		많은 필요성을 느끼게 될 것이다.
//
//		정리...
//		만약 abc()라는 추상 메서드를 포함하고 있는 추상 클래스가 있을때, 이것을 상속한 모든 자식클래스들
//		내부에는 항상 반드시 abc()메서드가 정의되어 있어야만 한다. 라는 사실을 보장하게 되는 것이다.
		
		Animal cat = new Cat();
		Animal dog = new Dog();
		cat.cry();
		dog.cry();
	}
}

//추상클래스 -- 이름만 적는 클래스 (구체화 하지 않음)
abstract class Animal{	//추상 클래스 선언
	abstract void cry();//추상 메서드 선언	
}
class Cat extends Animal{
	void cry() {
		System.out.println("애옹");
	}
}
class Dog extends Animal{
	void cry() {
		System.out.println("멍멍");
	}
}
