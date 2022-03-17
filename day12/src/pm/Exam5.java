package pm;

public class Exam5 {
	public static void main(String[] args) {
		
//		예외던지기
//		예외가 발생 했을때 그 위치에서 바로 예외처리를 할 수도 있지만
//		호출한 지점으로 예외를 던질 수도 있다. Throws /Throw
//		
//		예외가 발생 했을때 2가지 해결책은 try-catch를 이용하거나 예외를 던지는 것이다.
//		
//		예외를 던지는 기본 문법
//		리턴타입 메서드면(변수) throws 예외 클래스명{
//			
//		}
//		
//		void abc() {
//				try {
//					bcd(); 에러발생		
//				}
//				catch(Exception e) {
//					
//				}
//		}
//		void bcd() throws 예외 클래스 타입{
//			예외발생을 호출한 지점으로 던지기
//		}
		A a = new A();
		a.abc();
		
		
	}
}
//class A{
//	void abc() {
//		bcd();
//	}
//	void bcd() {
//		try {
//			System.out.println("start");
//			Thread.sleep(1000);
//			System.out.println("stop");
//		}
//		catch(InterruptedException e) {
//			//예외처리 구문
//		}
//	}
//}
//
//2개의 메서드 abc() bcd() 가 있고 bcd() 메서드의 내부에는 예외발생 가능 코드가 포함되어있다.
//Thread.sleep() 는 일반 예외가 발생 할 수도 있기 때문에 메서드 사용을 위해서는
//반드시 예외처리를 해야만 한다. 하지만 bcd()메서드가 직접 예외를 처리하는대신
//자신을 호출한 메서드로 던지게 된다. 즉 예외 처리 의무를 자신을 호출한 메서드로 전가했다
//따라서abc()메서드가 예외를 처리해야만한다,
//
//	왜 Thread.sleep()메서드를 사용하려면 예외처리를 필수로 해줘야 하는지 알아보자.
	
class A{
	void abc() {
		try{
			bcd();
		}catch(InterruptedException e) {
			
		}
	}
	void bcd() throws InterruptedException{// 예외발생을 호출한 abc()메서드 안으로 예외를 던져준다,
		  
			System.out.println("start");
			Thread.sleep(1000);
			System.out.println("stop");
		
	}
}

//예외를 강제로 발생시키기 throw
//예를 들면 int age = -1;  실제는 예외가 아니다. 하지만 경우에 따라 나이는 -1살은 절대 있을수가 없으므로
//강제로 예외 인식이 필요하다,.
//몸무게의 경우에도 500kg는 절대 있을수가 없는 값이므로 예외로 인식시킬 필요가 있다,.
//
//이럴경우 해결방법은 예외 클래스를 직접 정의하여 사용하는 것이다.
//사용자 정의 예외 클래스를 만들어보면 다른 예외들의 동작 메커니즘도 자연스럽게 이해할 수 있을 것이다.

